package de.aka.aoc;

import java.util.Optional;

public class Passport {
    private final String passportData;
    public Passport(String passportData) {
        this.passportData = passportData;
    }

    public boolean isValid() {
        return validExpirationYear() && validHeight() && validPassportId();
    }

    private boolean validPassportId() {
        int indexId = passportData.indexOf("pid:");
        if(indexId != -1){
            return passportData.substring(indexId+4, indexId+13).matches("\\d{9}");
        }
        return false;
    }

    private boolean validHeight() {
        String height = getHeightValue();
        if(height.matches("1[5-8][0-9]cm|19[0-3]cm|59in|6[0-9]in|7[0-6]in"))
            return true;
        return false;
    }

    private String getHeightValue() {
        int indexHGT = passportData.indexOf("hgt:");
        if(indexHGT != -1)
            return passportData.substring(indexHGT+4, indexHGT+9);
        return null;
    }

    private boolean validExpirationYear() {
        int expirationYear = getExpirationYear();
        if(expirationYear > 2020 && expirationYear < 2030)
            return true;
        return false;
    }

    //What if not four digits? Exception Handling is missing?
    private int getExpirationYear() {
        int indexEyr = passportData.indexOf("eyr:");
        if(indexEyr != -1)
            return Integer.parseInt(passportData.substring(indexEyr+4, indexEyr+8));
        return 1900;
    }
}
