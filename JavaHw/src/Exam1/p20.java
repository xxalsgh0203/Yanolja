package Exam1;

public class p20 {
    public static void main(String[] args) {
        String str = "1#2#3#4#5";
        int result = 0;
        String[] substr = str.split("#");

        for(String s : substr){
            result += Integer.parseInt(s);
        }
        str = str.replace("#", " + ");
        System.out.print(str);
        System.out.println(" = " + result);
    }
}
