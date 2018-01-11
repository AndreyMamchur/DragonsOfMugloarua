package ua.DragonsOfMugolar.entity;

import java.util.List;

public class Game {
    private long gameId;
    private int allBattle;
    private int victoryBattle;
    private int defeatBattle;
    private Knight knight;
    private Dragon dragon;

    public Game() {
    }

    public Game(int allBattle, int victoryBattle, int defeatBattle) {
        this.allBattle = allBattle;
        this.victoryBattle = victoryBattle;
        this.defeatBattle = defeatBattle;
    }

    public Game(long gameId, int allBattle, int victoryBattle, int defeatBattle) {
        this.gameId = gameId;
        this.allBattle = allBattle;
        this.victoryBattle = victoryBattle;
        this.defeatBattle = defeatBattle;
    }

    public Game(long gameId, int allBattle, int victoryBattle, int defeatBattle, Knight knight, Dragon dragon) {
        this.gameId = gameId;
        this.allBattle = allBattle;
        this.victoryBattle = victoryBattle;
        this.defeatBattle = defeatBattle;
        this.knight = knight;
        this.dragon = dragon;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public int getAllBattle() {
        return allBattle;
    }

    public void setAllBattle(int allBattle) {
        this.allBattle = allBattle;
    }

    public int getVictoryBattle() {
        return victoryBattle;
    }

    public void setVictoryBattle(int victoryBattle) {
        this.victoryBattle = victoryBattle;
    }

    public int getDefeatBattle() {
        return defeatBattle;
    }

    public void setDefeatBattle(int defeatBattle) {
        this.defeatBattle = defeatBattle;
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
