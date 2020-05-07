package CSCI1082.century.edu.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JPanel;

import CSCI1082.century.edu.display.Window;
import CSCI1082.century.edu.image.Assets;
import CSCI1082.century.edu.input.KeyManager;
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
	 private int count;
	 
	//Render
	private Graphics g;
	 
	//States
	private State gameState;
	private State menuState;
	
	//Inputs
	private KeyManager km;
	private MouseManager mm;
	
	//Misc
	boolean running = false;
	private Handler h;
	
	public Window getWindow() {
		return window;
	}
	
	public void init(){
		h = new Handler(this);
		Assets.init();

		gameState = new GameState(h);
		menuState = new MenuState(h);
		State.setCurrentState(menuState);
		
		running = true;
	}
	
	public void tick() {
		km.tick();
		
		if(State.getCurrentState() != null)
			State.getCurrentState().tick();
	}
	
	public void paint(Graphics g) {
		//Draw
		if(State.getCurrentState() != null)
			State.getCurrentState().paint(g);
	}
	
	public void run() {
		
		init();
		
		while(running == true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.requestFocus();
			tick();
			repaint();
		}
		
		
	}
	
	public KeyManager getKeyManager() {
		return km;
	}
	
	public Game(int width, int height) {
		this.width = width;
		this.height = height;
		this.setSize(width, height);

		km = new KeyManager();
		
		this.setFocusable(true);
		this.requestFocus();

		this.addKeyListener(km);
	}
	
}
