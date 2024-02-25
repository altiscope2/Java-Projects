package TicTacToe;
//class stores symbols used by each player
	public class Play {
	    private char symbol;
	    //creates new instance of player &sets symbol
	    public Play(char symbol) {
	        this.symbol = symbol;
	    }
	    //allows other classes to get player symbol
	    public char getSymbol() {
	        return symbol;
	    }
	}

