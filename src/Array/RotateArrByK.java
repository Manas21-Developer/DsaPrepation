package Array;

public class RotateArrByK {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // reverse whole array
        reverse(nums, 0, n - 1);

        // reverse first k elements
        reverse(nums, 0, k - 1);

        // reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int s, int e) {

        while (s < e) {

            swap(nums, s, e);

            s++;
            e--;
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr, 3);

        for (int i : arr) {

            System.out.print(i + " ");
        }
    }
}