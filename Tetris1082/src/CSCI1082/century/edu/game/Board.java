package CSCI1082.century.edu.game;

public class Board {
	private int[][] board;
	
	private Piece nextPiece = Piece.getRandomPiece();
	
	public Board(int columns, int rows) {
		board = new int[columns][rows];
	}
	
	public void checkRows() {
		
	}
	
	public void clearRow(int row) {
		for(int i = 0; i < board[row].length; i++)
			board[row][i] = 0;
	}
	
	public void clearBoard() {
		for(int row = 0; row < board.length; row++)
			for(int column = 0; column < board[row].length; column++)
				board[row][column] = 0;
	}
	
	public void tick() {
		checkRows();
	}
	
}
