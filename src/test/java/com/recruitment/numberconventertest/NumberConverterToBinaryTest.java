package com.recruitment.numberconventertest;

import com.recruitment.numberconventer.converter.NumberConverterToBinary;
import com.recruitment.numberconventer.converter.NumberConverterToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class NumberConverterToBinaryTest {

    @Test
    public void convertStandardNumberFirstNumber() {
        NumberConverterToBinary numberConverterToBinary = new NumberConverterToBinary();
        assertEquals(numberConverterToBinary.convert(10), "1010");
    }
    @Test
    public void convertStandardNumberSecondNumber() {
        NumberConverterToBinary numberConverterToBinary = new NumberConverterToBinary();
        assertEquals(numberConverterToBinary.convert( 1154), "10010000010");
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

