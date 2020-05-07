package CSCI1082.century.edu.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	private boolean[] keys;
	public boolean enter;
	public boolean esc;
	public boolean a;
	public boolean d;
	public boolean q;
	public boolean e;
	
	private int counter;
	
	public KeyManager(){
		keys = new boolean[256];
		counter = 0;
	}
	
	public void tick() {
		enter=keys[KeyEvent.VK_ENTER];
		esc=keys[KeyEvent.VK_ESCAPE];
		a=keys[KeyEvent.VK_A];
		d=keys[KeyEvent.VK_D];
		q=keys[KeyEvent.VK_Q];
		e=keys[KeyEvent.VK_E];
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
