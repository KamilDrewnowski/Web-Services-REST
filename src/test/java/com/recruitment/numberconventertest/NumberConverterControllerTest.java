package com.recruitment.numberconventertest;

import com.recruitment.numberconventer.NumberConverterController;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class NumberConverterControllerTest {

    @Test
    public void convertStandardNumberIncorrectTypeFirst() {
        NumberConverterController numberConverterController = new NumberConverterController();
        assertEquals(numberConverterController.convert("NotExistType", "123"), "Parameter type is incorrect");
    }
    @Test
    public void convertStandardNumberIncorrectTypeSecond() {
        NumberConverterController numberConverterController = new NumberConverterController();
        assertEquals(numberConverterController.convert("", "123"), "Parameter type is incorrect");
    }
    @Test
    public void convertStandardNumberLowercaseFirst() {
        NumberConverterController numberConverterController = new NumberConverterController();
        assertEquals(numberConverterController.convert("Roman", "120"), "Your Roman number is: CXX");
    }
    @Test
    public void convertStandardNumberLowercaseSecond() {
        NumberConverterController numberConverterController = new NumberConverterController();
        assertEquals(numberConverterController.convert("Binary", "54"), "Your Binary number is: 110110");
    }
    @Test
    public void convertStandardNumberBinaryZero() {
        NumberConverterController numberConverterController = new NumberConverterController();
        assertEquals(numberConverterController.convert("Binary", "0"), "Your Binary number is: 0" );
    }
    @Test
    public void convertStandardNumberRomanZero() {
        NumberConverterController numberConverterController = new NumberConverterController();
        assertEquals(numberConverterController.convert("Roman", "0"), "Your number cannot be converted to Roman numerals" );
    }
    @Test
    public void convertStandardNumberRomanNegative() {
        NumberConverterController numberConverterController = new NumberConverterController();
        assertEquals(numberConverterController.convert("Roman", "-5"), "Your number cannot be converted to Roman numerals" );
    }

}

