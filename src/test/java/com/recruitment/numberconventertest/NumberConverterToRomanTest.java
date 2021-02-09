package com.recruitment.numberconventertest;

import com.recruitment.numberconventer.converter.NumberConverterToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class NumberConverterToRomanTest{

    @Test
    public void convertStandardNumberFirstNumber() {
        NumberConverterToRoman numberConverterToRoman = new NumberConverterToRoman();
        assertEquals(numberConverterToRoman.convert(10), "X");
    }
    @Test
    public void convertStandardNumberSecondNumber() {
        NumberConverterToRoman numberConverterToRoman = new NumberConverterToRoman();
        assertEquals(numberConverterToRoman.convert( 1154), "MCLIV");
    }
    @Test
    public void convertStandardNumberIncorrectZero() {
        NumberConverterToRoman numberConverterToRoman = new NumberConverterToRoman();
        assertEquals(numberConverterToRoman.convert(0), "");
    }
    @Test
    public void convertStandardNumberIncorrectNegative() {
        NumberConverterToRoman numberConverterToRoman = new NumberConverterToRoman();
        assertEquals(numberConverterToRoman.convert(-5), "");
    }
}