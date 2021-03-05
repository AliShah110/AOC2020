package de.aka.aoc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTest {

    @Test
    @DisplayName("ReportRepair - DayOnePartOne")
    void productOfTwoNumbersSumsTo2020(){
        ReportRepair puzzle = new ReportRepair();
        puzzle.setInputNumbers("inputDayOne.txt");
        int result = puzzle.solvePartOne();
        assertEquals(290784,result);
    }

    @Test
    @DisplayName("Report Repair - DayOnePartTwo")
    void productOfThreeNumbersSumsTo2020(){
        ReportRepair puzzle = new ReportRepair();
        puzzle.setInputNumbers("inputDayOne.txt");
        int result = puzzle.solvePartTwo();
        assertEquals(177337980,result);
    }

    @Test
    @DisplayName("CountValidPasswordsSmallFile - DayTwoPartOne")
    void numberOfValidPasswordsSmallFile(){
        PasswordPhilosophy puzzle = new PasswordPhilosophy();
        puzzle.setInputData("dayTwoTest.txt");
        assertEquals(2, puzzle.solvePartOne());
    }

    @Test
    @DisplayName("CountValidPasswords - DayTwoPartOne")
    void numberOfValidPasswordsPartOne(){
        PasswordPhilosophy puzzle = new PasswordPhilosophy();
        puzzle.setInputData("inputDayTwo");
        assertEquals(636, puzzle.solvePartOne());
    }

    @Test
    @DisplayName("CountValidPasswordsSmallFile - DayTwoPartTwo")
    void numberOfValidPasswordsSmallFilePartTwo(){
        PasswordPhilosophy puzzle = new PasswordPhilosophy();
        puzzle.setInputData("dayTwoTest.txt");
        assertEquals(1, puzzle.solvePartTwo());
    }

    @Test
    @DisplayName("CountValidPasswords - DayTwoPartTwo")
    void numberOfValidPasswordsPartTwo(){
        PasswordPhilosophy puzzle = new PasswordPhilosophy();
        puzzle.setInputData("inputDayTwo");
        assertEquals(588, puzzle.solvePartTwo());
    }


}
