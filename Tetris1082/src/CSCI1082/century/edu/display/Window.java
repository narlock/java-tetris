package CSCI1082.century.edu.display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Window{

	JFrame frame;
	Canvas canvas;
	
	private int width;
	private int height;
	private String title;

	public Window(int width, int height) {
		this.width = width;
		this.height = height;
		this.title = "Tetris1082";
		createNewWindow();
	}
	
	public Window(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
		createNewWindow();
	}
	
	private void createNewWindow() {
		/*Creates a JFrame
		 * A JFrame creates a window which the user can interact with*/
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		/*Creates a Canvas
		 * A Canvas creates a blank rectangle that can be drawn on
		 * The Canvas Class can also detect user input*/
		canvas = new Canvas();
		/*Sets the Preferred, Maximum, and Minimum Sizes so that
		 * the Canvas cannot be a different size than the frame*/
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		/*Makes it so the canvas is not focusable,
		 * meaning user input will go to the frame*/
		canvas.setFocusable(false);	
	}
	
	public static Canvas getCanvas() {
		return canvas;
	}

}
