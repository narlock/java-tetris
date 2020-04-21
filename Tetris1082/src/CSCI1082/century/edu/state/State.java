package CSCI1082.century.edu.state;

import java.awt.Graphics;

import CSCI1082.century.edu.utilities.Handler;

public abstract class State{
	protected Handler h;
	
	private static State currentState = null;
	
	public static State getCurrentState() {
		return currentState;
	}

	public static void setCurrentState(State currentState) {
		State.currentState = currentState;
	}
	
	public abstract void paint(Graphics g);
	public abstract void tick();
	
	public State(Handler h) {
		this.h = h;
	}
}
