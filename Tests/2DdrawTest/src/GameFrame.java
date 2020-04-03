import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JPanel {
	public GameFrame() {
		setFocusable(true);
	}
	
	public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.white);
        g.setFont(new Font("Lucida Console", Font.BOLD, 20));
        
        //Drawing the board
        int Y_MAX = 24;
        int X_MAX = 10;
        int tileSize = 30;
        
        for(int x = 0; x < X_MAX; x++) {
        	for(int y = 0; y < Y_MAX; y++) {
        		//({starting x/y} + {x_index * tileSize})
        		g.drawRect(480 + (x*tileSize), 0 + (y*tileSize), tileSize, tileSize);
        		
        	}
        }
        
        //Drawing Statistics
        g.setColor(Color.black);
        g.drawRect(80, 25, 360, 480);
        
        g.setColor(Color.red);
        g.drawString("STATISTICS", 185, 50);
        
        
        //Drawing Leader board
        g.setColor(Color.black);
        //g.drawRect(x, y, width, height);
        g.setColor(Color.red);
        g.drawString("HIGHSCORE", 950, 50);
        
    }
}
