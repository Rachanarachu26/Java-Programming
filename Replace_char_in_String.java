package Arrays_example;

import java.util.Scanner;

public class Replace_char_in_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        //empty string
        String result="";
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == 'e') {
                result+='i';
            }
            else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
