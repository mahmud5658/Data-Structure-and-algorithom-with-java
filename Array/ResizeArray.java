// How to resize an array ?
public class ResizeArray {
    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        // int [] result = resize(new int[] {5,1,2,9,10},)
        int[] original = new int[]{5, 1, 2, 9, 10};
        System.out.println("The size of original array: " + original.length);
        original = resize(original, 10);
        System.out.println("The size of original array after resize: " + original.length);
    }
}
