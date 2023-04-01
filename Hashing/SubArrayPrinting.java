package com.JavaProgram.Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubArrayPrinting {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(instream);
		System.out.println("Enter the size of the array....");
		int n = Integer.parseInt(stdin.readLine());
		int arr[] = new int[n];
		System.out.println("Enter the values in the array....");
		for(int i = 0;i < n;i++)
		{
			arr[i] = Integer.parseInt(stdin.readLine());
		}
		System.out.println("Display the array....");
		for(int i = 0;i < n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Printing the subArray.....");
		int count = 0;
		for(int i = 0;i < n;i++)
		{
			int curr_sum = arr[i];
			if(curr_sum == 0)
			{
				count++;
			}
			for(int j = i+1;j < n;j++)
			{
				curr_sum+= arr[j];
				if(curr_sum == 0)
				{
					count++;
				}
			}
		}
		System.out.println("Count : "+count);

	}

}
