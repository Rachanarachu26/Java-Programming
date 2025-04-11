package Arrays_example;

import java.util.Scanner;

public class Ovwels_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter: ");
        char ch=sc.next().charAt(0);
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
           System.out.println("it is ovwel");
       }
       else{
           System.out.println("it is consonant");
       }

    }
}
