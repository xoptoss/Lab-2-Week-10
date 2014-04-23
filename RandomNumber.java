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

	public int GetANumber(int newHigh)
	{
		answer = random.nextInt(newHigh)+1;
		return answer;
	}

	public int GetANumber(int newHigh, int newLow)
	{
		answer = random.nextInt(newHigh-newLow)+newLow;
		return answer;
	}
	public int SetLowNumber(int low)
	{
		newLow = low;
		return newLow;
	}
	public int SetHighNumber(int high)
	{
		high = newHigh;
		return newHigh;
	}
}
