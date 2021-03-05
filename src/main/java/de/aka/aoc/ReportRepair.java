package de.aka.aoc;

import java.util.List;

public class ReportRepair implements AdventOfCodePuzzle {

    private final DataProvider dataProvider;

    public ReportRepair(DataProvider dataProvider) {

        this.dataProvider = dataProvider;
    }

    @Override
    public int solvePartTwo() {
        List<Integer> inputNumbers = dataProvider.inputDataAsIntegerList();
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
        List<Integer> inputNumbers = dataProvider.inputDataAsIntegerList();
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
}
