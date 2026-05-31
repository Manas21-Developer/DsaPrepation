package Array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int cnt  = 1;
        int ele =  nums[0];
        int n = nums.length;
        for (int i = 1;i<n;i++){
            if (ele == nums[i]) cnt++;
            else {
                cnt--;
                if (cnt == 0){
                    ele = nums[i];
                    cnt =1;
                }
            }
        }return ele;
    }

    static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
