package org.example;

public class Board {
    private char[][] cells;

    public Board() {
        this.cells = new char[3][3];

        for(int i=0; i < 3; i++)   {
            for(int j=0; j < 3; j++)   {
                cells[i][j] = '_';
            }
        }
    }

    public void drawBoard() {
        for(int i=0; i < 3; i++)   {
                System.out.println(cells[i][0] + " " + cells[i][1] + " " + cells[i][2]);
        }
    }

    public char getCellSign(int x, int y)   {

        return cells[x][y];
    }

    public boolean isCellFree(char cell)    {
        if(cell == '_') {
            return true;
        }
        else {
            return false;
        }
    }

    public void setO(int x, int y)   {
        cells[x][y] = 'O';
    }

    public void setX(int x, int y)   {
        cells[x][y] = 'X';
    }

    public boolean isPlayerWon(char player) {
        if((cells[0][0] == player && cells[0][1] == player && cells[0][2] == player) ||
                (cells[1][0] == player && cells[1][1] == player && cells[1][2] == player) ||
                (cells[2][0] == player && cells[2][1] == player && cells[2][2] == player) ||
                (cells[0][0] == player && cells[1][0] == player && cells[2][0] == player) ||
                (cells[0][1] == player && cells[1][1] == player && cells[2][1] == player) ||
                (cells[0][2] == player && cells[1][2] == player && cells[2][2] == player) ||
                (cells[0][0] == player && cells[1][1] == player && cells[2][2] == player) ||
                (cells[0][2] == player && cells[1][1] == player && cells[2][0] == player))    {
            return true;

        }
        else {
            return false;
        }
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == '_') {
                    return false;
                }
            }
        }
        return !isPlayerWon('X') && !isPlayerWon('O');
    }

}
