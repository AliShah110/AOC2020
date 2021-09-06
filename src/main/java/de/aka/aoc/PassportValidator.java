package de.aka.aoc;

import java.util.ArrayList;
import java.util.List;

public class PassportValidator {

    private final DataProvider dataProvider;
    private final List<String> mandatoryFields = List.of("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid");

    public PassportValidator(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public int solvePartOne() {
        List<String> input = formatPassportData();
        int result = 0;
        for (String line : input) {
            if (mandatoryFields.stream().allMatch(s -> line.contains(s + ":")))
                result++;
        }
        return result;
    }

    public int solvePartTwo() {
        List<Passport> passports = getPassportList();

        return 0;
    }

    private List<Passport> getPassportList() {
        List<String> passportLines = formatPassportData();

        List<Passport> result = new ArrayList<Passport>();
        for(String passportData:passportLines)
            result.add(new Passport(passportData));
        return result;
    }

    private List<String> formatPassportData() {
        List<String> inputLines = dataProvider.inputDataAsStringList();
        List<String> passports = new ArrayList<String>();
        for (int index = 0; index < inputLines.size(); index++) {
            String line = "";
            String inputLine = inputLines.get(index);
            while (!inputLine.isEmpty() && index < inputLines.size()) {
                line = line.concat(" " + inputLine);
                if (index++ == inputLines.size() - 1) {
                    index--;
                    break;
                }
                inputLine = inputLines.get(index);
            }
            passports.add(line);
        }
        return passports;
    }
}
