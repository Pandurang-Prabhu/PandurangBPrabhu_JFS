package com.Assignment1Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
int[] result  = new int[2];
@Test
void test1() {
result = MinMaxFinder.findMinMax(new int[] {1,2,3,4,5,6,7,8,9,10});
int[] expectedResult = {1,10};
assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
}
@Test
void test2() {
result = MinMaxFinder.findMinMax(new int[] {50,60,70,80});
int[] expectedResult = {50,80};
assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
}
@Test
void test3() {
result = MinMaxFinder.findMinMax(new int[] {0,0,0,0,0,0,1});
int[] expectedResult = {0,1};
assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
}
}