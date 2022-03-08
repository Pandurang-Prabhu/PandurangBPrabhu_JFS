package com.junit2;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
class FindMinMaxTest {
MinMax testObject;
	@Test
	void test1() {
		testObject = FindMinMax.maxMinInArray(new int[] {5,6,60,36,4,345,100,9,1000,130,69});
		int[] expected = {4,1000};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}
	@Test
	void test2() {
		testObject = FindMinMax.maxMinInArray(new int[] {34,81,71,91,101,1001,10001,100001,1000001});
		int[] expected = {34,1000001};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}
	@Test
	void test3() {
		testObject = FindMinMax.maxMinInArray(new int[] {404,2,123,61,61,901,701,81});
		int[] expected = {2,901};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}
	
}
