// How to find large three number of an array
public class FindLargeThreeNumber {
    public static void findNumber(int[] arr) {
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (i > second && i != first) {
                third = second;
                second = i;
            } else if (i > third && i != second) {
                third = i;
            }
        }
        System.out.println(first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int[] number = {12, 13, 1, 10, 34, 1};
        findNumber(number);
    }
}
