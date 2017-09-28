package homework1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sorting.ISort;

public class MySortTest {
	ISort algorithm;

	@Before
	public void setUp() throws Exception {
		algorithm = new MySort();
	}

	@Test	
	public void testNull() {
		algorithm.sort(null);
	}
	
	@Test
	public void testEmpty() {
		int[] expected = {};		

		int[] actual = {};
		algorithm.sort(actual);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSingleElement() {
		int[] expected = {2};		
		int[] actual = {2};
		algorithm.sort(actual);
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testPositive() {
		int[] expected = {1,2};		

		int[] actual = {2,1};
		algorithm.sort(actual);
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testNegative() {
		int[] expected = {-2,1};		

		int[] actual = {1,-2};
		algorithm.sort(actual);
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testPermutation() {
		int[] expected = {-2,0,1,2,3,5};		

		int[] actual = {3,-2,1,0,5,2};
		algorithm.sort(actual);
		
		assertArrayEquals(expected, actual);
	}
}
