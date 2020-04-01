import java.awt.*;
import javax.swing.*;

public class Main{
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Test");
        	frame.setSize(1280,720);
            frame.setLocationRelativeTo(null);
            frame.add(new GameFrame());
            //frame.add(new MenuFrame());
            //frame.add(new SettingsFrame());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
    }
    
}