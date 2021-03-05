package de.aka.aoc;

public class ExclusivOrPasswordPolicy implements PasswordPolicy {

    private final String policyString;

    public ExclusivOrPasswordPolicy(String policyString) {
        this.policyString = policyString;
    }


    @Override
    public boolean checkPassword(String policyCharacter, String password) {
        char charToBeChecked =  policyCharacter.charAt(0);
        if(password.charAt(firstPosition()) == charToBeChecked ^ password.charAt(secondPosition()) == charToBeChecked)
            return true;
        return false;
    }

    private int firstPosition(){
        return Integer.valueOf(policyString.split("-")[0])-1;
    }

    private int secondPosition(){
        return Integer.valueOf(policyString.split("-")[1])-1;
    }
}
