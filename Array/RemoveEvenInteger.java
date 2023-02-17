// How to remove even integer number of an array?

public class RemoveEvenInteger {
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int k : arr) {
            if (k % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] number = {3, 2, 4, 7, 10, 6, 5};

        int[] result = removeEven(number);
        printArray(result);
    }
}
