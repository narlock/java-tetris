package CSCI1082.century.edu.state;

import java.awt.Color;
import java.awt.Graphics;

import CSCI1082.century.edu.game.Board;

public class GameState extends State{
	private Board b;
	
	public void render(Graphics g) {
		
		int[][] tmp = b.getBoard();
		
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 300, 300);
	}
	
	public GameState() {
		b = new Board();
	}
}
