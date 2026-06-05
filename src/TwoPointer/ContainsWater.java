package TwoPointer;

public class ContainsWater {
    public static int maxArea(int[] height) {
        int maxWater = 0 ;
        int n = height.length;
        int left = 0 ;
        int right = n-1;
        while (left < right){
            int h = Math.min(height[left],height[right]);
            int width = right -left;
            int waterContain = h * width;
            maxWater = Math.max(maxWater,waterContain);
            if (height[left] < height[right]) left++;
            else right --;
        }return maxWater;
    }

    static void main(String[] args) {
        int []  arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
