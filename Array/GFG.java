/*
How to find last three integer in array
 */

import java.util.Arrays;

class GFG {
    public static void main(String[] args) {
        int[] V = {10, 65, 193, 36, 209, 664, 32};

        // sorting the array
        Arrays.sort(V);
        // taking the length of array
        int x = V.length;

        System.out.println("First: " + V[x - 1]);
        System.out.println("Second :" + V[x - 2]);
        System.out.println("Third :" + V[x - 3]);
    }
}
