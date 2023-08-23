package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class API06 {
    public static void main(String[] args) {
        // 특정 서버에 있는 자원(리소스)을 네트워킹을 이용해서 획득하기(크롤링)
        String url = "https://sum.su.or.kr:8888/bible/today";
        // 요청(request) -----> 응답(response) : HTML(tag) API
        // get, post
        // Jsoup API(Connection + Parsing)
        try{
            Document document = Jsoup.connect(url).get();
//             System.out.println(document.toString());
            Element dailybible_info = document.selectFirst("div.dailybible_info");
            Element bible_text = document.selectFirst("div.bible_text");
            Element bibleinfo_box = document.selectFirst("div.bibleinfo_box");
//            if(dailybible_info != null){
//                String text = dailybible_info.text();
//                System.out.println(text);
//            }
//            System.out.println(bible_text.text());
//            System.out.println(bibleinfo_box.text());

            Elements body_list = document.select("ul.body_list > li");
//            System.out.println(body_list);

            for(Element e : body_list){
                System.out.println(e.selectFirst(".num").text());
                System.out.println(e.selectFirst(".info").text());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
