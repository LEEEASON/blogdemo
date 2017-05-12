package com.leeeason.ssm.service.impl;

import com.leeeason.ssm.model.Music;
import com.leeeason.ssm.service.MusicService;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AL on 0009 09 05.
 */
@Service("musicService")
public class MusicSerivceImpl implements MusicService {
    protected String crawl(String url) throws Exception {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build();
             CloseableHttpResponse httpResponse = httpClient.execute(new HttpGet(url))) {
            HttpGet httpGet = new HttpGet(url);
            String result = EntityUtils.toString(httpResponse.getEntity());
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Music> getMusic(String url) {
        try {
            System.out.print("url=" + url);
            String result = crawl(url);
            System.out.print(result);
            Document doc = Jsoup.parse(result);
            System.out.print("doc=" + doc);
            Elements as = doc.select("#top-flag dl:nth-child(2) dd ol li a");
            System.out.print("as" + as );
            List<Music> musics = new ArrayList<>();
            for (Element a : as) {
                Music music = new Music();
                music.setTitle(a.text());
                music.setUrl("http:");
                System.out.print(a.text());

                musics.add(music);
            }
            return musics;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
