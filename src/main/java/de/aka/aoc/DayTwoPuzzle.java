package de.aka.aoc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DayTwoPuzzle implements AdventOfCodePuzzle {
    private List<String> inputData;

    @Override
    public int solvePartOne() {
        return countValidPasswords();
    }

    @Override
    public int solvePartTwo() {
        return countValidPasswordsPartTwo();
    }

    private int countValidPasswordsPartTwo() {
        return 1;
    }

    public void setInputData(String fileName) {
        String url = getClass().getClassLoader().getResource(fileName).getPath();
        try {
            inputData = Files.readAllLines(Paths.get(url)).stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int countValidPasswords() {
        int numberOfValidPwd = 0;

        for(String line : inputData){
            String[] policyAndPw = line.split(" ");
            int letterAppearanceMin = Integer.valueOf(policyAndPw[0].split("-")[0]);
            int letterAppearanceMax = Integer.valueOf(policyAndPw[0].split("-")[1]);
            String password = policyAndPw[2];
            char policyCharacter =  policyAndPw[1].charAt(0);
            long count = password.chars().filter(ch -> ch == policyCharacter).count();
            if(letterAppearanceMin <= count && count <= letterAppearanceMax){
                numberOfValidPwd++;
            }
        }
        return numberOfValidPwd;
    }
}
