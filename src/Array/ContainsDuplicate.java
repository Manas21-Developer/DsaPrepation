package Array;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {

            // If element already exists
            if (set.contains(i)) {
                return true;
            }

            // Add element into set
            set.add(i);
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }
}