package com.main.august.calculator;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Calculatortest {

    public Calculator testCalculatorApp;

    @Before
    public void setUp(){
        testCalculatorApp = new Calculator();
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testSumPositive() {
        int sum = testCalculatorApp.Sum(0, 5);
        assertEquals(5, sum);

        assertEquals(203, testCalculatorApp.Sum(101, 102));

        assertEquals(0, testCalculatorApp.Sum());

        testCalculatorApp.value1 = 5;
        testCalculatorApp.value2 = 10;
        assertEquals(15, testCalculatorApp.Sum());
    }

    @Test
    public void testSumNegative() {    
        int sum = testCalculatorApp.Sum(-5, -20);
        assertEquals(-25, sum);
    }

    @Ignore
    @Test
    public void testLongInputs() {
        String value = testCalculatorApp.calculate("2+3+7+9-5");
        assertEquals("16", value);
    }

    @Test
    public void testmult() {
        Calculator testcalculApp = new Calculator();
        int sum = testcalculApp.Mul(3, 5);
        assertEquals(15, sum);
    }

    @Test
    public void testdiv() {
        int sum = testCalculatorApp.Div(10, 2);
        assertEquals(5, sum);
    }

}
