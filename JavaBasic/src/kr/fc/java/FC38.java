package kr.fc.java;

import java.io.*;

public class FC38 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("pic.PNG");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("newpic.PNG");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            // 0 ~ 255
            int data;
            int cnt = 0;
            while((data = fis.read()) != -1){
                bos.write(data);
//                System.out.println(data);
//                cnt++;
                bos.flush();
            }
            bos.close();
            fis.close();
            System.out.println("이미지 복사 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
