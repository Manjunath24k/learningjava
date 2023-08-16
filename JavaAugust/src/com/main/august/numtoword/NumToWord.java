package com.main.august.numtoword;

public class NumToWord {

    private static final String AND = "And";
    private static final String HUNDRED = "Hundred";
    private static final String THOUSAND = "Thousand";

    private static final String SPACE = " ";

    private static final String WELCOME_TO_NUMBER_TO_WORD_CONVERTOR = "Welcome to Number to Word Convertor";

    private String unitarray[] = { Words.ZERO, "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
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
                result = result + SPACE + THOUSAND;
            }
        }

        if (value <= 9999 && value > 999) {
            int thousands = value / 1000;
            if (result != "") {
                result = result + SPACE + printUnit(thousands) + SPACE + THOUSAND;
            } else {
                result = result + printUnit(thousands) + SPACE + THOUSAND;

            }
            value = value - thousands * 1000;
            if (value == 0){
                result = result + SPACE + THOUSAND;
            }
        }

        if (value <= 999 && value > 99) {
            int hundreds = value / 100;
            hasHundred = true;
            if (result != "") {
                result = result + SPACE + printUnit(hundreds) + SPACE + HUNDRED;
            } else {
                result = result + printUnit(hundreds) + SPACE + HUNDRED;
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
                        result = result + SPACE + AND;
                    result = result + SPACE + printTen(tens);
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
                    result = result + SPACE + printUnit(value);
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
