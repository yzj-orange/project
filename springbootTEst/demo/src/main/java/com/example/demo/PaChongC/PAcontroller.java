package com.example.demo.PaChongC;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://192.168.199.233:8066/")
@RestController
@RequestMapping("/papa")
public class PAcontroller {
    @RequestMapping("/getZombies")
    public List<Map<String ,Object>> getZombies() throws IOException {
        List<Map<String ,Object>> resA = new ArrayList<>();
        String[] tail = {"cs2.zombieden.cn:27050",
                         "cs2.zombieden.cn:27051",
                         "cs2.zombieden.cn:27052",
                         "cs5.zombieden.cn:27050",
                         "cs5.zombieden.cn:27051",
                         "cs5.zombieden.cn:27052",
                         "cs4.zombieden.cn:27050",
                         "cs4.zombieden.cn:27051",
                         "cs4.zombieden.cn:27052",
                         "cs7.zombieden.cn:27050",
                         "cs7.zombieden.cn:27051",
                        };
        for(int i=0;i<tail.length;i++){
            String url = "https://zombieden.cn/getserverinfo.php/?address="+tail[i];
            Connection.Response document = Jsoup.connect(url).timeout(4000).userAgent("Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.15").ignoreContentType(true).execute();
            System.out.println(document.body());
            String res = document.body();
            JSONObject json = JSON.parseObject(res);
            resA.add(json);
        }
        return resA;
    }
    /*
     * unicode编码转中文
     */
    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }
}
