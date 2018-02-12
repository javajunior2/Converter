package org.company.converter;

import lombok.NonNull;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author volodymyr
 * Converts Roman number to Arabic and Arabic number to Roman
 * Allowable range of numbers: 1 - 3999
 */
public class Converter {

    private TreeMap<Integer, String> rMap = new TreeMap<Integer, String>();
    private HashMap<String, Integer> aMap = new HashMap<String, Integer>();
    private final Pattern ROMAN_FORMAT_MATCHER =
            Pattern.compile("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    public Converter() {
        rMap.put(1000, "M");
        rMap.put(900, "CM");
        rMap.put(500, "D");
        rMap.put(400, "CD");
        rMap.put(100, "C");
        rMap.put(90, "XC");
        rMap.put(50, "L");
        rMap.put(40, "XL");
        rMap.put(10, "X");
        rMap.put(9, "IX");
        rMap.put(5, "V");
        rMap.put(4, "IV");
        rMap.put(1, "I");

        aMap.put("M", 1000);
        aMap.put("D", 500);
        aMap.put("C", 100);
        aMap.put("L", 50);
        aMap.put("X", 10);
        aMap.put("V", 5);
        aMap.put("I", 1);
    }

    /**
     * Method converts Roman number to Arabic
     * @param number - number in Roman format
     * @return - Arabic number (int) representing value of a Roman number
     * @throws IllegalArgumentException - thrown if entered string doesn't match defined pattern
     */
    public final int convertRomanToArabic(@NonNull String number) throws IllegalArgumentException {
        Matcher matcher = ROMAN_FORMAT_MATCHER.matcher(number);
        if (number.isEmpty() || (!matcher.find(0))) {
            throw new IllegalArgumentException("Invalid Roman number!");
        }
        int arabicNumber = 0;
        int prev = 0;
        int temp = 0;
        int length = number.length();
        for (int i = (length - 1); i >= 0; i--) {
            temp = aMap.get(String.valueOf(number.charAt(i)));
            arabicNumber += (temp < prev) ? -temp : temp;
            prev = temp;
        }
        return arabicNumber;
    }

    /**
     * Method converts Arabic number to Roman
     * @param number - number in Arabic format
     * @return - Arabic number (String) representing value of Roman number
     * @throws IllegalArgumentException - thrown if entered number is out of defined range
     */
    public final String convertArabicToRoman(int number) throws IllegalArgumentException {
        if (number < 1 || number > 3999)
            throw new IllegalArgumentException("Verify that number from 1 to 3999.");
        StringBuilder romanNumber;
        int index = rMap.floorKey(number);
        if (index == number) {
            return rMap.get(index);
        }
        return rMap.get(index) + convertArabicToRoman(number - index);
    }

}
