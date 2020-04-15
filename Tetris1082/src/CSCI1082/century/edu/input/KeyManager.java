package CSCI1082.century.edu.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	private boolean keys[];
	public boolean up;
	public boolean down;
	public boolean left;
	public boolean right;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void tick() {
		up=keys[KeyEvent.VK_W];
		down=keys[KeyEvent.VK_S];
		left=keys[KeyEvent.VK_A];
		right=keys[KeyEvent.VK_D];
	}
	
	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]=true;
		System.out.println("Pressed!");
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]=false;
	}

}
