//How to move zeros to end of the array?

public class MovesZeros {
    public static int[] moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] number = {8, 1, 0, 2, 1, 0, 3};
        printArray(number); 
        int[] result = moveZeros(number);
        printArray(result);
    }
}
