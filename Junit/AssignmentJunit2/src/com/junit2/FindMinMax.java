package com.junit2;

public class FindMinMax {
	public static MinMax maxMinInArray (  int[] inputArray  )
	{ 	MinMax obj = new MinMax();
		int min = inputArray[0];
		int max = inputArray[0];
		for(int i = 1 ; i < inputArray.length ; i++)
		{	if(  inputArray[i] > max )
				max=inputArray[i];
			if(  inputArray[i] < min  )
				min=inputArray[i];
		}
obj.setMinMax(min,max);
		return obj;
 }	
}

