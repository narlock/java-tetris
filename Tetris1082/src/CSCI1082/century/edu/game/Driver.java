package CSCI1082.century.edu.game;

import CSCI1082.century.edu.display.Window;

public class Driver {
	public static void main(String[] args) {
		Window w = new Window(1280,720,"Tetris");
		w.getGame().run();
	}
}
