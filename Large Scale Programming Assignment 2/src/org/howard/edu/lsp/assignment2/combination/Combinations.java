package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;

class Combinations {
  public void findCombinationsRecursive(ArrayList<Integer> nums, ArrayList<Integer> newNum, int sum){
    int s = 0;
    for (int x: newNum){
      s += x;
    }
    if (s == sum){
      System.out.println("sum(" + Arrays.toString(newNum.toArray()) + ")=" + sum);
    }
    if (s >= sum){
      return;
    }
    for(int i = 0; i < nums.size(); i++) {
      ArrayList<Integer> remainder = new ArrayList<Integer>();
      int n = nums.get(i);
      for (int j = i+1; j < nums.size(); j++){
        remainder.add(nums.get(j));
      }
      ArrayList<Integer> newNum2 = new ArrayList<Integer>(newNum);
      newNum2.add(n);
      findCombinationsRecursive(remainder, newNum2,  sum);
    }
  }

  public void findCombinations(ArrayList<Integer> nums, int sum) {
    findCombinationsRecursive(nums, new ArrayList<Integer>(), sum);
  }
}