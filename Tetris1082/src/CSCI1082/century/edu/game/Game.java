package CSCI1082.century.edu.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import CSCI1082.century.edu.display.Window;

public class Game {
	//Window
	private Window window;
	 private int width;
	 private int height;
	
	 //Render
	 private BufferStrategy bs;
	 private Graphics g;
	 
	public Game(int width, int height, String title) {
		this.width = width;
		this.height = height;
		
		 window = new Window(width,height,title);
	}
	
	public Window getWindow() {
		return window;
	}
	
	public void init(){
		
	}
	
	public void render() {
		//BufferStrategy Init
		bs = window.getCanvas().getBufferStrategy();
		if(bs == null) {
			window.getCanvas().createBufferStrategy(3);
		}
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, width, height);
		
		//Draw
		
		
		//Show Drawing and Dispose Drawing
		bs.show();
		g.dispose();
	}
	
}
