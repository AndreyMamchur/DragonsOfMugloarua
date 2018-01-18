package ua.DragonsOfMugolar.utils;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import ua.DragonsOfMugolar.service.GameService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

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

    public static String putJson (String json){
        String response = "";
        try {
            response = Jsoup.connect(GameService.battleUrl).timeout(60000).ignoreContentType(true)
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                    .header("Content-Type", "application/json;charset=UTF-8")
                    .method(Connection.Method.POST)
                    .requestBody(json)
                    .ignoreHttpErrors(true)
                    .execute()
                    .body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static String putJsonNet(String json){
        String response = "";
        HttpURLConnection connection = null;
        try{
            connection = (HttpURLConnection) new URL(GameService.battleUrl).openConnection();
            connection.setConnectTimeout(250);
            connection.setReadTimeout(250);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(json.getBytes());
            outputStream.flush();

            if (connection.getResponseCode() != HttpURLConnection.HTTP_CREATED){
                throw new RuntimeException("Failed : HTTP error code : "
                + connection.getResponseCode());
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            System.out.println("Output from Server .....\n");
            while ((response = bufferedReader.readLine()) != null){
                System.out.println(response);
            }

            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection !=null){
                connection.disconnect();
            }
        }
        return response;
    }

}
