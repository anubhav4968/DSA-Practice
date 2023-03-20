package com.anubhav.day3;
//find the count of rotation
public class Question_3 {

	public static void main(String[] args) {
		int[] arr = {4,5,7,0,1,2};
		System.out.println(findPivot(arr)+1);
	}
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if( start > mid && arr[mid] < arr[mid-1]) {
				return mid;
			}
			if(arr[start] > arr[mid] ) {
				start =mid + 1;
			}
		
			if(arr[start] < arr[mid]) {
				end = mid -1;
			}
		}
		return -1;
	}
}
