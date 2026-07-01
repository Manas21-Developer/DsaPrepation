#include <iostream>
#include <vector>

using namespace std ;
class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int s = 0 ;
        int e = nums.size()-1;
        while (s<=e){
            int mid = s +(e-s)/2;
            if (s==e) return s;
            else if (nums[mid] <nums[mid+1]) s= mid+1;
            else e= mid ;
        }return -1;
    }
};