package ua.DragonsOfMugolar.entity;

import com.google.gson.annotations.Expose;

public class Game {

    private long gameId;

    private Knight knight;

    @Expose
    private Dragon dragon;

    public Game() {
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

}
