package CSCI1082.century.edu.state;

import java.awt.Graphics;

import javax.swing.*;

import CSCI1082.century.edu.game.Game;
import CSCI1082.century.edu.image.Assets;
import CSCI1082.century.edu.utilities.Handler;

public class MenuState extends State {
	
	public MenuState(Handler h) {
		super(h);
	}

	public void paint(Graphics g) {
		//Draws the menu background
		g.drawImage(Assets.menuBackground,0,0,null);
		
	}

	private void getInput() {
		//Enter button starts the game
		if(h.getKeyManager().enter) {
			System.out.println("Game Started!");
			State.setCurrentState(h.getGame().gameState);
		}
		
		//Exit button will close the program
		if(h.getKeyManager().esc) {
			System.exit(1);
		}
	}
	
	public void tick() {
		//continuously ticks for key inputs
		getInput();
		
	}
}
