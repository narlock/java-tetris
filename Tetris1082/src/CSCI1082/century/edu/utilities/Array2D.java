package CSCI1082.century.edu.utilities;

public class Array2D {
	
	public static int[][] rotateClockwise(int arr2D){
		
		return arr2D;
	}
	
	public static int[][] rotateCounterClockwise(int arr2D){
		
		return arr2D;
	}
	
	public static int[] getBottomElement(int[][] arr2D, int column) {
		for(int i = arr2D.length-1; i >= 0; i--)
			if(arr2D[i][column] != 0) {
				int[] res = {arr2D[i][column], i};
				return res;
			}
		return null;
	}
	
	public static int[] getLeftElement(int[][] arr2D, int row) {
		for(int i = 0; i < arr2D[row].length; i++) 
			if(arr2D[row][i] != 0) {
				int[] res = {arr2D[row][i],i};
				return res;
			}
		return null;
	}
	
	public static int[] getRightElement(int[][] arr2D, int row) {
		for(int i = arr2D[row].length-1; i >= 0; i--)
			if(arr2D[row][i] != 0) {
				int[] res = {arr2D[row][i], i};
				return res;
			}
		return null;
	}
}
