package CSCI1082.century.edu.utilities;

import CSCI1082.century.edu.game.Game;
import CSCI1082.century.edu.input.KeyManager;

public class Handler {
	
	private Game g;
	
	public Handler(Game g) {
		this.g = g;
	}
	
	public KeyManager getKeyManager() {
		return g.getKeyManager();
	}
}
