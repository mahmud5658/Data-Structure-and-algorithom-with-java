/*
Given a string, the task is checked whether given string is palindrome or not
 */

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        char[] arr = word.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.next();
        System.out.println("is the string is palindrome: " + (isPalindrome(word)));
    }
}
