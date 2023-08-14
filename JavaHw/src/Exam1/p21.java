package Exam1;

public class p21 {
    public static void main(String[] args) {
        int[] results = new int[6];
        String s = "3,2,5,4,4,1,5,5,4,1,2,4,5,5,1";
        String[] substr = s.split(",");

        for(int i=0; i<substr.length; i++){
            int count = Integer.parseInt(substr[i]);
            results[count]++;
        }

        for(int i=1; i<results.length; i++){
            System.out.print(i);
            System.out.print("(" + results[i] + "개) : ");
            for(int j=0; j<results[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
