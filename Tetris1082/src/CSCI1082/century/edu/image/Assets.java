package CSCI1082.century.edu.image;

import java.awt.image.BufferedImage;

import CSCI1082.century.edu.utilities.ImageLoader;

public class Assets {
	
	public static BufferedImage menuBackground;
	
	public static BufferedImage gameBackground;
	
	public static BufferedImage piece;
	
	public static void init() {
		menuBackground = ImageLoader.loadImage("/textures/menu.png");
		gameBackground = ImageLoader.loadImage("/textures/gameStateBg.png");
	}
}
