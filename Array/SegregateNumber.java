/*
* Segregate even and odd numbers
Given an array arr[] of integers, segregate even and odd numbers in the array.
Such that all the even numbers should be present first, and then the odd numbers.
 */

import java.util.Scanner;
import java.util.Arrays;

public class SegregateNumber {

    // segregate method
    public static void segregate(int[] arr, int size) {
        int[] temp = arr.clone();
        int even = 0, odd = size - 1;
        for (int i = 0; i < size; i++) {
            if (temp[i] % 2 == 0) {
                arr[even++] = temp[i];
            } else {
                arr[odd--] = temp[i];
            }
        }
    }

    //input array from user method
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();  // input size of the array

        int[] arr = inputArray(size); // input array elements

        System.out.println("Before segregate : ");
        System.out.println(Arrays.toString(arr));

        segregate(arr, size);  // call segregate method

        System.out.println("After segregate : ");
        System.out.println(Arrays.toString(arr));
    }
}
