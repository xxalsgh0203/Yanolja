package ch09;

public class temp {
    public static void main(String[] args) {
        String S = "0 6 2 5 2 4 2 5 1 8 1 8 1 8 1 3 1 5 4 5 3 5 4 5 3 6 2 5 2 6 3 2 4 3 6 2 5 2 6 3 5 4 5 3 5 4 5 1 7 1 8 1 8 1 8 1 5 2 4 2 5 2 6 0 ";
        String[] substr = S.split(" ");
        int result = 0;
        for(int i=0; i<substr.length; i++){
            result += Integer.parseInt(substr[i]);
        }

        System.out.println(result);
    }
}
