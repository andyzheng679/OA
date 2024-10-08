package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
//    Duplicate Integer
//    Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//
//    Example 1:
//    Input: nums = [1, 2, 3, 3]
//    Output: true
//
//    Example 2:
//    Input: nums = [1, 2, 3, 4]
//    Output: false

    public static boolean containsDuplicate(int[] input){
        Set<Integer> container = new HashSet<>();

        for(int i = 0; i < input.length; i++){
            if(container.contains(input[i])){
                return true;
            }
            container.add(input[i]);
        }
        return false;
    }
}
