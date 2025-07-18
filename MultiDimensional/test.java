package MultiDimensional;

public class test {

	public static void main(String[] args) {
		
		int [][] arr = { {1,8,10},{2,6,17},{3,35,5},{4,103,69} };
		
		int [][] arr2 = new int[4][3];
		
		System.out.printf("%s%10s", "number" , "value" );
		 System.out.println();
		for(int i=0; i< arr.length; i++)
		 {
			System.out.print(" " +arr[i][0]+ "      "); 
			for(int j=1;j<arr[0].length;j++)
			 {
				 System.out.print( "   " +arr[i][j]+ " " );
			 }
			 System.out.println();
		 }
		
		

	}

}
