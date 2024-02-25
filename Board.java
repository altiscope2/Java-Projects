package TicTacToe;


//class to create game board
public class Board {
    private char[][] cells = new char[3][3];
    
    //constructor to initialize new instance of board class
    public Board() {
    	//create empty game board 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
            	
                cells[row][col] = '-';
            }
        }
    }
//function to return value of rows and columns
    public char getCellValue(int row, int col) {
        return cells[row][col];
    }

    public void setCellValue(int row, int col, char symbol) {
        cells[row][col] = symbol;
    }

    //check board for 3 in a row in any direction of the same characters 
    public boolean checkWin(char symbol) {
        // check rows
        for (int row = 0; row < 3; row++) {
            if (cells[row][0] == symbol && cells[row][1] == symbol && cells[row][2] == symbol) {
                return true;
            }
        }

        // check columns
        for (int col = 0; col < 3; col++) {
            if (cells[0][col] == symbol && cells[1][col] == symbol && cells[2][col] == symbol) {
                return true;
            }
        }

        // check diagonals
        if (cells[0][0] == symbol && cells[1][1] == symbol && cells[2][2] == symbol) {
            return true;
        }
        if (cells[0][2] == symbol && cells[1][1] == symbol && cells[2][0] == symbol) {
            return true;
        }

        return false;
    }
    //check for tied  game  
    public boolean checkTie() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (cells[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //display header row
        sb.append("  1 2 3\n");
        //for loop to move over rows 
        for (int row = 0; row < 3; row++) {
        	//adds row +1 and a space
            sb.append(row + 1).append(" ");
            for (int col = 0; col < 3; col++) {
                sb.append(cells[row][col]).append(" ");
            }
            //move cursor to next row
            sb.append("\n");
        }
        return sb.toString();
    }
}