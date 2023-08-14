package Exam1;

import java.util.ArrayList;

public class p18 {
    public static void main(String[] args) {
        int[] answers = {2, 3, 2, 4, 1};
        String myAnswers = "1,3,2,4,4";
        int points = 0;

        String[] mAns = myAnswers.split(",");
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<answers.length; i++){
            if(answers[i] == Integer.parseInt(mAns[i])){
                points += 20;
                list.add("O ");
            }else{
                list.add("X ");
            }
        }

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

        System.out.print(points);
    }
}
