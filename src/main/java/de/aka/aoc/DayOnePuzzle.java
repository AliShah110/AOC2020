package de.aka.aoc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DayOnePuzzle implements AdventOfCodePuzzle {

    private List<Integer> inputNumbers;

    @Override
    public int solvePartTwo() {
        int result = 0;
        for(int firstNumber : inputNumbers){
            for(int secondNumber : inputNumbers){
                if(firstNumber+secondNumber > 2020){
                    continue;
                }
                for(int thirdNumber : inputNumbers)
                if(firstNumber+secondNumber+thirdNumber == 2020){
                    result = firstNumber * secondNumber * thirdNumber;
                }
            }
        }
        return result;
    }

    @Override
    public int solvePartOne() {
        int result = 0;
        for(int firstNumber : inputNumbers){
            for(int secondNumber : inputNumbers){
                if(firstNumber+secondNumber == 2020){
                    result = firstNumber * secondNumber;
                }
            }
        }
        return result;
    }

    public void setInputNumbers(String fileName) {
        String url = getClass().getClassLoader().getResource(fileName).getPath();
        try {
            inputNumbers = Files.readAllLines(Paths.get(url)).stream()
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
