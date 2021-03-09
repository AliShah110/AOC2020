package de.aka.aoc;

import java.util.List;

public class PasswordPhilosophy{


    private final DataProvider dataProvider;

    public PasswordPhilosophy(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public long solvePartOne() {
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

    public long solvePartTwo() {
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
