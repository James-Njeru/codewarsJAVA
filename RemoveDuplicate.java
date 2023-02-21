package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = {3,5,3,7,1,1};
		deleteNth(arr, 4);
	}
	
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
	    /*LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	    String s = "";
	    int[] arr = null;
	    
	    //add elements to LinkedHashSet
	    for(int i=0; i<elements.length; i++) {
	    	set.add(elements[i]);
	    }
	    //add elements of LinkedHashSet to a string
	    for (Integer itr : set) {
            s += itr;
        }
	    s = s.repeat(maxOccurrences);
	    
	    //convert string to int array
	    for(int i=0; i<s.length(); i++) {
	    	arr = new int[s.length()];
	    	arr[i] = Character.digit(s.charAt(i), 10);
	    	System.out.print(arr[i]);
	    }*/
		
		int[] zeroArr = {};
	    if(elements.length == 0 || maxOccurrences < 1) {
	      return zeroArr;
	    }
	    // System.out.println(Arrays.toString(elements));
	    List<Integer> nums = new ArrayList<>();
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i = 0; i < elements.length; i++) {
	      if(map.containsKey(elements[i])) {
	        // check count
	        int count = map.get(elements[i]);
	        map.put(elements[i], count + 1);
	        
	        if(count < maxOccurrences) {
	         nums.add(elements[i]);
	        }
	      }
	      
	      else {
	       map.put(elements[i], 1);
	       nums.add(elements[i]);
	      }
	    
	    }
	    
	   //System.out.println(nums);
	    Integer[] res = nums.toArray(new Integer[nums.size()]);
	    return Arrays.stream(res).mapToInt(Integer::intValue).toArray();
		}
}

/*
 * Given a list and a number, create a new list that contains each number of
 * list at most N times, without reordering. For example if the input number is
 * 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the
 * next [1,2] since this would lead to 1 and 2 being in the result 3 times, and
 * then take 3, which leads to [1,2,3,1,2,3]. With list [20,37,20,21] and number
 * 1, the result would be [20,37,21].
 */