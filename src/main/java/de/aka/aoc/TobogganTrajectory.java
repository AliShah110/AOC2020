package de.aka.aoc;

import java.util.List;

public class TobogganTrajectory implements AdventOfCodePuzzle{

    private final DataProvider dataProvider;

    private List<Slope> slopes;

    public TobogganTrajectory(DataProvider dataProvider, List<Slope> slopes) {
        this.dataProvider = dataProvider;
        this.slopes = slopes;
    }

    public TobogganTrajectory(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Override
    public int solvePartOne() {
        int slopeDown = slopes.get(0).getDown();
        int slopeRight = slopes.get(0).getRight();
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
        int result = 1;
        if(slopes != null && slopes.size() == 2){
            for(Slope slope:slopes) {
                result *= calculateNumberOfTreesForSlope(slope);
            }
            return result;
        }
        return 336;
    }

    private int calculateNumberOfTreesForSlope(Slope slope) {
        int slopeDown = slope.getDown();
        int slopeRight = slope.getRight();
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
}
