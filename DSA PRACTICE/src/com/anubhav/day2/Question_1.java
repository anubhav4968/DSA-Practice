//search in a infinite array
package com.anubhav.day2;
public class Question_1 {

	public static void main(String[] args) {
		int[] arr = {-10,0,2,6,12,48,59,66};
		int target = 12;
		System.out.println(ans(arr, target));
	}
	
	static int ans(int[] arr, int target) {
		int start = 0;
		int end =1;
		System.out.println("here");
		while(target > arr[end]) {
//			System.out.println("end: "+end+" start: "+start);
			int newStart = end +1;
			end = end + (end - start+1)*2;
			start = newStart;
		}
		return binarySearch(arr, target, start, end);
	}
	
	static int binarySearch(int[] arr, int target , int start , int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
//			System.out.println("Start: "+start+" End: "+end+" Mid: "+ mid+" Element in the middle: "+arr[mid]+" Target: "+target);
			if(target < arr[mid]) {
				end = mid -1;
			}
			else if(target > arr[mid]) {
				start = mid+1;
			}else
			{
				return mid;
			}
		}
		return -1;
	}
}
