/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import mypackage.Calc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Paul
 */
public class PostFixCalculatorTests {

    @Test
    @DisplayName("5 4 +")
    void add() {
        Calc c = new Calc();
        c.consumeString("5 4 +");
        assertEquals(9, c.performCalculation());
    }

    @Test
    @DisplayName("6 4 -")
    void sub() {
        Calc c = new Calc();
        c.consumeString("6 4 -");
        assertEquals(2, c.performCalculation());
    }

    @Test
    @DisplayName("100 3 *")
    void mult() {
        Calc c = new Calc();
        c.consumeString("100 3 *");
        assertEquals(300, c.performCalculation());
    }

    @Test
    @DisplayName("321 12 /")
    void div() {
        Calc c = new Calc();
        c.consumeString("321 12 /");
        assertEquals(26, c.performCalculation());
    }

    @Test
    @DisplayName("2 10 ^")
    void pow() {
        Calc c = new Calc();
        c.consumeString("2 10 ^");
        assertEquals(1024, c.performCalculation());
    }

    @Test
    @DisplayName("10 5 + 8 -")
    void addsub() {
        Calc c = new Calc();
        c.consumeString("10 5 + 8 -");
        assertEquals(7, c.performCalculation());
    }

    @Test
    @DisplayName("5 3 6 * -")
    void complex0() {
        Calc c = new Calc();
        c.consumeString("5 3 6 * -");
        assertEquals(-13, c.performCalculation());
    }

    @Test
    @DisplayName("5 4 * 5 - 1 3 / +")
    void complex1() {
        Calc c = new Calc();
        c.consumeString("5 4 * 5 - 1 3 / +");
        assertEquals(15, c.performCalculation());
    }

    @Test
    @DisplayName("3 4 ^ 12 7 * - 9 3 1 + / +")
    void complex2() {
        Calc c = new Calc();
        c.consumeString("3 4 ^ 12 7 * - 9 3 1 + / +");
        assertEquals(-1, c.performCalculation());
    }

    @Test
    @DisplayName("12 3 ^ 40 3 901 20 / - + - 44 +")
    void complex3() {
        Calc c = new Calc();
        c.consumeString("12 3 ^ 40 3 901 20 / - + - 44 +");
        assertEquals(1774, c.performCalculation());
    }

}
