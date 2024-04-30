package org.example;

import java.util.Scanner;

public class Game {
    Board gameBoard = new Board();

    Game()  {
        System.out.println("TicTacToe game begins!");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        gameBoard.drawBoard();
        char currentPlayer = 'O';

        while (true) {
            try {
                System.out.println("Player " + currentPlayer + ", make your move (column, row):");
                String input = scanner.nextLine();
                String[] parts = input.split(",");
                if (parts.length == 2) {
                    int x = Integer.parseInt(parts[0].trim()) - 1;
                    int y = Integer.parseInt(parts[1].trim()) - 1;

                    if(gameBoard.isCellFree(gameBoard.getCellSign(x, y)))  {
                        if (currentPlayer == 'O') {
                            gameBoard.setO(x, y);
                        } else {
                            gameBoard.setX(x, y);
                        }
                    }
                    else {
                        throw new IllegalArgumentException();
                    }

                    gameBoard.drawBoard();

                    if (gameBoard.isPlayerWon(currentPlayer)) {
                        System.out.println("Player " + currentPlayer + " won the game!");
                        break;
                    }

                    currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
                }
                else {
                    throw new IllegalArgumentException("There should be another number of arguments");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inappropriate format of data!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Inappropriate value of coordinate!");
            }
            catch (IllegalArgumentException e)  {
                if((e.getMessage() != null && e.getMessage().equals("There should be another number of arguments"))) {
                    System.out.println(e.getMessage());
                }
                else    {
                    System.out.println("This cell is already occupied!");
                }
            }
        }

        scanner.close();
    }



}
