package CSCI1082.century.edu.display;

import java.awt.Color;

import javax.swing.JFrame;

import CSCI1082.century.edu.game.Game;

public class Window{

	private JFrame frame;
	private Game game;
	
	private int width;
	private int height;
	private String title;
	
	public Window(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
		createNewWindow();
	}
	
	private void createNewWindow() {
		/*Creates a JFrame
		 * A JFrame creates a window which the user can interact with*/
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		game = new Game(width-17,height-40);
		
		frame.add(game);
	}
	
	public Game getGame() {
		return game;
	}
	public JFrame getJFrame() {
		return frame;
	}

}
