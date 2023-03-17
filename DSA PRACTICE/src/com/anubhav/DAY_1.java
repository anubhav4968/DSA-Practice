package com.anubhav;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class DAY_1 {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));	
	}
	public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
//        	System.out.println("Nums : "+nums[i]);
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
   static boolean even(int number){
    
      int numberOfElement = countNumber(number);
//      System.out.println(number+" Number OF ELement:"+numberOfElement);
      return numberOfElement %2==0;
   }
   static int countNumber(int num){
	   int count=0;
       if(num<0){
           num = num * -1;
       }
       if(num==0){
           return 1;
       }
       
       while(num>0){
//    	   System.out.println(count);
           count++;
           num = num / 10;
       }
       return count;
   }
}
