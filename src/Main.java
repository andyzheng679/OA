import ArraysAndHashing.ContainsDuplicate;
import ArraysAndHashing.IsAnagram;
import ArraysAndHashing.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,3}));
//        System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4}));
//
//        System.out.println(IsAnagram.isAnagram("racecar", "carrace"));
//        System.out.println(IsAnagram.isAnagram("jar", "jam"));
//
//        System.out.println(numOfLetters("asdas asd as  Hello, world!"));
//        System.out.println(Arrays.toString(sort(new int[]{5,3,6,1,0})));

        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{3,4,5,6}, 7)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{4,5,6}, 10)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{5,5}, 10)));
    }


    public static int numOfLetters(String input){
        char[] container = input.toCharArray();
        int numLetters = 0;
        boolean flag = false;

        for(int i = 0; i < container.length; i++){
            if(Character.isLetter(container[i]) && flag == false){
                numLetters++;
                flag = true;
            }else if(!Character.isLetter(container[i]) && flag == true){
                flag = false;
            }
        }
        return numLetters;
    }


    public static int[] sort(int[] input){

        for(int i = 0; i < input.length; i++){
            for(int j = i+1; j < input.length; j++){
                if(input[j] < input[i]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
