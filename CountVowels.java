package com.codewars;

public class CountVowels {

	public static void main(String[] args) {
		getCount("o a kak ushakov lil vo kashu kakao");
	}

	public static int getCount(String str) {
	    int count=0;
	    for(int i=0; i<str.length(); i++){
	      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 
	         str.charAt(i)=='o' || str.charAt(i)=='u'){
	        count++;
	      }
	    }
	    System.out.print(count);
	    return count;
	  }
}

/*
 * Return the number (count) of vowels in the given string.
 * 
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 */