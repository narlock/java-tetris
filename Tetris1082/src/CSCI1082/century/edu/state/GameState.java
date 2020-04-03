package CSCI1082.century.edu.state;

import java.awt.Color;
import java.awt.Graphics;

import CSCI1082.century.edu.game.Board;

public class GameState extends State{
	private Board b;
	
	private int size;
	
	public void render(Graphics g) {
		
		int[][] tmp = b.getBoard();
		
		for(int i = 0; i < tmp.length; i++)
			for(int j = 0; j < tmp[i].length; j++) {
				if(tmp[i][j] == 1) {
					g.setColor(Color.WHITE);
					g.fillRect(j*size, i*size, size, size);
				}else {
					g.setColor(Color.BLACK);
					g.fillRect(j*size, i*size, size, size);
				}
			}
	}
	
	public GameState(int width, int height) {
		b = new Board();
		b.addPiece();
		
		/*Will Determine what size should be so that 
		 * the drawn Board fits in the game window*/
		int tmpBoardWidth = (width/b.getColumns());
		int tmpBoardHeight = (height/b.getRows());
		if(tmpBoardWidth<tmpBoardHeight)
			size = tmpBoardWidth;
		else
			size = tmpBoardHeight;
		
		
	}
}
