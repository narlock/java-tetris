package CSCI1082.century.edu.state;

import java.awt.Color;
import java.awt.Graphics;

public class GameState extends State{
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(0, 0, 100, 100);
	}
	
	public GameState() {
		
	}
}
