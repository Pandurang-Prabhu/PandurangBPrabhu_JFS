package com.Assignment1Junit;

public class MinMaxFinder {
	public static int[] findMinMax(int[] inArra) {
		int[] minMax =new int[2];
		int max = inArra[0];
		int min = inArra[0];
		
		
		for(int i = 1 ; i < inArra.length ; i++)
		{
		if(inArra[i] > max)          
		max=inArra[i];
		if(inArra[i] < min)          
		min=inArra[i];
		}

		minMax[0] = min;
		minMax[1] = max;

		return minMax; 
		}
		

		
		
	}

	
