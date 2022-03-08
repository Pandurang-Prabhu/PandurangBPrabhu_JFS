package com.junit2;


public class MinMax {
	private int[] minMax = new int[2];
	public int[] getMinMax() {
		return minMax;
	}
	public void setMinMax(int min , int max) {
		this.minMax[0] = min;
		this.minMax[1] = max;
	}
}

