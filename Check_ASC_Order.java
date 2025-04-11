package Arrays_example;

import java.util.Scanner;

public class Check_ASC_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }

        boolean isAsc=true;
        for(int i=0;i<numbers.length-2;i++){
            if(numbers[i]>numbers[i+1]){
                isAsc=false;
            }
        }

        if(isAsc){
            System.out.println("It is in ascending order");
        }
        else{
            System.out.println("it is in descending order");
        }
    }
}
