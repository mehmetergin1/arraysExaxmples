import java.util.Random;
public class ArrayTest3 {

	public static void main(String[] args) {
		
			Random randomNumbers = new Random();
			 int[] frequency = new int [7];
			 
			 for( int roll=1; roll<= 6000000 ; roll++)
			 {
				 ++frequency[1 + randomNumbers.nextInt(6) ];
				 
			 }
			 
			 System.out.printf("%s%9s\n", "Face " ," Frequency");
			 
			 for(int Face=1; Face<frequency.length ; Face++)
			 {
				 System.out.printf("%4d%10d\n" , Face , frequency[Face]);
			}

		}



	}


