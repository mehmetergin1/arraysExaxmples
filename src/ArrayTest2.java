
public class ArrayTest2 {

	public static void main(String[] args) {
		int[] arr = { 0,0,0,0,0,0,1,2,4,2,1 };
		System.out.println("Grade Distribution: ");
		for( int counter=0 ; counter<arr.length ; counter++)
		{
			if( counter== 10)
			{
				System.out.printf("%5d   : ", 100);
			}
			else {
				System.out.printf("%2d - %2d : "  , counter*10 , counter*10 + 9);
			}
			  for(int stars=0 ; stars< arr[counter] ; stars++)
			  {
				  System.out.print("*");
			  }
		        System.out.println();
		}
		
	}


	}


