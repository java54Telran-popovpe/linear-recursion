package telran.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static telran.recursion.LinearRecursionMethods.*;

class LinearRecursionTest {
	int[] numbers;
	@BeforeEach
	void setUp() {
		numbers = new int[] { 9, -9, 100, -50};
	}

	@Test
	void factornalTest() {
		assertEquals(24, factorial(4));
	}
	
	@Test
	void pow1Test() {
		assertEquals(100, pow1(10, 2));
		assertEquals(100, pow1(-10, 2));
		assertEquals(100, pow1(-10, 2));
		assertEquals(100, pow1(-10, 2));
		assertEquals(1, pow1(1000, 0));
		assertEquals(1, pow1(-1000, 0));
	}
	
	@Test
	void displayArrayTest() {
		System.out.println("array in direct order");
		displayArray(numbers);
		System.out.println();
	}
	
	@Test
	void displayReversedArrayTest() {
		System.out.println("array in reversed order");
		displayArrayReversed(numbers);
		System.out.println();
	}
	
	@Test
	void sumTest() {
		assertEquals(50, sum(numbers));
	}
	
	@Test
	void reverseTest() {
		reverse(numbers);
		int[] expected = { -50, 100, -9, 9 };
		assertArrayEquals(expected, numbers );
		
	}
	
	@Test
	void squareTest() {
		assertEquals(100, square(10));
		assertEquals(100, square(-10));
	}
	
	@Test
	void isSubstringTest() {
		String str = "blablablabladablbladdal";
		assertTrue(isSubstring(str, "blab"));
		assertTrue(isSubstring(str, "ladd"));
		assertTrue(isSubstring(str, "ablabla"));
		assertTrue(isSubstring(str, "dd"));
		assertFalse(isSubstring(str, "blal"));
		assertFalse(isSubstring(str, "bladds"));
		assertFalse(isSubstring(str, "daba"));
		
	}
	
	@Test
	void powTest() {
		assertEquals(100, pow(10, 2));
		assertEquals(100, pow(-10, 2));
		assertEquals(1000, pow(10, 3));
		assertEquals(-1000, pow(-10, 3));
		assertEquals(1, pow(1000, 0));
		
	}

}
