//https://leetcode.com/problems/peak-index-in-a-mountain-array/
package com.anubhav.day2;
public class Question_2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,3,2,1,};
		System.out.println(peakIndexInMountainArray(arr));
	}
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
        	int mid = start +(end -start)/2;
        	if(arr[mid] > arr[mid+1]) {
        		//DESC PART
        			end = mid;
        	}else
        	{
        		//we are in asc part
        		start = mid+1;
        	}
        	
        }
        //it return the greater element becaus of the above 2 conditions;
        return end ; //or return start because both are equal
    }
}
