package de.aka.aoc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordPhilosophy implements AdventOfCodePuzzle {
    private List<String> inputData;

    @Override
    public int solvePartOne() {
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
        return countValidPasswordsPartTwo();
    }

    private int countValidPasswordsPartTwo() {
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

    private int countValidPasswords() {
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
}
