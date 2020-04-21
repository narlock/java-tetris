package CSCI1082.century.edu.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	private boolean[] keys;
	public boolean w;
	public boolean s;
	public boolean a;
	public boolean d;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void tick() {
		w=keys[KeyEvent.VK_W];
		s=keys[KeyEvent.VK_S];
		a=keys[KeyEvent.VK_A];
		d=keys[KeyEvent.VK_D];
	}
	
	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]=true;
		System.out.println("Pressed!");
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]=false;
		System.out.println("Released!");
	}

}
