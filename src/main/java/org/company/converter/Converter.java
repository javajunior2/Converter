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

    private TreeMap<Integer, String> arabicRomanMap = new TreeMap<>();
    private HashMap<String, Integer> romanArabicMap = new HashMap<>();
    private final Pattern ROMAN_FORMAT_MATCHER =
            Pattern.compile("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 3999;

    public Converter() {
        arabicRomanMap.put(1000, "M");
        arabicRomanMap.put(900, "CM");
        arabicRomanMap.put(500, "D");
        arabicRomanMap.put(400, "CD");
        arabicRomanMap.put(100, "C");
        arabicRomanMap.put(90, "XC");
        arabicRomanMap.put(50, "L");
        arabicRomanMap.put(40, "XL");
        arabicRomanMap.put(10, "X");
        arabicRomanMap.put(9, "IX");
        arabicRomanMap.put(5, "V");
        arabicRomanMap.put(4, "IV");
        arabicRomanMap.put(1, "I");

        romanArabicMap.put("M", 1000);
        romanArabicMap.put("D", 500);
        romanArabicMap.put("C", 100);
        romanArabicMap.put("L", 50);
        romanArabicMap.put("X", 10);
        romanArabicMap.put("V", 5);
        romanArabicMap.put("I", 1);
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
            temp = romanArabicMap.get(number.substring(i, i + 1));
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
        if (number < MIN_NUMBER || number > MAX_NUMBER)
            throw new IllegalArgumentException("Invalid number: allowable range from 1 to 3999.");

        int index = arabicRomanMap.floorKey(number);
        if (index == number) {
            return arabicRomanMap.get(index);
        }
        return arabicRomanMap.get(index) + convertArabicToRoman(number - index);
    }

}
