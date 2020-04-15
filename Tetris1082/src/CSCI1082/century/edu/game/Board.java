package CSCI1082.century.edu.game;

public class Board {
	private int[][] board;
	private int columns,rows;
	
	private int[][] nextPiece;
	
	public void addPiece() {
		for(int i = 0; i < nextPiece.length; i++)
			for(int j = 0; j < nextPiece[i].length; j++)
				board[i][j] = nextPiece[i][j];
		nextPiece = Piece.randomPiece();
	}
	
	public void checkRows() {
		
	}
	
	public int[][] getBoard(){
		return board;
	}
	
	public void clearRow(int row) {
		for(int i = 0; i < board[row].length; i++)
			board[row][i] = 0;
	}
	
	public void clearBoard() {
		
	}
	
	public void tick() {
	}

	public int getColumns() {
		return columns;
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getElement(int x, int y) {
		return board[x][y];
	}
	
	public Board() {
		columns = 10;
		rows = 24;
		board = new int[24][10];
		
		nextPiece = Piece.randomPiece();
	}
	
}
