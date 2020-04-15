package CSCI1082.century.edu.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener, MouseMotionListener {

	public static double mousex, mousey;
	public MouseEvent mouseEvent;
	
	public MouseManager() {
		
	}
	
	public void mouseClicked(MouseEvent e) {
		mousex = e.getX();
        mousey = e.getY();
        
        mouseEvent = e;
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//MouseListener methods that will not be used
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void tick() {
		//mouseClicked(new MouseEvent());
		
	}

}
