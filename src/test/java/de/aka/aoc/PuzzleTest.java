package de.aka.aoc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTest {

    @Nested
    @DisplayName("Day One")
    class ReportRepairTest{
        @Test
        @DisplayName("ReportRepair - DayOnePartOne")
        void productOfTwoNumbersSumsTo2020(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayOne.txt");
            ReportRepair puzzle = new ReportRepair(dataProvider);
            assertEquals(290784,puzzle.solvePartOne());
        }

        @Test
        @DisplayName("Report Repair - DayOnePartTwo")
        void productOfThreeNumbersSumsTo2020(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayOne.txt");
            ReportRepair puzzle = new ReportRepair(dataProvider);
            assertEquals(177337980,puzzle.solvePartTwo());
        }
    }


    @Nested
    @DisplayName("Day Two")
    class PasswordValidatorTest{
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

    @Nested
    @DisplayName("Day Three")
    class TobogganTrajectoryTest{
        @Test
        @DisplayName("TobogganTrajectoryTestFile - DayThreePartOne")
        void numberOfTrees(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("dayThreeTest.txt");
            TobogganTrajectory tobogganTrajectory = new TobogganTrajectory(dataProvider, List.of(new Slope(1,3)));
            assertEquals(7, tobogganTrajectory.solvePartOne());
        }

        @Test
        @DisplayName("Toboggan Trajectory - DayThreePartOne")
        void numberOfTreesPartOne(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayThree.txt");
            TobogganTrajectory tobogganTrajectory = new TobogganTrajectory(dataProvider, List.of(new Slope(1,3)));
            assertEquals(211, tobogganTrajectory.solvePartOne());
        }

        @Test
        @DisplayName("TobogganTrajectoryTwoSlopes - DayThreePartTwo")
        void multiplyNumberOfTreesForTwoSlopes(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("dayThreeTest.txt");
            List<Slope> slopes = List.of(new Slope(1,3), new Slope(1,1));
            TobogganTrajectory tobogganTrajectory = new TobogganTrajectory(dataProvider, slopes);
            assertEquals(14, tobogganTrajectory.solvePartTwo());
        }

        @Test
        @DisplayName("TobogganTrajectoryTestFile - DayThreePartTwo")
        void multiplyNumberOfTreesForAllSlopes(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("dayThreeTest.txt");
            List<Slope> slopes = List.of(new Slope(1,3), new Slope(1,1), new Slope(1, 5), new Slope(1,7), new Slope(2,1));
            TobogganTrajectory tobogganTrajectory = new TobogganTrajectory(dataProvider, slopes);
            assertEquals(336, tobogganTrajectory.solvePartTwo());
        }

        @Test
        @DisplayName("TobogganTrajectory - DayThreePartTwo")
        void multiplyNumberOfTreesForAllSlopesInputFile(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayThree.txt");
            List<Slope> slopes = List.of(new Slope(1,3), new Slope(1,1), new Slope(1, 5), new Slope(1,7), new Slope(2,1));
            TobogganTrajectory tobogganTrajectory = new TobogganTrajectory(dataProvider, slopes);
            assertEquals(3584591857L, tobogganTrajectory.solvePartTwo());
        }
    }

    @Nested
    @DisplayName("Day Four")
    class PassportValidationTest{
        @Test
        @DisplayName("TestFile - DayFourPartOne")
        void twoValidPassports(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("dayFourTest.txt");
            PassportValidator passportValidator = new PassportValidator(dataProvider);
            assertEquals(2, passportValidator.solvePartOne());
        }

        @Test
        @DisplayName("InputFile - DayFourPartOne")
        void numberOfValidPassports(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("inputDayFour.txt");
            PassportValidator passportValidator = new PassportValidator(dataProvider);
            assertEquals(264, passportValidator.solvePartOne());
        }

        @Test
        @DisplayName("TestFile - DayFourPartTwo - Invalid Passports")
        void x(){
            DataProvider dataProvider = new FileBasedDataProviderImpl("dayFourTestInvalid.txt");
            PassportValidator passportValidator = new PassportValidator(dataProvider);
            assertEquals(0, passportValidator.solvePartTwo());
        }
    }


}
