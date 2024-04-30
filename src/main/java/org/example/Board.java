package org.example;

public class Board {
    private char[][] cells;

    Board() {
        this.cells = new char[3][3];

        for(int i=0; i < 3; i++)   {
            for(int j=0; j < 3; j++)   {
                cells[i][j] = '_';
            }
        }
    }

    public void drawBoard() {
        for(int i=0; i < 3; i++)   {
                System.out.println(cells[i][1] + " " + cells[i][1] + " " + cells[i][1]);
        }
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

    public boolean isXWon() {
        if((cells[0][0] == 'X' && cells[0][1] == 'X' && cells[0][2] == 'X') ||
                (cells[1][0] == 'X' && cells[1][1] == 'X' && cells[1][2] == 'X') ||
                (cells[2][0] == 'X' && cells[2][1] == 'X' && cells[2][2] == 'X') ||
                (cells[0][0] == 'X' && cells[1][0] == 'X' && cells[2][0] == 'X') ||
                (cells[0][1] == 'X' && cells[1][1] == 'X' && cells[2][1] == 'X') ||
                (cells[0][2] == 'X' && cells[1][2] == 'X' && cells[2][2] == 'X') ||
                (cells[0][0] == 'X' && cells[1][1] == 'X' && cells[2][2] == 'X') ||
                (cells[0][2] == 'X' && cells[1][1] == 'X' && cells[2][0] == 'X'))    {
            return true;

        }
        else {
            return false;
        }
    }

    public boolean isOWon() {
        if((cells[0][0] == 'O' && cells[0][1] == 'O' && cells[0][2] == 'O') ||
                (cells[1][0] == 'O' && cells[1][1] == 'O' && cells[1][2] == 'O') ||
                (cells[2][0] == 'O' && cells[2][1] == 'O' && cells[2][2] == 'O') ||
                (cells[0][0] == 'O' && cells[1][0] == 'O' && cells[2][0] == 'O') ||
                (cells[0][1] == 'O' && cells[1][1] == 'O' && cells[2][1] == 'O') ||
                (cells[0][2] == 'O' && cells[1][2] == 'O' && cells[2][2] == 'O') ||
                (cells[0][0] == 'O' && cells[1][1] == 'O' && cells[2][2] == 'O') ||
                (cells[0][2] == 'O' && cells[1][1] == 'O' && cells[2][0] == 'O'))    {
            return true;

        }
        else {
            return false;
        }
    }

}
