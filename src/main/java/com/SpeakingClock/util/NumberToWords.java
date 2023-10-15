package com.SpeakingClock.util;

public class NumberToWords {



    public static String convertToWords(int number) {
        if (number < 0 || number > 59) {
            throw new IllegalArgumentException("Number should be between 0 and 59");
        }

        if (number == 0) {
            return "zero";
        }

        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        if (number < 20) {
            return units[number];
        } else if (number % 10 == 0) {
            return tens[number / 10];
        } else {
            return tens[number / 10] + " " + units[number % 10];
        }
    }
    }




