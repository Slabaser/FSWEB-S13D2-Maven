package org.example;

public class Algorithms {
// Palindrom sayı mı

    public static boolean isPalindrome(int number) {
        int n = Math.abs(number); // abs mutlak değerini alıyor
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    //mükemmel sayı mı
   public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;

        int sum = 1;
        int limit = (int) Math.sqrt(number); //sayının kareköküne kadar geliyor

        for (int i = 2; i <= limit; i++){
            if (number % i == 0){
                int pair = number / i; // burada mesela 28in böleni 2 bulduysak eş olarak 14 de böleni olacağından zaman kazandırmak için pair değişkenini de ekledim
                sum  += i;
                if (pair != i) sum += pair;

            }
        }
       return sum == number;

    }

    //sayıları kelimelere dök

    public static String numberToWords(int number) {
        if(number < 0) return "Invalid Value";
        if (number == 0) return "Zero";

        String word = "";

        String[] digitWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        while (number > 0) {
            int digit = number % 10;
            if (word.isEmpty()) {
                word = digitWords[digit];  // İlk kelime
            } else {
                word = digitWords[digit] + " " + word;  // Başa ekle
            }
            number /= 10;
        }
        return word;



    }


}
