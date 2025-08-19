package org.example;

public class Main {

    public static boolean isPalindrome(int number) {
        return Algorithms.isPalindrome(number);
    }

    public static boolean isPerfectNumber(int number) {
        return Algorithms.isPerfectNumber(number);
    }

    public static String numberToWords(int number) {
        return Algorithms.numberToWords(number);
    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(1010));
    }
}
