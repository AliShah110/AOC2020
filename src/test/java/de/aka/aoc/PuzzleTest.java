package de.aka.aoc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTest {

    @Test
    @DisplayName("DayOnePartOne")
    void productOfTwoNumbersSumsTo2020(){
        DayOnePuzzle puzzle = new DayOnePuzzle();
        puzzle.setInputNumbers("inputDayOne.txt");
        int result = puzzle.solvePartOne();
        assertEquals(290784,result);
    }

    @Test
    @DisplayName("DayOnePartTwo")
    void productOfThreeNumbersSumsTo2020(){
        DayOnePuzzle puzzle = new DayOnePuzzle();
        puzzle.setInputNumbers("inputDayOne.txt");
        int result = puzzle.solvePartTwo();
        assertEquals(177337980,result);
    }

}
