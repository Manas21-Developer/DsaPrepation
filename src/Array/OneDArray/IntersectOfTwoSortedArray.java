package Array.OneDArray;

import java.util.Arrays;

public class IntersectOfTwoSortedArray {

    public int[] helper(int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;

        // Store result inside array a
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                i++;
            }

            else if (a[i] > b[j]) {
                j++;
            }

            else {

                a[k] = a[i];

                k++;
                i++;
                j++;
            }
        }

        // Final answer array
        int[] result = new int[k];

        for (int x = 0; x < k; x++) {
            result[x] = a[x];
        }

        return result;
    }

    // Driver Code
    public static void main(String[] args) {

        IntersectOfTwoSortedArray obj =
                new IntersectOfTwoSortedArray();

        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6};

        int[] ans = obj.helper(a, b);

        System.out.println(
                "Intersection Array: "
                        + Arrays.toString(ans)
        );
    }
}