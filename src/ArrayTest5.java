
public class ArrayTest5 {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10;
		int[] arr = new int [ARRAY_LENGTH] ;
		
		System.out.printf("%s%10s\n", "Index" , "Value");
		
		for(int i=0 ; i<ARRAY_LENGTH ; i++) 
		{
			arr[i] = 2 + 2 * i;
		}
          
		for(int i=0 ; i<ARRAY_LENGTH ; i++)
		{
          System.out.printf("%5d%9d\n", i , arr[i] );
	    }
	}

}
