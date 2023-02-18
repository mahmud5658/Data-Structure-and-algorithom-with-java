// find sub-array with given sum (Non-negative Numbers)

import java.util.Scanner;
public class SubArrayFind {
    public static void findSubArray(int [] array,int sum){
        int n = array.length;
        for(int i=0;i<n;i++){
            int currentSum = array[i];
            if(currentSum==sum){
                System.out.println("Sum found at index "+i);
                return;
            }
            else{
                for(int j=i+1;j<n;j++){
                    currentSum+=array[j];
                    if(currentSum==sum){
                        System.out.println("Sum found between indexes from "+i+" to "+j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
    }
    // this method is created to input an array from user
    public static int [] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // this is the main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : "); // input size of an array
        int n = sc.nextInt();
        int [] arr = inputArray(n);  // call the inputArray method
        System.out.println("Enter the sub array sum : ");
        int sum = sc.nextInt(); // input given sum
        findSubArray(arr,sum); // call findSubArray
    }
}

// This code has been contributed by Abdullah Al Mahmud(mahmud5658)
