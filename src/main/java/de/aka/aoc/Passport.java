package de.aka.aoc;

public class Passport {
    private final String passportData;
    public Passport(String passportData) {
        this.passportData = passportData;
    }

    public boolean isValid() {
        if(invalidExpirationYear()){
            return false;
        }
        return true;
    }

    private boolean invalidExpirationYear() {
        return false;
    }
}
