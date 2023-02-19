/*
Re-arrange the sorted array in maximum minimum form using two pointer
 */

import java.util.Scanner;
import java.util.Arrays;

public class ReArrange {

    // re-arrange the array
    public static void rearrange(int[] arr, int size) {
        int[] temp = arr.clone();
        int small = 0, large = size - 1;
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (flag) {
                arr[i] = temp[large--];
            } else {
                arr[i] = temp[small++];
            }
            flag = !flag;
        }
    }

    // input an array with sorted
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] arr = inputArray(size);

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));

        rearrange(arr, size);

        System.out.println("Modified array: ");
        System.out.println(Arrays.toString(arr));
    }
}
