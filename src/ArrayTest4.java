import java.util.Scanner;
public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("dizinin kaç elemanlı oldugunu girin :");
		int len = in.nextInt();
		in.nextLine();
		String[] fruits = new String[len];
		
		for(int i=0 ; i< fruits.length ; i++)
		{
			System.out.println("dizinin "+(i+1)+". elemanını giriniz : ");
			fruits[i] = in.nextLine();
			
		}

		for(int i=0 ; i<fruits.length ;i++)
		{
			System.out.println(fruits[i]);
		}
	
	}
           
}
