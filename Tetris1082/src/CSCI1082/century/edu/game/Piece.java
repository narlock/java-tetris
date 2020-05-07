package CSCI1082.century.edu.game;

public class Piece {
	
	public static final int[][] pieceL = {{1,1,1}
										 ,{1,0,0}};
	
	public static final int[][] pieceJ = {{2,2,2}
										 ,{0,0,2}};
	
	public static final int[][] pieceS = {{0,3,3}
										 ,{3,3,0}};
	
	public static final int[][] pieceZ = {{4,4,0}
										 ,{0,4,4}};
	
	public static final int[][] pieceT = {{0,5,0}
										 ,{5,5,5}};
	
	public static final int[][] pieceI = {{6,6,6,6}};
	
	public static final int[][] pieceB = {{7,7}
										 ,{7,7}};
	
	public static final int[][] pieceP = {{1}};
	
	private final static int[][][] piece= {pieceL, pieceJ, pieceS, pieceZ, pieceT, pieceI, pieceB, pieceP};
	
	public static int[][] randomPiece() {
		return piece[(int)(Math.random()*piece.length-1)];
	}
}
