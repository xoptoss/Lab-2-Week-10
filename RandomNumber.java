package mainPackage;

import java.util.Random;

public class RandomNumber {

	Random random = new Random();
	int answer,low,high,newLow,newHigh;

	public int GetANumber()
	{
		answer = random.nextInt(9)+1;
		return answer;
	}

	public int GetANumber(int high)
	{
		answer = random.nextInt(high)+1;
		return answer;
	}

	public int GetANumber(int high, int low)
	{
		answer = random.nextInt(high-low)+low;
		return answer;
	}
	public int SetLowNumber(int low)
	{
		newLow = low;
		return low;
	}
	public int SetHighNumber(int high)
	{
		newHigh = high;
		return high;
	}
}
