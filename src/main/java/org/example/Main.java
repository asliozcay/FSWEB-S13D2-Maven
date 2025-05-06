package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static boolean isPalindrome(int number){
        String numberStr = String.valueOf(number);
        numberStr = numberStr.replaceAll("-", "");
        String reverseNumberStr = new StringBuilder(numberStr).reverse().toString();
        if(numberStr.equals(reverseNumberStr)){
            return true;
        }
        return false;
    }
    public static boolean isPerfectNumber(int number){
        if(number<0){
            return false;
        }
        int toplam = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                toplam += i;
            }
        }
        return toplam == number;
    }
    public static String numberToWords(int number){
        if(number<0){
            return "Invalid Value";
        }
        String numberStr = String.valueOf(number);
        String[] numberStrArr = numberStr.split("");
        String result = "";
        for (int i = 0; i < numberStrArr.length; i++) {
            switch(numberStrArr[i]){
                case "0":
                    result += "Zero ";
                    break;
                case "1":
                    result += "One ";
                    break;
                case "2":
                    result += "Two ";
                    break;
                case "3":
                    result += "Three ";
                    break;
                case "4":
                    result += "Four ";
                    break;
                case "5":
                    result += "Five ";
                    break;
                case "6":
                    result += "Six ";
                    break;
                case "7":
                    result += "Seven ";
                    break;
                case "8":
                    result += "Eight ";
                    break;
                case "9":
                    result += "Nine ";
                    break;
            }
        }
        return result.trim();
    }
}
