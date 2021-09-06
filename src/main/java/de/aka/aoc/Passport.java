package de.aka.aoc;

public class Passport {
    private final String passportData;
    public Passport(String passportData) {
        this.passportData = passportData;
    }

    public boolean isValid() {
        return validExpirationYear() && validHeight();
    }

    private boolean validHeight() {
        return false;
    }

    private boolean validExpirationYear() {
        int expirationYear = getExpirationYear();
        if(expirationYear > 2020 && expirationYear < 2030)
            return true;
        return false;
    }

    private int getExpirationYear() {
        int indexEyr = passportData.indexOf("eyr:");
        if(indexEyr != -1)
            return Integer.parseInt(passportData.substring(indexEyr+4, indexEyr+8));
        return 1900;
    }
}
