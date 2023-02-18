// How to find second large number in array

import java.util.Arrays;

public class SecondLarge {
    public static void print2large(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                System.out.println("Second number : " + arr[i]);
                return;
            }
        }
        System.out.println("There is no second largest element");
    }

    public static void main(String[] args) {
        int[] number = {12, 35, 1, 10, 34, 1};
        print2large(number);
    }
}
