package Arrays_example;

public class StringBuilder_example {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'p');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        sb.setCharAt(0,'T');
        System.out.println(sb);
        sb.append(" ");
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }

}
