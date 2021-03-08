package de.aka.aoc;

import java.util.List;

public class TobogganTrajectory implements AdventOfCodePuzzle{

    private final DataProvider dataProvider;

    public TobogganTrajectory(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Override
    public int solvePartOne() {
        int slopeDown = 1;
        int slopeRight = 3;
        int slopeRightCounter = slopeRight;
        int result = 0;

        List<String> inputData = dataProvider.inputDataAsStringList();
        int numberOfColumns = inputData.get(0).length();
        for(int line=slopeDown; line<inputData.size(); line++){
            char[] row = inputData.get(line).toCharArray();
            if(row[slopeRightCounter%numberOfColumns] == '#'){
                result++;
            }
            slopeRightCounter += slopeRight;
        }

        return result;
    }

    @Override
    public int solvePartTwo() {
        return 0;
    }
}
