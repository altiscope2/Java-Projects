package TicTacToe;
	
	import java.util.InputMismatchException;
	import java.util.Scanner;
//main class of game
	public class TicTacToe {
	    public static void main(String[] args) {
	    	//menu for selection
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Let's play! Get 3 in a Row in any direction \n");
	        System.out.println(" press 1 to Play ");
	        

	        int gameMode = 0;
	        while (gameMode == 0) {
	            try {
	                System.out.print("\nPlease select an option to start ");
	                gameMode = scanner.nextInt();
	                //check for errors and out put message
	                if (gameMode != 1 ) {
	                    throw new InputMismatchException();
	                }
	            } catch (InputMismatchException e) {
	                scanner.nextLine(); 
	                System.out.println("Error! Bad input, please try again.");
	            }
	        }
	        //assign players characters
	        Play player1 = new Play('X');
	        Play player2 = new Play('O');

	        Board board = new Board();

	        boolean gameOver = false;
	        Play currentPlayer = player1;
	        
	        while (!gameOver) {
	            System.out.println("\n" + board.toString());

	            int row = 0;
	            int col = 0;
	            boolean validInput = false;
	            //Ask player for where they want place character start with row then column
	            //
	            while (!validInput) {
	                try {
	                    System.out.print("Player " + currentPlayer.getSymbol() + ", Please enter row (1-3): ");
	                    row = scanner.nextInt() - 1;
	                    System.out.print("Player " + currentPlayer.getSymbol() + ", Please enter column (1-3): ");
	                    col = scanner.nextInt() - 1;
	                    //check if space is taken or number is valid
	               
	                    if (row < 0 || row > 2 || col < 0 || col > 2 || board.getCellValue(row, col) != '-') {
	                        throw new InputMismatchException();
	                    }
	                    validInput = true;
	                    //output message for invalid input
	                } catch (InputMismatchException e) {
	                    scanner.nextLine(); 
	                    System.out.println("Error! Bad input, please try again.");
	                }
	            }

	            board.setCellValue(row, col, currentPlayer.getSymbol());

	            if (board.checkWin(currentPlayer.getSymbol())) {
	                System.out.println("\n" + board.toString());
	                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
	                gameOver = true;
	            } else if (board.checkTie()) {
	                System.out.println("\n" + board.toString());
	                System.out.println("So close, you tied!");
	                gameOver = true;
	            } else {
	                currentPlayer = currentPlayer == player1 ? player2 : player1;
	            }
	        }

	        scanner.close();
	    }
	}
