package MultiDimensional;

public class IntArray {

	public static void main(String[] args) {
		int [][] a = { {1,2,3} , {4,5,6} }; 
		int [][] b = { {1,2} , {3} , {4,5,6} };
		 System.out.println("Values in a by row are  ");
		 OutputArray(a);
		 
		 System.out.println("Values in b by row are  ");
		 OutputArray(b);
		
}
  
	
	
	public static void OutputArray(int [][] array)
	{
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				System.out.printf("%d  ", array[row][col]);
				
			}
			System.out.println();
		}
	}
}
