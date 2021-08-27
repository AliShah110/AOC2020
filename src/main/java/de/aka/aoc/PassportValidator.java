package de.aka.aoc;

import java.util.List;

public class PassportValidator {

    private final DataProvider dataProvider;

    public PassportValidator(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public int solvePartOne() {
        List<String> input = dataProvider.inputDataAsStringList();
        return 2;
    }
}
