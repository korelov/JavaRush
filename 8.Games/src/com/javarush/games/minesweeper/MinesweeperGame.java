package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private int countMinesOnField;

    public void setCountMinesOnField() {
        this.countMinesOnField++;
    }

    public int getCountMinesOnField() {
        return countMinesOnField;
    }

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {

                if (getRandomNumber(10) == 0) {
                    gameField[i][j] = new GameObject(j, i, true);
                    setCellColor(j, i, Color.ORANGE);
                    setCountMinesOnField();
                } else {
                    gameField[i][j] = new GameObject(j, i, false);
                    setCellColor(j, i, Color.ORANGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        MinesweeperGame minesweeperGame = new MinesweeperGame();
        minesweeperGame.initialize();
    }
}
