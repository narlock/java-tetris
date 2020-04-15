package CSCI1082.century.edu.state;

import java.awt.Color;
import java.awt.Graphics;

import CSCI1082.century.edu.game.Board;

public class GameState extends State{
	private Board b;
	
	private int size;
	private int width;
	private int height;
	private int rows;
	private int columns;
	public void paint(Graphics g) {
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < columns; j++) {
				switch(b.getElement(i, j)) {
					case 0: 
						g.setColor(Color.black);
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
				g.fillRect((width/3)+j*size, (height-(size*rows))/2-1+i*size, size, size);
			}
	}
	
	private void getInput() {
		
	}
	
	public GameState(int width, int height) {
		super();
		b = new Board();
		b.addPiece();
		
		this.width = width;
		this.height = height;
		this.rows = b.getRows();
		this.columns = b.getColumns();
		
		/*Will Determine what size should be so that 
		 * the drawn Board fits in the game window*/
		size = width/(b.getColumns()*3);
	}
}
