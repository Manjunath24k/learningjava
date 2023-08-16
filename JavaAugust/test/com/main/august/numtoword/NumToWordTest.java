package com.main.august.numtoword;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class NumToWordTest {

    private NumToWord numToWord;

    @Before
    public void setUp(){
        numToWord = new NumToWord();
    }

    @Ignore
    @Test
    public void testConvert_NotSupported() {
        assertEquals("Not yet supported", numToWord.convert(10000));
        assertEquals("Not yet supported", numToWord.convert(100000));
        assertEquals("Not yet supported", numToWord.convert(1000000));
        assertEquals("Not yet supported", numToWord.convert(10000000));
    }


    @Test
    public void testConvert_SingleDigit() {
        
        assertEquals(Words.ZERO, numToWord.convert(0));
        assertEquals("One", numToWord.convert(1));
        assertEquals("Two", numToWord.convert(2));
        assertEquals("Three", numToWord.convert(3));
        assertEquals("Four", numToWord.convert(4));
        assertEquals("Five", numToWord.convert(5));
        assertEquals("Six", numToWord.convert(6));
        assertEquals("Seven", numToWord.convert(7));
        assertEquals("Eight", numToWord.convert(8));
        assertEquals("Nine", numToWord.convert(9));
        
    }

    @Test
    public void testConvert_DoubleLessThanTwenty() {
        
        assertEquals("Ten", numToWord.convert(10));
        assertEquals(Words.ELEVEN, numToWord.convert(11));
        assertEquals(Words.TWELVE, numToWord.convert(12));
        assertEquals(Words.THIRTEEN, numToWord.convert(13));
        assertEquals("Fourteen", numToWord.convert(14));
        assertEquals("Fifteen", numToWord.convert(15));
        assertEquals("Sixteen", numToWord.convert(16));
        assertEquals("Seventeen", numToWord.convert(17));
        assertEquals("Eighteen", numToWord.convert(18));
        assertEquals("Nineteen", numToWord.convert(19));
        assertEquals("Twenty", numToWord.convert(20));
    }

    @Test
    public void testConvert_TensTillHundered() {
        
        assertEquals("Thirty", numToWord.convert(30));
        assertEquals("Fourty", numToWord.convert(40));
        assertEquals("Fifty", numToWord.convert(50));
        assertEquals("Sixty", numToWord.convert(60));
        assertEquals("Seventy", numToWord.convert(70));
        assertEquals("Eighty", numToWord.convert(80));
        assertEquals("Ninty", numToWord.convert(90));
    }

    @Test
    public void testConvert_DoubleDigth() {
        
        assertEquals("Twenty Three", numToWord.convert(23));
        assertEquals("Fifty Four", numToWord.convert(54));
        assertEquals("Fourty Five", numToWord.convert(45));
        assertEquals("Sixty Seven", numToWord.convert(67));
        assertEquals("Seventy Nine", numToWord.convert(79));
    }

    @Test
    public void testConvert_ThreeDigth() {
        
        assertEquals("Two Hundred And Thirty One", numToWord.convert(231));
        assertEquals("One Hundred", numToWord.convert(100));
        assertEquals("Two Hundred", numToWord.convert(200));
        
    }

    @Test
    public void testConvert_FourDigth() {
        
        assertEquals("Four Thousand Five Hundred And Thirty One", numToWord.convert(4531));
        assertEquals("Two Thousand Ninty Eight", numToWord.convert(2098));
        assertEquals("Ten Thousand", numToWord.convert(10000));  
        assertEquals("Ninty Nine Thousand Nine Hundred And Ninty Nine", numToWord.convert(99999)); 
    }

    @Test
    public void testConvert_FiveDigth() {
        
        assertEquals("Ten Thousand", numToWord.convert(10000));  
        assertEquals("Ninty Nine Thousand Nine Hundred And Ninty Nine", numToWord.convert(99999)); 
        assertEquals("Twenty Three Thousand Four Hundred And Eighty Six", numToWord.convert(23486));
    }
}
