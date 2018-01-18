package ua.DragonsOfMugolar.service;

import com.google.gson.*;
import org.springframework.stereotype.Service;
import ua.DragonsOfMugolar.entity.Dragon;
import ua.DragonsOfMugolar.entity.Game;
import ua.DragonsOfMugolar.utils.GameUtils;

import java.lang.reflect.Type;

@Service
public class GameService {
    public static Game game;
    public static String startGameUrl = "http://www.dragonsofmugloar.com/api/game";
    public static String weatherUrl = "http://www.dragonsofmugloar.com/weather/api/report/{";
    public static String battleUrl = "";

    public void updateBattleUrl(){
        GameService.battleUrl = GameService.startGameUrl + "/{" + GameService.game.getGameId() + "}/solution";
    }

    public void updateWeatherUrl(){
        GameService.weatherUrl = GameService.weatherUrl + GameService.game.getGameId() + "}";
    }

    public Game startGame() {
        getGame();
        updateBattleUrl();
        updateWeatherUrl();
        return game;
    }

    public Game getGame(){
        String gameJson = GameUtils.getJson(startGameUrl);
        Gson gson = new Gson();
        game = gson.fromJson(gameJson, Game.class);
        return game;
    }

    public void createDragon(Dragon dragon) {
        game.setDragon(dragon);
    }

    public String startBattle() {
//        Gson gson1 = new GsonBuilder().generateNonExecutableJson();
        JsonSerializer<Game> serializer = new JsonSerializer<Game>() {
            @Override
            public JsonElement serialize(Game game, Type type, JsonSerializationContext jsonSerializationContext) {
                JsonObject jsonGame = new JsonObject();
                return jsonGame;
            }
        };

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String game1 = gson.toJson(game, Game.class);
        System.out.println(game1);
//        String json = GameUtils.gameToJson(game);
//        System.out.println(json);
//        String response = GameUtils.putJson(game1);
        String response = GameUtils.putJsonNet(game1);
//        System.out.println(response);
        return response;
    }
}
