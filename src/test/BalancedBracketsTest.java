package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracket() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void openingBracket() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }


    @Test
    public void closingBracket() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }
    @Test
    public void onlyPairBracket() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void reverseOrderBracket() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void notMatchingPairBracket() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Laun[ch]Cod]e"));
    }
    @Test
    public void moreMatchingBracket() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Laun[ch]Cod]e["));
    }
    @Test
    public void curlyBracket() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Laun{ch}Code"));
    }

    @Test
    public void oneCurlyOneSquareBracket() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Laun[ch{Code"));
    }
/*

    @Test
    public void moreBracketsTypes() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Lau()n[ch{Cod][})e"));
    }
*/


}
