package CSCI1082.century.edu.game;

public class Board {
	private int[][] board;
	private int columns,rows;
	
	public void addPiece(int posX, int posY, int[][] piece) {
		for(int i = 0; i < piece.length; i++)
			for(int j = 0; j < piece[i].length; j++)
				if(piece[i][j] != 0)
					board[i + posX][j + posY] = piece[i][j];
	}
	
	public void checkRows() {
		for(int i = 0; i < board.length; i++) {
			int tmp = 0;
			for(int j = 0; j < board[i].length; j++)
				if(board[i][j] != 0)
					tmp++;
			if(tmp == board[i].length)
				clearRow(i);
		}
	}
	
	private void dropBoard(int row) {
		int[][] tmp = board;
		
		for(int i = row-1; i >= 0; i--)
			for(int j = 0; j < board[i].length; j++)
				board[i+1][j] = tmp[i][j];
	}
	
	public int[][] getBoard(){
		return board;
	}
	
	private void clearRow(int row) {
		for(int i = 0; i < board[row].length; i++)
			board[row][i] = 0;
		dropBoard(row);
	}
	
	public void clearBoard() {
		
	}
	
	public void tick() {
		checkRows();
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
	}
	
}
