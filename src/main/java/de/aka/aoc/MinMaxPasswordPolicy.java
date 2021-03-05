package de.aka.aoc;

public class MinMaxPasswordPolicy implements PasswordPolicy{

    private final String policyString;

    public MinMaxPasswordPolicy(String policyString) {
        this.policyString = policyString;
    }


    public boolean checkPassword(String policyCharacter, String password) {

        char charToBeChecked =  policyCharacter.charAt(0);
        long count = password.chars().filter(ch -> ch == charToBeChecked).count();
        if(getMin() <= count && count <= getMax()){
            return true;
        }
        return false;
    }

    private int getMin() {
        return Integer.valueOf(policyString.split("-")[0]);
    }

    private int getMax(){
        return Integer.valueOf(policyString.split("-")[1]);
    }
}
