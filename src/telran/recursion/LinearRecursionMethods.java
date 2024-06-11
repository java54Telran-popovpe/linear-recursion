package telran.recursion;


public class LinearRecursionMethods {
	public static int factorial( int n) {
		if ( n <  0)
			throw new IllegalArgumentException("n cannot be negative");
		int result = 0;
		if ( n == 0 )
			result = 1;
		else 
			result = n * factorial( n - 1 );
		return result;
	}
	public static int pow1( int a, int b ) {
		if ( b < 0 ) {
			throw new IllegalArgumentException("b canno be negative");
		}
		int res = 1;
		if ( b != 0 )
			res = a * pow1( a, b - 1);
		return res;
	}
	/**
	 * 
	 * @param a - any integer
	 * @param b - positive number
	 * @return a^ b 
	 * no cycles
	 * only arithmetic opertaions +, -
	 * aditional functions if any with the same limitations
	 */
	public static int pow( int a, int b) {
		int positiveBase = Math.abs(a);
		if ( b < 0 )
			throw new IllegalArgumentException();
		int res = 1;
		if ( b != 0 )
			res = product(positiveBase, pow( positiveBase, b - 1 ));
		return  a < 0 && b % 2 != 0 ? -res : res;
	}

	private static int product(int a, int b) {
		int res = a;
		if ( b != 1) 
			res = a + product(a, b - 1 );
		return res;
	}
	
	
	public static void displayArray ( int[] array) {
		displayArray( 0, array, false );
	}
	
	public static void displayArrayReversed( int [] array) {
		displayArray( 0, array, true );
	}
	private static void displayArray(int index, int[] array, boolean isReversed) {
		if ( index < array.length) {
			if ( isReversed ) {
				displayArray(index + 1, array, isReversed);
				System.out.print(array[index] + " ");
			} else {
				System.out.print(array[index] + " ");
				displayArray(index + 1, array, isReversed);
			}
		}
	}
	
	public static int sum(int [] array) {
		return sum(0, array);
	}
	private static int sum(int index, int[] array) {
		int res = 0;
		if(index < array.length) {
			res = array[index] + sum(index + 1, array);
		}
		return res;
	}
	public static void reverse(int[] array ) {
		reverse( 0, array.length - 1, array );
	}
	private static void reverse(int left, int right, int[] array) {
		if ( left < right ) {
			int tmp = array[left];
			array[left] = array[right];
			array[right] = tmp;
			reverse(left + 1, right - 1, array );
		}
	}
	
	/**
	 * 
	 * @param x - any integer number
	 * @return x ^ 2
	 * allowed arithmetics only plus and minus
	 * no additional functions allowed
	 * no static fields
	 * 
	 * Recursion model: n^2 = (n-1)^2 + n + 1 - 1
	 * Exit without recursion: if n = 1 return 1;
	 * Using Math.abs(x) because n^2 = (-n)^2 
	 */
	public static int square(int x) {
		x = Math.abs(x);
		int res = 0;
		if ( x == 1 )
			res = 1;
		else 
			res = square( x - 1 ) + x + x - 1 ;
		return res;
	}
	
	/**
	 * 
	 * @param str - string
	 * @param substr - substring
	 * @return true if subtsr is substring of a string, false otherwise
	 * no cycles
	 * allowed String methods are charAt(int index), substring( int beginIndex), length
	 * 
	 */
	public static boolean isSubstring( String str, String substr) {
		boolean result = false;
		if ( substr.length() > str.length() ) 
			result = false;
		else {
			result = compareFromBeginning(str, substr) || isSubstring(str.substring(1), substr);
		}
		
		return result;
	}
	private static boolean compareFromBeginning(String str, String substr) {
		boolean result = false;
		if ( substr.length() == 1 )
			result = str.charAt(0) == substr.charAt(0);
		else {
			if ( str.charAt(0) == substr.charAt(0) && compareFromBeginning(str.substring(1), substr.substring(1)))
				result = true;
		}
		return result;
	}

}
