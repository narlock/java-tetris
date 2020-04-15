package CSCI1082.century.edu.state;

import java.awt.Graphics;

import CSCI1082.century.edu.utilities.Handler;
import CSCI1082.century.edu.image.Assets;
import CSCI1082.century.edu.input.MouseManager;

public class MenuState extends State{

	public void paint(Graphics g) {
		g.drawImage(Assets.mainMenuBackground, 0, 0, null);
		
	}

	
	public MenuState(Handler h) {
		super(h);
		
	}

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
//	private void getInput() {
//		MouseManager mouse = new MouseManager();
//	}
}
