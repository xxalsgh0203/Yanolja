package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.FileOutputStream;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DownloadBroker extends Thread { // 스레드(알바생)가 처리하는 작업(task) 클래스
    // public class DownloadBroker implements Runnable -> 더 많이 쓰임
    private String imageUrl;
    private String imageName;
    private HttpClient httpClient;
    public void run(){ // 무조건 있어야 함
        try{
            HttpGet httpGet = new HttpGet(imageUrl); // 연결
            HttpResponse response = httpClient.execute(httpGet); // 실행(요청)
            HttpEntity entity = response.getEntity();
            // 버퍼에 저장한 후에 다운로드
            byte[] ingBuf = EntityUtils.toByteArray(entity);

            FileOutputStream fos = new FileOutputStream(imageName);
            fos.write(ingBuf);
            fos.close();

            System.out.println("이미지 다운로드 완료");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
