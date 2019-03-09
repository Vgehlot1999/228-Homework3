package edu.iastate.cs228.hw03;

import java.util.Arrays;

/**
 * 
 * @author Vismay
 *
 */
public class HW03_Part2
{
 /*
  * Answers to short questions:
  * 
  * 1. O(n)
  * 
  * 2. O(log(n))
  * 
  * 3. O(n^3)
  * 
  * 4. O(n^2)
  * 
  * 5. O(n^2)
  * 
  */
	
	/*
	 In all of the following methods you can assume that
	 array will always have elements (ints) in it.
	 And will have proper integers as defined in the 
	 description of HW03, i.e., in first two it will be
	 in the range, and in last two it will be composed of
	 negative and positive values only.
	*/
	
	public static int findMissingInt_a_On2(int [] array)
	{
		for (int i = 1; i < array.length + 1; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				if (i == array[j])
				{
					break;
				}
				
				if (j < array.length - 1)
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public static int findMissingInt_b_On1(int [] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length + 1; i++)
		{
			sum += array[i];
		}
		
		if (array.length*(array.length + 1)/2 != sum)
		{
			return array.length*(array.length + 1)/2 - sum;
		}
		return -1;
	}
	
	public static void rearrange_a_On2(int [] array)
	{
		int temp = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i; j < array.length; j++)
			{
				if (array[j] < array[i])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return;
	}
	
	public static void rearrange_b_On1(int [] array)
	{
		int temp = 0;
		int j = array.length - 1;
		for (int i = 0; i < j; i++, j--)
		{
			if (array[i] < 0 && array[j] < 0)
			{
				j++;
			}
			
			else if (array[i] > 0 && array[j] > 0)
			{
				i--;
			}
			
			else if (array[i] > 0 && array[j] < 0)
			{
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		return;
	}
	
}
