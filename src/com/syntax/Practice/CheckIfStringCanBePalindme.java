package com.syntax.Practice;

public class CheckIfStringCanBePalindme {


    public static boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }


    public static String StringChallenge(String str) {
        String output;
        StringBuilder newSB;


        if (isPalindrome(str)) {
            output = str + "The String is palindrome";
        } else {
            output = "Not possible";

            char firstDeletedChar;
            char secondDeletedChar;

            if (str.length() >= 3) {
                for (int i = 0; i < str.length() - 1; i++) {
                    StringBuilder sb = new StringBuilder(str);
                    firstDeletedChar=sb.charAt(i);
                    newSB = sb.deleteCharAt(i);
                    if (newSB.toString().length() >= 3) {
                        if (isPalindrome(newSB.toString())) {
                            output = ""+firstDeletedChar;
                            break;
                        } else {
                            secondDeletedChar=sb.charAt(i);
                            newSB = sb.deleteCharAt(i);
                            if (newSB.toString().length() >= 3) {
                                if (isPalindrome(newSB.toString())) {
                                    output =""+firstDeletedChar+secondDeletedChar;
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        return output;
    }


    public static void main(String[] args) {
        String result = CheckIfStringCanBePalindme.StringChallenge("kjjjhjjj");
        System.out.println(result);
    }
}