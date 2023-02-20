/*
 * Reversal algorithm for Array rotation
 * Given an array arr[] of size N, the task is to rotate the array by d position to the left.
 */

import java.util.Arrays;
import java.util.Scanner;

// reverse the based on it's position
public class ReversalArray {
    public static void reverse(int[] arr, int size, int d) {
        int[] temp = arr.clone();
        int j = d;
        for (int i = 0; i < size; i++) {
            arr[i] = temp[j++];
            if (j >= size) {
                j = 0;
            }
        }
    }

    // input array
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();  // input the size of an array
        int[] arr = inputArray(size); // input method call and put array this variable
        System.out.println("Before rotation : ");
        System.out.println(Arrays.toString(arr));  // print array before rotation
        System.out.println("Enter the position of the array: ");
        int d = sc.nextInt(); // input the array position
        reverse(arr, size, d);  //call reverse method
        System.out.println("After rotation: ");
        System.out.println(Arrays.toString(arr));  // print array after rotation
    }
}
