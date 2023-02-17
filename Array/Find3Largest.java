/*
Find three largest number 
 */
public class Find3Largest {
    public static void find3largest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int check = 0, count = 1;
        for (int i = 1; i <= n; i++) {
            if (count < 4) {
                if (check != arr[n - i]) {
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            } else break;
        }
    }

    public static void main(String[] args) {
        int[] number = {12, 45, 1, -1, 45, 54, 23, 5, 0, -10};
        find3largest(number);
    }
}
