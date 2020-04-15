package CSCI1082.century.edu.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JPanel;

import CSCI1082.century.edu.display.Window;
import CSCI1082.century.edu.state.GameState;
import CSCI1082.century.edu.state.MenuState;
import CSCI1082.century.edu.state.State;

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
	
	boolean running = false; 
	
	public Window getWindow() {
		return window;
	}
	
	public void init(){
		gameState = new GameState(width, height);
		menuState = new MenuState();
		State.setCurrentState(gameState);
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
	
	public Game(int width, int height) {
		this.width = width;
		this.height = height;
		this.setSize(width, height);
		this.setBackground(Color.BLUE);
	}
	
}
