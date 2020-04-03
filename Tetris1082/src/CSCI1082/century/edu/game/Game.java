package CSCI1082.century.edu.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import CSCI1082.century.edu.display.Window;
import CSCI1082.century.edu.state.GameState;
import CSCI1082.century.edu.state.MenuState;
import CSCI1082.century.edu.state.State;

public class Game{
	//Window
	private Window window;
	 private int width;
	 private int height;
	 
	//Render
	private BufferStrategy bs;
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
	
	public void render() {
		//BufferStrategy Init
		bs = window.getCanvas().getBufferStrategy();
		if(bs == null) {
			window.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, width, height);
		
		//Draw
		if(State.getCurrentState() != null)
			State.getCurrentState().render(g);
		
		//Show Drawing and Dispose Drawing
		bs.show();
		g.dispose();
	}
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		init();
		
		while(running == true) {
			render();
			tick();
		}
		
		
	}
	
	public Game(int width, int height, String title) {
		this.width = width;
		this.height = height;
		window = new Window(width,height,title);
	}
	
}
