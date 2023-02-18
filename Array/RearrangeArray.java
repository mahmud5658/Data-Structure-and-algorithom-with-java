
// Rearrange array such that even position are greater than odd

public class RearrangeArray {
    public static int[] reArrangeArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            } else {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] number = {1, 3, 2, 2, 5};
        int[] rearrange = reArrangeArray(number);
        printArray(rearrange);

    }
}
