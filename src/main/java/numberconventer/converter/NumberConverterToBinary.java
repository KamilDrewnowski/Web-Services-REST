package com.recruitment.numberconventer.converter;

public class NumberConverterToBinary implements NumberConverter{

    @Override
    public String convert(int value) {

        String result = ""; // string for set result
        if(value == 0){
            result = "0";
            return result;
        }

        int i = 0; //auxiliary variable
        int[] binaryTable = new int[100]; // array where writes a binary number

        while (value > 0) {
            binaryTable[i] = value % 2; //Roman number modulo 2
            value = value / 2; //Roman number divided by 2
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            result = result + binaryTable[j];// saving the result
        }
        return result;
    }
}
