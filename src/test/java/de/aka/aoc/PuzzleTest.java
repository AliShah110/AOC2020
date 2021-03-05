package de.aka.aoc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTest {

    @Test
    @DisplayName("ReportRepair - DayOnePartOne")
    void productOfTwoNumbersSumsTo2020(){
        DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayOne.txt");
        ReportRepair puzzle = new ReportRepair(dataProvider);
        int result = puzzle.solvePartOne();
        assertEquals(290784,result);
    }

    @Test
    @DisplayName("Report Repair - DayOnePartTwo")
    void productOfThreeNumbersSumsTo2020(){
        DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayOne.txt");
        ReportRepair puzzle = new ReportRepair(dataProvider);
        int result = puzzle.solvePartTwo();
        assertEquals(177337980,result);
    }

    @Test
    @DisplayName("CountValidPasswordsSmallFile - DayTwoPartOne")
    void numberOfValidPasswordsSmallFile(){
        DataProvider dataProvider = new FileBasedDataProviderImpl("dayTwoTest.txt");
        PasswordPhilosophy puzzle = new PasswordPhilosophy(dataProvider);
        assertEquals(2, puzzle.solvePartOne());
    }

    @Test
    @DisplayName("CountValidPasswords - DayTwoPartOne")
    void numberOfValidPasswordsPartOne(){
        DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayTwo");
        PasswordPhilosophy puzzle = new PasswordPhilosophy(dataProvider);
        assertEquals(636, puzzle.solvePartOne());
    }

    @Test
    @DisplayName("CountValidPasswordsSmallFile - DayTwoPartTwo")
    void numberOfValidPasswordsSmallFilePartTwo(){
        DataProvider dataProvider = new FileBasedDataProviderImpl("dayTwoTest.txt");
        PasswordPhilosophy puzzle = new PasswordPhilosophy(dataProvider);
        assertEquals(1, puzzle.solvePartTwo());
    }

    @Test
    @DisplayName("CountValidPasswords - DayTwoPartTwo")
    void numberOfValidPasswordsPartTwo(){
        DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayTwo");
        PasswordPhilosophy puzzle = new PasswordPhilosophy(dataProvider);
        assertEquals(588, puzzle.solvePartTwo());
    }


}
