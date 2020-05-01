package CSCI1082.century.edu.state;

import java.awt.Color;
import java.awt.Graphics;

import CSCI1082.century.edu.game.Board;
import CSCI1082.century.edu.game.Piece;
import CSCI1082.century.edu.game.ScoreCounter;
import CSCI1082.century.edu.image.Assets;
import CSCI1082.century.edu.utilities.Array2D;
import CSCI1082.century.edu.utilities.Handler;

public class GameState extends State{
	private Board b;
	
	private ScoreCounter sc;
	
	private int size;
	private int rows;
	private int columns;
	private int level;
	private double speed;
	private int counter;
	
	private int piecePosX;
	private int piecePosY;
	private int boardPosX;
	private int boardPosY;
	private int boardSizeX;
	private int boardSizeY;
	
	private boolean w;
	private boolean a;
	private boolean s;
	private boolean d;
	
	private int[][] nextPiece;
	private int[][] currentPiece;
	
	public void paint(Graphics g) {
		g.drawImage(Assets.gameBackground, 0, 0, null);

		//Draw the Board
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < columns; j++) {
				switch(b.getElement(i, j)) {
					case 0: 
						g.setColor(Color.BLACK);
						break;
					case 1: 
						g.setColor(Color.red);
						break;
					case 2:
						g.setColor(Color.cyan);
						break;
					case 3:
						g.setColor(Color.orange);
						break;
					case 4:
						g.setColor(Color.GREEN);
						break;
					case 5:
						g.setColor(Color.MAGENTA);
						break;
					case 6:
						g.setColor(Color.PINK);
						break;
					default:
						g.setColor(Color.WHITE);
						break;
				}
				g.fillRect(boardPosX + j*size, boardPosY + i*size, size, size);
			}
		
		//Draw the Piece
		
		for(int i = piecePosY; i < currentPiece.length + piecePosY; i++)
			for(int j = piecePosX; j < currentPiece[0].length + piecePosX; j++) {
				switch(currentPiece[i-piecePosY][j-piecePosX]) {
				case 0: 
					continue;
				case 1: 
					g.setColor(Color.red);
					break;
				case 2:
					g.setColor(Color.cyan);
					break;
				case 3:
					g.setColor(Color.orange);
					break;
				case 4:
					g.setColor(Color.GREEN);
					break;
				case 5:
					g.setColor(Color.MAGENTA);
					break;
				case 6:
					g.setColor(Color.PINK);
					break;
				default:
					g.setColor(Color.WHITE);
					break;
				}
				g.fillRect(boardPosX + j*size, boardPosY + i*size, size, size);
			}
		
		System.out.println("X: " + piecePosX);
		System.out.println("Y: " + piecePosY);
	}
	
	private void getInput() {
		//get keyboard input from handler.getKeyManager();
		
		//if(h.getKeyManager().w && piecePosY > 0)
		//	piecePosY--;
			
		if(h.getKeyManager().a && checkLeft())
			piecePosX--;
		
		//if()
		//	piecePosY++;
		
		if(h.getKeyManager().d && checkRight())
			piecePosX++;
		
	}
	
	public void tick() {
		
		getInput();
		
		if((checkBottom()) || (piecePosY > (rows - currentPiece[0].length))) {
			
			b.addPiece(piecePosY, piecePosX, currentPiece);
			currentPiece = nextPiece;
			nextPiece = Piece.randomPiece();
			
			piecePosX = 0;
			piecePosY = 0;
		}
		
		if(counter >= 2) {

			piecePosY++;
			counter = 0;
		}
		
		counter++;
	}
	
	private boolean checkLeft() {
		if(piecePosX == 0)
			return false;
		
		int counter = 0;
		
		for(int row = 0; row < currentPiece.length; row++)
			if(Array2D.getLeftElement(currentPiece, row) != null
			&& b.getElement(piecePosY + row,piecePosX + Array2D.getLeftElement(currentPiece, row)[1]-1) == 0)
				counter++;
		
		if(counter == currentPiece.length)
			return true;
		return false;
	}
	
	private boolean checkRight() {
		if(piecePosX == 10 - currentPiece[0].length)
			return false;
		
		int counter = 0;
		
		for(int row = 0; row < currentPiece.length; row++)
			if(Array2D.getRightElement(currentPiece, row) != null
			&& b.getElement(piecePosY + row, piecePosX + Array2D.getRightElement(currentPiece, row)[1]+1) == 0)
				counter++;
		
		if(counter == currentPiece.length)
			return true;
		return false;
	}
	
	private boolean checkBottom() {
		if(piecePosY == 22)
			return true;
		
		for(int column = 0; column < currentPiece[0].length; column++)
			if(Array2D.getBottomElement(currentPiece, column) != null 
			&& b.getElement(piecePosY+Array2D.getBottomElement(currentPiece, column)[1] + 1,piecePosX+column) != 0)
				return true;
		return false;
	}
	
	public GameState(Handler h) {
		super(h);
		b = new Board();
		//b.addPiece();
		this.rows = b.getRows();
		this.columns = b.getColumns();
		size = 25;
		counter = 10;
		level = 1;
		speed = 0.01;
		
		boardSizeX = size * columns;
		boardSizeY = size * rows;
		boardPosX = (h.getGame().getWidth()/2) - (boardSizeX/2);
		boardPosY = (h.getGame().getHeight()/2) - (boardSizeY/2);
		
		currentPiece = Piece.randomPiece();
		nextPiece = Piece.randomPiece();
	}
}
