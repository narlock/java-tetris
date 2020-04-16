package CSCI1082.century.edu.state;

import java.awt.Color;
import java.awt.Graphics;

import CSCI1082.century.edu.game.Board;
import CSCI1082.century.edu.utilities.Handler;

public class GameState extends State{
	private Board b;
	
	private int size;
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
				g.fillRect((640-(size*columns))+j*size, 100+i*size, size, size);
			}
		
	}
	
	private void getInput() {
		
	}
	
	public GameState(Handler h) {
		super(h);
		b = new Board();
		b.addPiece();
		this.rows = b.getRows();
		this.columns = b.getColumns();
		size = 25;
	}
}
