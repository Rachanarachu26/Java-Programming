package Arrays_example;

import java.util.Scanner;

public class Min_Max_NumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("largest number is: "+max);
        System.out.println("smallest number is: "+min);
    }
}
