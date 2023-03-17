//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.anubhav.day1;
public class Question_8 {

	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int target = 13;
		int[] ans = searchRange(arr, target);
		System.out.println("["+ans[0]+","+ans[1]+"]");
	}
    public static int[] searchRange(int[] nums, int target) {
    	
    
    	int[] ans = {-1,-1};
    	ans[0] = search( nums ,  target,  true);
    	if(ans[0]!=-1) {
    		ans[1] = search(nums, target, false);
    	}
    	return ans;
    	
    }
    static int search(int[] nums , int target, boolean findFirstOccurence) {
    	int ans =-1;
    	int start = 0;
		int end = nums.length-1;
		while(start <= end) {
			//Get the middle element
			int mid = start + (end - start)/2;
//			System.out.println("Start: "+start+" End: "+end+" Mid: "+ mid+" Element in the middle: "+arr[mid]+" Target: "+target);
			if(target < nums[mid]) {
				end = mid -1 ;
			}
			else if(target > nums[mid]) {
				start = mid + 1;
			}
			else
			{
				//potiential ans found
				ans=mid;
				if(findFirstOccurence) {
					end = mid-1;
				}
				else {
					start = mid +1;
				}
				
				
			}
		}
		
		return ans;
    	
    }
}
