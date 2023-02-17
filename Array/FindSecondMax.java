/*
 * How  to find second maximum number of an array?
 */
public class FindSecondMax {
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] number = {13, 34, 2, 34, 33, 1};
        int result = findSecondMax(number);
        System.out.println(result);
    }
}
