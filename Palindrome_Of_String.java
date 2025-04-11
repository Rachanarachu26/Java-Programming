package Arrays_example;

import java.util.Scanner;

public class Palindrome_Of_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String ssb=sc.next();
        StringBuilder sb=new StringBuilder(ssb);
//        System.out.println("enter the string");
//        String ssb=sc.next();
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            if(sb.charAt(front)!=sb.charAt(back)){
                System.out.println("not palindrome");
                return;
            }


//            char frontChar=sb.charAt(front);
//            char backChar=sb.charAt(back);
//
//            if(frontChar!=backChar){
//                System.out.println("not palindrome");
//            }

        }
        System.out.println("it is palindrome");
    }
}
