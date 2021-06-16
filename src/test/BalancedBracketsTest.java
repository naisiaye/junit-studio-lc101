package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    // Test 1
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    // Test 2 Assert that brackets in the correct order, "[]", return true.
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test 3 Asserts that brackets are missing, "test", return false.
    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test"));
    }

    // Test 4 Asserts that a pair of single brackets is around the string, "[test]", return true.
    @Test
    public void singleBracketsAroundStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    // Test 5 Asserts that multiple brackets surround a string, "[[[test]]]", return true.
    @Test
    public void multipleBracketsAroundStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[test]]]"));
    }

    // Test 6 Asserts that left bracket is present and right bracket is missing, "[test", return false.
    @Test
    public void leftBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
    }

    // Test 7 Asserts that right bracket is present and left bracket is missing, "test]", return false.
    @Test
    public void rightBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]"));
    }

    // Test 8 Asserts that brackets are placed in the wrong order, "]test[", return false.
    @Test
    public void rightBracketBeforeLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test["));
    }

    // Test 9 Assert that bracket is place in the middle of string, "te]st", return true.
    @Test
    public void middleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("te[]st"));
    }

    // Test 10 Assert that brackets are both at the beginning of the string, return false.
    @Test
    public void bothBracketsAtBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]test"));
    }

    // Test 11 Assert that brackets are both at the end of the string, return false.
    @Test
    public void bothBracketsAtEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[]"));
    }

    // Test 12
    @Test
    public void singleBracketNoTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // Test 13
    @Test
    public void multipleBracketPairsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Test] test [test test.]"));
    }
}