package de.aka.aoc;

public interface PasswordPolicy {
    boolean checkPassword(String policyCharacter, String password);
}
