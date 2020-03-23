package CSCI1082.century.edu.game;

import CSCI1082.century.edu.display.Window;

public class Game {
	Window window;
	 int width;
	 int height;
	 
	public Game(int width, int height, String title) {
		this.width = width;
		this.height = height;
		
		 window = new Window(width,height,title);
	}
	
	public Window getWindow() {
		return window;
	}
	
}
