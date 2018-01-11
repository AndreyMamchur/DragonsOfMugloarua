package ua.DragonsOfMugolar.utils;

import org.jsoup.Jsoup;

import java.io.IOException;

public class GameUtils {

    public static String getJson (String url){
        String json = "";
        try {
            json = Jsoup.connect(url).ignoreContentType(true).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }


}
