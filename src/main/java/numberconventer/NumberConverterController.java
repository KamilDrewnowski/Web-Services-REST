package com.recruitment.numberconventer;

import com.recruitment.numberconventer.converter.NumberConverterToBinary;
import com.recruitment.numberconventer.converter.NumberConverterToRoman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NumberConverterController {

    public static final String PARAMETER_TYPE_IS_INCORRECT = "Parameter type is incorrect";
    public static final String PARAMETER_VALUE_IS_INCORRECT = "Parameter value is incorrect";
    public static final String YOUR_NUMBER_CANNOT_BE_CONVERTED_TO_ROMAN_NUMERALS = "Your number cannot be converted to Roman numerals";
    public static final String YOUR_ROMAN_NUMBER_IS = "Your Roman number is: ";
    public static final String YOUR_BINARY_NUMBER_IS = "Your Binary number is: ";
    public static final String ROMAN = "roman";
    public static final String BINARY = "binary";
    public static final String YOUR_NUMBER_CANNOT_BE_CONVERTED_TO_BINARY_NUMERALS = "Your number cannot be converted to Binary numerals";

    @RequestMapping("/convert")
    public String convert(@RequestParam(value = "type") String type, @RequestParam(value = "value") String value) {
        int iValue = 0;

        try {
            iValue = Integer.parseInt(value); // change string from in to int
        } catch (NumberFormatException e) {
            return PARAMETER_VALUE_IS_INCORRECT;
        }

        switch (type.toLowerCase()) {
            case ROMAN:
                if ((iValue > 3999) || (iValue <= 0)) {
                    return YOUR_NUMBER_CANNOT_BE_CONVERTED_TO_ROMAN_NUMERALS;
                }
                return YOUR_ROMAN_NUMBER_IS + new NumberConverterToRoman().convert(iValue);
            case BINARY:
                if (iValue < 0) {
                    return YOUR_NUMBER_CANNOT_BE_CONVERTED_TO_BINARY_NUMERALS;
                }
                return YOUR_BINARY_NUMBER_IS + new NumberConverterToBinary().convert(iValue);
            default:
                return PARAMETER_TYPE_IS_INCORRECT;
        }
    }
}