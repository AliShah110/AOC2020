package de.aka.aoc;

import java.util.List;

public class TobogganTrajectory implements AdventOfCodePuzzle{

    private final DataProvider dataProvider;

    private List<Slope> slopes;

    public TobogganTrajectory(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Override
    public long solvePartOne() {
        return solvePartTwo();
    }

    @Override
    public long solvePartTwo() {
        long result = 1;

        for(Slope slope:slopes) {
            result *= calculateNumberOfTreesForSlope(slope);
        }
        return result;

    }

    private int calculateNumberOfTreesForSlope(Slope slope) {
        int slopeDown = slope.getDown();
        int slopeRight = slope.getRight();
        int slopeRightCounter = slopeRight;
        int result = 0;

        List<String> inputData = dataProvider.inputDataAsStringList();
        int numberOfColumns = inputData.get(0).length();
        for(int line=slopeDown; line<inputData.size(); line = line+slopeDown){
            char[] row = inputData.get(line).toCharArray();
            if(row[slopeRightCounter%numberOfColumns] == '#'){
                result++;
            }
            slopeRightCounter += slopeRight;
        }
        return result;
    }

    public void setSlopes(List<Slope> slopes) {
        this.slopes = slopes;
    }
}
