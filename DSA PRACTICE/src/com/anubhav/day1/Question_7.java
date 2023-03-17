//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
package com.anubhav.day1;

public class Question_7 {

	public static void main(String[] args) {
		char[]	letters = {'c','f','j'};
		char target = 'c';
		System.out.println(nextGreatestLetter(letters, target));
	
	}
	
    public static char nextGreatestLetter(char[] letters, char target) {
    	int start = 0;
		int end = letters.length-1;
		while(start <= end) {
			//Get the middle element
			int mid = start + (end - start)/2;
//			System.out.println("Start: "+start+" End: "+end+" Mid: "+ mid+" Element in the middle: "+arr[mid]+" Target: "+target);
			if(target < letters[mid]) {
				end = mid -1 ;
			}
			else  {
				start = mid + 1;
			}
			
		}
		//ans does not found
		return letters[start%letters.length];
    }
}
