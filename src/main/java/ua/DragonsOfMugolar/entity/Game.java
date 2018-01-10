package ua.DragonsOfMugolar.entity;

public class Game {
    private long idGame;
    private int allBattle;
    private int victoryBattle;
    private int defeatBattle;

    public Game() {
    }

    public Game(int allBattle, int victoryBattle, int defeatBattle) {
        this.allBattle = allBattle;
        this.victoryBattle = victoryBattle;
        this.defeatBattle = defeatBattle;
    }

    public Game(long idGame, int allBattle, int victoryBattle, int defeatBattle) {
        this.idGame = idGame;
        this.allBattle = allBattle;
        this.victoryBattle = victoryBattle;
        this.defeatBattle = defeatBattle;
    }

    public long getIdGame() {
        return idGame;
    }

    public void setIdGame(long idGame) {
        this.idGame = idGame;
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
}
