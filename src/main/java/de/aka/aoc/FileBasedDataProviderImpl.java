package de.aka.aoc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileBasedDataProviderImpl implements DataProvider {


    private final String fileName;

    public FileBasedDataProviderImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<String> inputDataAsStringList() {

        String url = getClass().getClassLoader().getResource(fileName).getPath();
        try {
            return Files.readAllLines(Paths.get(url)).stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public List<Integer> inputDataAsIntegerList() {
        String url = getClass().getClassLoader().getResource(fileName).getPath();
        try {
            return Files.readAllLines(Paths.get(url)).stream()
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
