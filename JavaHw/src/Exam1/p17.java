package Exam1;

import java.util.Arrays;

public class p17 {
    public static void main(String[] args) {
        String str = "once upon a time";
        String[] substrings = str.split(" ");
        Arrays.sort(substrings);

        for(String s : substrings){
            System.out.println(s);
        }
    }
}
