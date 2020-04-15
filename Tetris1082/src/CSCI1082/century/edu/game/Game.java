package CSCI1082.century.edu.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JPanel;

import CSCI1082.century.edu.display.Window;
import CSCI1082.century.edu.input.KeyManager;
import CSCI1082.century.edu.image.Assets;
import CSCI1082.century.edu.input.MouseManager;
import CSCI1082.century.edu.state.GameState;
import CSCI1082.century.edu.state.MenuState;
import CSCI1082.century.edu.state.State;
import CSCI1082.century.edu.utilities.Handler;

public class Game extends JPanel{
	//Window
	private Window window;
	 private int width;
	 private int height;
	 
	//Render
	private Graphics g;
	 
	//States
	private State gameState;
	private State menuState;
	

	//Inputs
	private KeyManager km;
	
	//Misc
	boolean running = false;
	private Handler h;
	
	//Listeners
	private MouseManager mouseManager;
	private KeyManager km;
	
	boolean running = false; 
	
	public Window getWindow() {
		return window;
	}
	
	public void init(){
		gameState = new GameState(h);
		menuState = new MenuState(h);
		State.setCurrentState(gameState);
		Assets.init();
		gameState = new GameState(width, height);
		menuState = new MenuState();
		State.setCurrentState(menuState);
		running = true;
	}
	
	public void tick() {
		
	}
	
	public void paint(Graphics g) {
		//Draw
		if(State.getCurrentState() != null)
			State.getCurrentState().paint(g);
	}
	
	public void run() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		init();
		
		while(running == true) {
			repaint();
			tick();
		}
		
		
	}
	
	public KeyManager getKeyManager() {
		return km;
	}
	
	public Game(int width, int height) {
		this.width = width;
		this.height = height;
		this.setSize(width, height);
		this.setBackground(Color.BLUE);
	}
	
}
