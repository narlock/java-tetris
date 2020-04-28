package CSCI1082.century.edu.state;

import java.awt.Color;
import java.awt.Graphics;

import CSCI1082.century.edu.game.Board;
import CSCI1082.century.edu.game.Piece;
import CSCI1082.century.edu.utilities.Handler;

public class GameState extends State{
	private Board b;
	
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
	
	public void paint(Graphics g) {
		//Draw the Background
		
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
		
		for(int i = piecePosY; i < nextPiece.length + piecePosY; i++)
			for(int j = piecePosX; j < nextPiece[0].length + piecePosX; j++) {
				switch(nextPiece[i-piecePosY][j-piecePosX]) {
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
		
		if(h.getKeyManager().w && piecePosY > 0)
			piecePosY--;
			
		if(h.getKeyManager().a && piecePosX > 0)
			piecePosX--;
		
		if(h.getKeyManager().s && piecePosY < rows - (nextPiece[0].length-1))
			piecePosY++;
		
		if(h.getKeyManager().d && piecePosX < columns - (nextPiece.length+1))
			piecePosX++;
		
	}
	
	public void tick() {
		
		//tick the game to make pieces fall using counter, speed, and level
		getInput();
		
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
		
		nextPiece = Piece.randomPiece();
	}
}
