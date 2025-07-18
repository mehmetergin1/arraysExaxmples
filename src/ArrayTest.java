
public class ArrayTest {

	public static void main(String[] args) {
		int[] array;
		array = new int[10];
		System.out.printf("%s%9s\n" , "Index" , "Value");
		
		for(int counter=0;counter<array.length;counter++)
		{
			System.out.printf("%d%9d\n" , counter , array[counter]);
		}

	}



	}


