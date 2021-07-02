package Generic;

public class GenericMethodTest1 {
	// printArray
	public static void  printArray(Object[] array) {
		for(Object i:array) {
			System.out.println(i);
		}
	}
	
	/*
	public static < E > void printArray( E[] inputArray )
	   {
	      // 输出数组元素            
	         for ( E element : inputArray ){        
	            System.out.println(  element );
	         }
	         
	    }
	*/

	public static void main(String args[]) {
		// Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		printArray(intArray);

		printArray(doubleArray);

		printArray(charArray);

		printArray(args);
	}

	

}