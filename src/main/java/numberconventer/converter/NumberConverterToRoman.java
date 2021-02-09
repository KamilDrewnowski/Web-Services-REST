package com.recruitment.numberconventer.converter;

public class NumberConverterToRoman implements NumberConverter{
    private static final int[] allArabic = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static final String[] allRoman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    @Override
    public String convert(int value) {
        String result = ""; // string for set result
        int step = 0;

        for (int i = allArabic.length - 1; i >= 0; i--) {  //iterating through arrays of declared Arabic numbers
            step = value / allArabic[i]; // division by value in an array
            value %= allArabic[i];  // modulo numbers from the array

            while (step > 0) { // if you can divide an arabic number by an array number
                result = result + allRoman[i]; // saving the result
                step --; // step -1
            }
        }
        return result;
    }
}
