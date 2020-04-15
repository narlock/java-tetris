package CSCI1082.century.edu.game;

import CSCI1082.century.edu.display.Window;

public class Driver {
	public static void main(String[] args) {
		Window w = new Window(700,700,"Tetris");
		w.getGame().run();
	}
}
