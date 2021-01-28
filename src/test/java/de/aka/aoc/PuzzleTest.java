package de.aka.aoc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

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
    @DisplayName("CountValidPasswordsSmallFile")
    void numberOfValidPasswordsSmallFile(){
        DayTwoPuzzle puzzle = new DayTwoPuzzle();
        puzzle.setInputData("dayTwoTest.txt");
        assertEquals(2, puzzle.solvePartOne());
    }

    @Test
    @DisplayName("CountValidPasswords - DayTwoPartOne")
    void numberOfValidPasswordsPartOne(){
        DayTwoPuzzle puzzle = new DayTwoPuzzle();
        puzzle.setInputData("inputDayTwo");
        assertEquals(636, puzzle.solvePartOne());
    }

    @Test
    @DisplayName("CountValidPasswords - DayTwoPartTwo")
    void numberOfValidPasswordsPartTwo(){
        DayTwoPuzzle puzzle = new DayTwoPuzzle();
        puzzle.setInputData("dayTwoTest.txt");
        assertEquals(1, puzzle.solvePartTwo());
    }


}
