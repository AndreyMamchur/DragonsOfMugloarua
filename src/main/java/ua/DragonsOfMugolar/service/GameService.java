package ua.DragonsOfMugolar.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import ua.DragonsOfMugolar.entity.Game;
import ua.DragonsOfMugolar.utils.GameUtils;

@Service
public class GameService {
    public static Game game;
    private String startGameUrl = "http://www.dragonsofmugloar.com/api/game";
    private String weatherUrl = "http://www.dragonsofmugloar.com/weather/api/report/{gameId}";
    private String battleUrl = "http://www.dragonsofmugloar.com/api/game/{gameid}/solution";

    public Game startGame() {

        getGame();
        return game;
    }

    public Game getGame(){
        String gameJson = GameUtils.getJson(startGameUrl);
        Gson gson = new Gson();
        game = gson.fromJson(gameJson, Game.class);
        return game;
    }
}
