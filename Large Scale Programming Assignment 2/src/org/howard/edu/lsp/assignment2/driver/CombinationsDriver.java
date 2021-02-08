package org.howard.edu.lsp.assignment2.driver;

import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment2.combination.Combinations;

public class CombinationsDriver{
	  public static void main(String args[]) {
		  Combinations comb = new Combinations();
		  Integer[] nums = {3,9,8,4,5,7,10};
		  int sum = 15;
		  comb.findCombinations(new ArrayList<Integer>(Arrays.asList(nums)), sum);
	  }
}
