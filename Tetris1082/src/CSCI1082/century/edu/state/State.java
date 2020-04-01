package CSCI1082.century.edu.state;

import java.awt.Graphics;

public abstract class State {
	private static State currentState = null;
	
	public static State getCurrentState() {
		return currentState;
	}

	public static void setCurrentState(State currentState) {
		State.currentState = currentState;
	}

	public abstract void render(Graphics g);
	
}
