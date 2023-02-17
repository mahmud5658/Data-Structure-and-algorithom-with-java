
// How to reverse an array?
public class ReverseArray {
    public static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static int[] reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] number = {2, 11, 5, 12, 10, 7, 8};
        int[] result = reverseArray(number, 0, number.length - 1);
        printArray(result);

    }
}
