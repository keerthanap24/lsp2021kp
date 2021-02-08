package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationsDriver extends Combinations {
	  public void main(String args[]) {
		    Integer[] nums = {3,9,8,4,5,7,10};
		    int sum = 15;
		    findCombinations(new ArrayList<Integer>(Arrays.asList(nums)), sum);
	  }
}
