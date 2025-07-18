package MultiDimensional;

public class Testo {

	public static int[][]  printMatrix(int [][] matrix) {
		
		for(int[] row : matrix) {
			for(int value : row) {
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		
		return matrix;
	}
	
	
	
	
	public static void main(String[] args) {
		int [][] erd = {{1,4,5},{8,3,0},{2,5,3}};
		
		printMatrix(erd);
		

	}

}
