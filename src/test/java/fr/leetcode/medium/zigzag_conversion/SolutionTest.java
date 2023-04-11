package fr.leetcode.medium.zigzag_conversion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @CsvSource(textBlock = """
            AB,1,AB
            ABC,2,ACB
            A,1,A
            ABC,3,ABC
            PAYPALISHIRIN,2,PYAIHRNAPLSII,
            PAYPALISHIRING,3,PAHNAPLSIIGYIR,
            PAYPALISHIRING,4,PINALSIGYAHRPI,
            PAYPALISHIRING,5,PHASIYIRPLIGAN,
            """)
    void simpleCase(String s, int numRows, String output) {
        var solution = new Solution();
        assertEquals(output, solution.convert(s,numRows));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            4,1,1,5
            4,1,7,11
            4,2,2,4
            4,2,8,10
            5,1,1,7
            5,2,2,6
            5,3,3,5
            """)
    void secondModulo(int numRows, int i, int modulo, int output) {
        var solution = new Solution();
        assertEquals(output, solution.secondModulo(modulo, numRows, i));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            A,2,A
            AB,3,AB
            ABCD,3,ABDC
            ABCDE,3,AEBDC
            """)
    void hardestCase(String s, int numRows, String output) {
        var solution = new Solution();
        assertEquals(output, solution.convert(s,numRows));
    }

    @Test
    void hardestCase5() {
        var solution = new Solution();
        var s = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
        var numRows = 3;
        var output = "Aiosrhem,tseoihartaaeeriwgrlasasnoctaoieplnrmiaodprs,ubroohreunefnttacneedhsmwynihrieto,iheeaalwnefrdutettpntainnwrdvdr.adew,anereqcustbaeeitdcntnlocojmsuuoddis";
        assertEquals(output, solution.convert(s,numRows));
    }
}