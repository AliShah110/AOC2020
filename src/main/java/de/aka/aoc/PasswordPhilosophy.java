package de.aka.aoc;

import java.util.List;

public class PasswordPhilosophy implements AdventOfCodePuzzle {


    private final DataProvider dataProvider;

    public PasswordPhilosophy(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }


    @Override
    public int solvePartOne() {
        List<String> inputData = dataProvider.inputDataAsStringList();

        int numberOfValidPwd = 0;
        for(String line : inputData){
            String[] policyAndPw = line.split(" ");

            PasswordPolicy policy = new MinMaxPasswordPolicy(policyAndPw[0]);
            if(policy.checkPassword(policyAndPw[1], policyAndPw[2])){
                numberOfValidPwd++;
            }
        }
        return numberOfValidPwd;
    }

    @Override
    public int solvePartTwo() {
        List<String> inputData = dataProvider.inputDataAsStringList();

        int numberOfValidPwd = 0;
        for(String line : inputData){
            String[] policyAndPw = line.split(" ");

            PasswordPolicy policy = new ExclusivOrPasswordPolicy(policyAndPw[0]);

            if(policy.checkPassword(policyAndPw[1], policyAndPw[2])){
                numberOfValidPwd++;
            }
        }
        return numberOfValidPwd;
    }
}
