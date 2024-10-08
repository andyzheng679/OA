import ArraysAndHashing.ContainsDuplicate;
import ArraysAndHashing.IsAnagram;

public class Main {
    public static void main(String[] args) {

        System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,3}));
        System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4}));

        System.out.println(IsAnagram.isAnagram("racecar", "carrace"));
        System.out.println(IsAnagram.isAnagram("jar", "jam"));

    }
}