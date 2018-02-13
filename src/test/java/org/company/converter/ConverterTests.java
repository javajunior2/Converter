package org.company.converter;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ConverterTests {

    Converter converter;

    @Before
    public void setUp(){
        converter = new Converter();
    }

    /**
     * Tests for method {@link Converter#convertRomanToArabic(String)}
     */

    /**
     * Test verifies that if entered string consists of 1 digit then method convertArabicToRoman
     * converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckI() {
        assertThat(converter.convertRomanToArabic("I")).isEqualTo(1);
    }

    /**
     * Test verifies that if entered string consists of 2 identical digits then method convertArabicToRoman
     * converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckII() {
        assertThat(converter.convertRomanToArabic("II")).isEqualTo(2);
    }

    /**
     * Test verifies that if entered string consists of 3 identical digits then method convertArabicToRoman
     * converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckIII() {
        assertThat(converter.convertRomanToArabic("III")).isEqualTo(3);
    }

    /**
     * Test verifies that if entered string consists of 2 digits (lower digit that follows higher digit) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicIV() {
        assertThat(converter.convertRomanToArabic("IV")).isEqualTo(4);
    }

    /**
     * Test verifies that if entered string consists of 2 digits (lower digit that follows higher digit) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckV() {
        assertThat(converter.convertRomanToArabic("V")).isEqualTo(5);
    }

    /**
     * Test verifies that if entered string consists of 2 digits (higher digit that follows lower digit) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckVI() {
        assertThat(converter.convertRomanToArabic("VI")).isEqualTo(6);
    }

    /**
     * Test verifies that if entered string consists of 3 digits (1 higher digit that follows 2 lower digits) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckVII() {
        assertThat(converter.convertRomanToArabic("VII")).isEqualTo(7);
    }

    /**
     * Test verifies that if entered string consists of 4 digits (1 higher digit that follows 3 lower digits) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckVIII() {
        assertThat(converter.convertRomanToArabic("VIII")).isEqualTo(8);
    }

    /**
     * Test verifies that if entered string consists of 2 digits (lower digit that follows twice higher digit) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckIX() {
        assertThat(converter.convertRomanToArabic("IX")).isEqualTo(9);
    }

    /**
     * Test verifies that if entered string consists of 2 digits (higher digit that follows lower digit) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXI() {
        assertThat(converter.convertRomanToArabic("XI")).isEqualTo(11);
    }

    /**
     * Test verifies that if entered string consists of 3 digits (1 higher digit that follows 1 lower digit that
     * follows 1 higher digit) then method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXIV() {
        assertThat(converter.convertRomanToArabic("XIV")).isEqualTo(14);
    }

    /**
     * Test verifies that if entered string consists of 3 digits (1 higher digit that follows 1 lower digit that
     * follows 1 lower digit) then method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXVI() {
        assertThat(converter.convertRomanToArabic("XVI")).isEqualTo(16);
    }

    /**
     * Test verifies that if entered string consists of 4 digits (1 higher digit that follows 1 lower digit that
     * follows 2 lower digits) then method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXVII() {
        assertThat(converter.convertRomanToArabic("XVII")).isEqualTo(17);
    }

    /**
     * Test verifies that if entered string consists of 5 digits (1 higher digit that follows 1 lower digit that
     * follows 3 lower digits) then method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXVIII() {
        assertThat(converter.convertRomanToArabic("XVIII")).isEqualTo(18);
    }

    /**
     * Test verifies that if entered string consists of 2 identical Roman characters that by summing doesn't give higher
     * character by both sides of lower character then method convertRomanToArabic converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXIX() {
        assertThat(converter.convertRomanToArabic("XIX")).isEqualTo(19);
    }

    /**
     * Test verifies that if entered string consists of 2 identical Roman characters that by summing doesn't give higher
     * character following lower character then method convertRomanToArabic converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXXI() {
        assertThat(converter.convertRomanToArabic("XXI")).isEqualTo(21);
    }

    /**
     * Test verifies that if entered string consists of 4 digits (2 higher digit that follows 2 lower digits) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXXII() {
        assertThat(converter.convertRomanToArabic("XXII")).isEqualTo(22);
    }

    /**
     * Test verifies that if entered string consists of 5 digits (2 higher digit that follows 3 lower digits) then
     * method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXXIII() {
        assertThat(converter.convertRomanToArabic("XXIII")).isEqualTo(23);
    }

    /**
     * Test verifies that if entered string consists of 4 digits (2 higher digit that follows 1 lower digit that follows
     * 1 higher digit that lower than first 2 digits) then method convertArabicToRoman converts string to number successfully
     */
    @Test
    public void methodConvertRomanToArabicCheckXXIV() {
        assertThat(converter.convertRomanToArabic("XXIV")).isEqualTo(24);
    }

    @Test
    public void methodConvertRomanToArabicCheckXXV() {
        assertThat(converter.convertRomanToArabic("XXV")).isEqualTo(25);
    }

    @Test
    public void methodConvertRomanToArabicCheckXXVI() {
        assertThat(converter.convertRomanToArabic("XXVI")).isEqualTo(26);
    }

    @Test
    public void methodConvertRomanToArabicCheckXXVII() {
        assertThat(converter.convertRomanToArabic("XXVII")).isEqualTo(27);
    }

    @Test
    public void methodConvertRomanToArabicCheckXXVIII() {
        assertThat(converter.convertRomanToArabic("XXVIII")).isEqualTo(28);
    }

    @Test
    public void methodConvertRomanToArabicCheckXXXIII() {
        assertThat(converter.convertRomanToArabic("XXXIII")).isEqualTo(33);
    }

    @Test
    public void methodConvertRomanToArabicCheckXL() {
        assertThat(converter.convertRomanToArabic("XL")).isEqualTo(40);
    }

    @Test
    public void methodConvertRomanToArabicCheckL() {
        assertThat(converter.convertRomanToArabic("L")).isEqualTo(50);
    }

    @Test
    public void methodConvertRomanToArabicCheckLX() {
        assertThat(converter.convertRomanToArabic("LX")).isEqualTo(60);
    }

    @Test
    public void methodConvertRomanToArabicCheckLXVI() {
        assertThat(converter.convertRomanToArabic("LXVI")).isEqualTo(66);
    }

    @Test
    public void methodConvertRomanToArabicCheckXC() {
        assertThat(converter.convertRomanToArabic("XC")).isEqualTo(90);
    }

    @Test
    public void methodConvertRomanToArabicCheckC() {
        assertThat(converter.convertRomanToArabic("C")).isEqualTo(100);
    }

    @Test
    public void methodConvertRomanToArabicCheckCX() {
        assertThat(converter.convertRomanToArabic("CX")).isEqualTo(110);
    }

    @Test
    public void methodConvertRomanToArabicCheckCLXVI() {
        assertThat(converter.convertRomanToArabic("CLXVI")).isEqualTo(166);
    }

    @Test
    public void methodConvertRomanToArabicCheckCD() {
        assertThat(converter.convertRomanToArabic("CD")).isEqualTo(400);
    }

    @Test
    public void methodConvertRomanToArabicCheckD() {
        assertThat(converter.convertRomanToArabic("D")).isEqualTo(500);
    }

    @Test
    public void methodConvertRomanToArabicCheckDCLXVI() {
        assertThat(converter.convertRomanToArabic("DCLXVI")).isEqualTo(666);
    }

    @Test
    public void methodConvertRomanToArabicCheckCM() {
        assertThat(converter.convertRomanToArabic("CM")).isEqualTo(900);
    }

    @Test
    public void methodConvertRomanToArabicCheckM() {
        assertThat(converter.convertRomanToArabic("M")).isEqualTo(1000);
    }

    @Test
    public void methodConvertRomanToArabicCheckMDLXVI() {
        assertThat(converter.convertRomanToArabic("MDCLXVI")).isEqualTo(1666);
    }

    /**
     * Test verifies that if entered string consists of 4 identical characters then method convertRomanToArabic
     * throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void methodConvertRomanToArabicCheckIIII(){
        converter.convertRomanToArabic("IIII");
    }

    /**
     * Test verifies that if entered string consists of 2 identical characters before bigger character then
     * method convertRomanToArabic throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void methodConvertRomanToArabicCheckIIX(){
        converter.convertRomanToArabic("IIX");
    }

    /**
     * Test verifies that if entered string consists of non-Roman characters then method convertRomanToArabic
     * throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void methodConvertRomanToArabicCheckABC(){
        converter.convertRomanToArabic("ABC");
    }

    /**
     * Test verifies that if entered string consists of 2 identical Roman characters which when summing gives next
     * (higher) Roman character then method convertRomanToArabic throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void methodConvertRomanToArabicCheckVV(){
        converter.convertRomanToArabic("VV");
    }

    /**
     * Test verifies that if entered string consists of 2 identical Roman characters that by summing give higher
     * character by both sides of lower character then method convertRomanToArabic throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void methodConvertRomanToArabicCheckVIV(){
        converter.convertRomanToArabic("VIV");
    }

    /**
     * Test verifies that if entered string consists of 2 identical Roman characters by both sides of other character
     * then method convertRomanToArabic throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void methodConvertRomanToArabicCheckIVI(){
        converter.convertRomanToArabic("IVI");
    }

    /**
     * Test verifies that if entered string consists of 3 next-to-next growing legal Roman characters
     * then method convertRomanToArabic throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void methodConvertRomanToArabicCheckCDM(){
        converter.convertRomanToArabic("CDM");
    }

    /**
     * Tests for method {@link Converter#convertArabicToRoman(int)}
     */

    /**
     * Test verifies that if entered number is inside allowable range then method convertArabicToRoman
     * converts number successfully
     */
    @Test
    public void convertArabicToRomanCheck1982() {
        assertThat(converter.convertArabicToRoman(1982)).isEqualTo("MCMLXXXII");
    }

    /**
     * Test verifies that if entered number is negative then method convertArabicToRoman
     * throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void convertArabicToRomanCheckMinus1() {
        converter.convertArabicToRoman(-1);
    }

    /**
     * Test verifies that if entered number is 0 then method convertArabicToRoman
     * throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void convertArabicToRomanCheck0() {
        converter.convertArabicToRoman(0);
    }

    /**
     * Test verifies that if entered number is 4000 then method convertArabicToRoman
     * throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void convertArabicToRomanCheck4000() {
        converter.convertArabicToRoman(4000);
    }

    /**
     * Cross test of converters verifies that numbers, converted by Roman to Arabic
     * method and substituted in Arabic to Roman method as parameter, are equals
     */
    @Test
    public void checkAllNumbers(){
        for (int i = Converter.MIN_NUMBER; i <= Converter.MAX_NUMBER; i++){
            assertThat(converter.convertRomanToArabic(converter.convertArabicToRoman(i))).isEqualTo(i);
        }
    }

}
