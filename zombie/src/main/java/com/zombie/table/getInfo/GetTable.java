package com.zombie.table.getInfo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class GetTable {
    public static void main(String[] args) throws IOException {
        
        String url = "https://www.bilibili.com/";
        Document doc = Jsoup.connect(url).get();
        Elements elements = doc.select(".info-box");
        for(Element element:elements){
            System.out.println(element.text());
            System.out.println(element.select("a").attr("href"));
            System.out.println(element.select("img").attr("src"));
        }
        String urlZombie = "https://bbs.zombieden.cn/thread-44164-1-1.html";
        Document docZ = Jsoup.connect(urlZombie).get();
        Elements elementsZ = docZ.select(".t_f");
        for(Element elementZ : elementsZ){
            System.out.println( elementZ.text());
        }
    }
}