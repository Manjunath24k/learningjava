package com.main.august.numtoword;

public class NumToWord {

    private static final String WELCOME_TO_NUMBER_TO_WORD_CONVERTOR = "Welcome to Number to Word Convertor";

    private String unitarray[] = { Words.ZERO, Words.ONE, "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten" };

    private String tenToNineteenArray[] = { "Ten", Words.ELEVEN, Words.TWELVE, Words.THIRTEEN, "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

    private String tensarray[] = { Words.ZERO, "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninty" };

    public static void main(String args[]) {
        System.out.println(WELCOME_TO_NUMBER_TO_WORD_CONVERTOR);

    }

    public String convert(int value) {

        String result = "";
        boolean hasHundred = false;

        if (value == 0) {
            result = result + printUnit(value);
        }

        if (value <= 99999 && value > 9999) {
            int tensThousands = value / 10000;
            result = printTen(tensThousands);
            value = value - tensThousands * 10000;
            if (value == 0){
                result = result + Words.SPACE + Words.THOUSAND;
            }
        }

        if (value <= 9999 && value > 999) {
            int thousands = value / 1000;
            if (result != "") {
                result = result + Words.SPACE + printUnit(thousands) + Words.SPACE + Words.THOUSAND;
            } else {
                result = result + printUnit(thousands) + Words.SPACE + Words.THOUSAND;

            }
            value = value - thousands * 1000;
            if (value == 0){
                result = result + Words.SPACE + Words.THOUSAND;
            }
        }

        if (value <= 999 && value > 99) {
            int hundreds = value / 100;
            hasHundred = true;
            if (result != "") {
                result = result + Words.SPACE + printUnit(hundreds) + Words.SPACE + Words.HUNDRED;
            } else {
                result = result + printUnit(hundreds) + Words.SPACE + Words.HUNDRED;
            }
            value = value - hundreds * 100;
        }

        if (value <= 99 && value > 9) {
            int tens = value / 10;

            if (tens == 1) {
                int unit = value % 10;
                result = result + printEvelenToNineteenArray(unit);
            } else {
                if (result != "") {
                    if (hasHundred)
                        result = result + Words.SPACE + Words.AND;
                    result = result + Words.SPACE + printTen(tens);
                } else {
                    result = result + printTen(tens);
                }
            }
            if (value > 20) {
                value = value - tens * 10;
            }
        }

        if (value <= 9) {
            if (value != 0) {
                if (result != "") {
                    result = result + Words.SPACE + printUnit(value);
                } else {
                    result = result + printUnit(value);
                }
            }
        }
        return result;

    }

    private String printUnit(int value) {
        if (value > 10) {
            return "Invalid Unit";
        }
        return unitarray[value];
    }

    private String printEvelenToNineteenArray(int value) {
        if (value > 10) {
            return "Invalid ElevenToNineteen";
        }
        return tenToNineteenArray[value];
    }

    private String printTen(int value) {
        if (value > 10) {
            return "Invalid Tens";
        }
        return tensarray[value];
    }

}
