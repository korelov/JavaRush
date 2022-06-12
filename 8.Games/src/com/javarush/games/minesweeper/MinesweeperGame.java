package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];


    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }


    private void createGame() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = new GameObject(j, i);
                setCellColor(j, i, Color.ORANGE);
            }
        }
    }

    public static void main(String[] args) {
        MinesweeperGame minesweeperGame = new MinesweeperGame();
        minesweeperGame.initialize();
    }
}
