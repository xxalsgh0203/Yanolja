package Exam1;

public class p19 {
    public static void main(String[] args) {
        char[] arr = {'A', 'b', 'C', 'd', 'E', 'f', 'G', 'h'};

        int upper = 0;
        int lower = 0;

        for(int i=0; i<arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                upper++;
            }else{
                lower++;
            }
        }

        System.out.println("Uppercase Sum: " + upper);
        System.out.println("Lowercase Sum: " + lower);
    }
}
