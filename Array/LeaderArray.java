/*
Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all the elements
to its right side. And the rightmost element is always leader.
 */

import java.util.Scanner;

public class LeaderArray {
    // Leader in array method
    public static void Leader(int[] arr, int n) {
        int maxRight = arr[n - 1];
        System.out.println(maxRight);
        for (int i = n - 2; i >= 0; i--) {
            if (maxRight < arr[i]) {
                System.out.println(arr[i] + " ");
                maxRight = arr[i];
            }
        }
    }

    // input array
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        return number;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        Leader(inputArray(size), size); // call the leader method which is find the leader in the array
    }
}
