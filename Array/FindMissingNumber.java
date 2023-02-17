/*
 * Given an array of n-1 distinct numbers in the range of 1 to n . Find the missing number in it.
 */
public class FindMissingNumber {
    public static int findNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int j : arr) {
            sum = sum - j;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = findNumber(new int[]{1, 3, 6, 8, 2, 4, 7});
        System.out.println(result);
    }
}
