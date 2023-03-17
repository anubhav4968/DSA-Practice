package com.anubhav.day1;
//floor of a number in an array
public class Question_6 {

	public static void main(String[] args) {
		int[] arr = {-10,0,2,6,12,48,59,66};
		int target = -100;
		int ans = floorOfNumber(arr, target);
		if(ans!=-1) {
			System.out.println(arr[ans]);
		}
		else
		{
			System.out.println("Array Does not have element greater than or equal to Target element!!!");
		}
	}
	static int floorOfNumber(int[] arr , int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target  < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid +1;
			}
			else
			{
				return mid -1;
			}
			
		}
		return end;
	}
}
