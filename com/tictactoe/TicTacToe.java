package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	 public static char[] createBoard() {
		 char [] board = new char[10];
		 
		 for(int i=1; i<10; i++) {
			 board[i]= ' ';
		 }
		return board;
				 
		 }
	 public static void chooseOption() {

			char computerSymbol = '0';

			Scanner sc = new Scanner(System.in);
			System.out.println("give the option 'o' or 'x'");
			char option = sc.next().charAt(0);

			if (option == 'o') {
				computerSymbol = 'x';
			} else if (option == 'x') {
				computerSymbol = 'o';
			}
			System.out.println(" player: " + option + "\n computer :" + computerSymbol);

		}
	 private static void displayBoard(char[] board) {
		 System.out.println("\n"+board[1]+ "|"+board[2]+"|"+board[3]+"|");
		 System.out.println("_____________");
		 System.out.println(""+board[4]+ "|"+board[5]+"|"+board[6]+"|");
		 System.out.println("_____________");
		 System.out.println(""+board[7]+ "|"+board[8]+"|"+board[9]+"|");
		
	 }
	public static void main(String[] args)
	{
		System.out.println("welcome");
	     char[] board = createBoard();
	     chooseOption();
	     displayBoard(board);
	}
}
