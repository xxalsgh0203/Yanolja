package org.example;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

// JVM -> main Thread
public class API07 {
    public static void main(String[] args) {
        String imageUrl = "https://sum.su.or.kr:8888/Themes/main/images/sub/audio_defaultimg.jpg";
        String imageName = "audio_defaultimg.jpg";
        HttpClient httpClient = HttpClients.createDefault();
        // 이미지 다운로드 -> 별도의 Thread 를 만들어서 처리
        DownloadBroker db = new DownloadBroker(imageUrl, imageName, httpClient);
        db.start(); // run() 구동

//        // 1. 알바생(스레드)가 처리해야할 일을 만들어 놓았다(DownloadBroker)
//        Runnable job = new DownloadBroker();
//        // 2. 알바생을 채용해야한다
//        Thread t1 = new Thread(job); // 3. 스레드와 작업을 연결한다
//        //4. 일을 시작
//        t1.start();

        // main Thread ~~
        System.out.println("main Thread 종료");
    }
}
