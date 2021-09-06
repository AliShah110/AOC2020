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
        int expirationYear = getExpirationYear();
        if(expirationYear < 2020 && expirationYear > 2030)
            return false;
        return true;
    }

    private int getExpirationYear() {
        return 1972;
    }
}
