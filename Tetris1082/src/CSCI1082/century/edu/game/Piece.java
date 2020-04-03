package CSCI1082.century.edu.game;

public class Piece {
	
	public static final int[][] pieceL = {{1,1,1}
										 ,{1,0,0}};
	
	public static final int[][] pieceJ = {{1,1,1}
										 ,{0,0,1}};
	
	public static final int[][] pieceS = {{0,1,1}
										 ,{1,1,0}};
	
	public static final int[][] pieceZ = {{1,1,0}
										 ,{0,1,1}};
	
	public static final int[][] pieceT = {{0,1,0}
										 ,{1,1,1}};
	
	public static final int[][] pieceI = {{1,1,1,1}};
	
	private final static int[][][] piece= {pieceL, pieceJ, pieceS, pieceZ, pieceT, pieceI};
	
	public static int[][] randomPiece() {
		return piece[(int)(Math.random()*piece.length-1)];
	}
}
