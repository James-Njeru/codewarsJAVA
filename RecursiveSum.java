package com.codewars;

public class RecursiveSum {

	public static void main(String[] args) {
		digital_root(493193);
	}
	
	public static int digital_root(int n) {
	    String numString;
	    
	    while(n>9){
	      int sum = 0;
	      numString = Integer.toString(n);
	      
	      //for(char i : String.valueOf(n).toCharArray()){
	       // sum += Integer.parseInt(String.valueOf(i));
	      //}
	      for(int i=0; i<numString.length(); i++){
	        sum += Character.digit(numString.charAt(i), 10);
	      }
	      n = sum;
	    }
	    return n;
	  }
}

/*
 * Digital root is the recursive sum of all the digits in a number.
 * 
 * Given n, take the sum of the digits of n. If that value has more than one
 * digit, continue reducing in this way until a single-digit number is produced.
 * The input will be a non-negative integer.
 * 
 * Examples 16 --> 1 + 6 = 7 942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
 */