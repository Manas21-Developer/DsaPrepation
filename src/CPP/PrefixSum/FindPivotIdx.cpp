#include <iostream>
#include <vector>

using namespace std;

class Helper{
public:
    int pivotIndex(vector<int>& nums) {
        int totalSum = 0;
        for (int i : nums){
            totalSum += i;
        }
        int leftSum = 0 ;
        for (int i = 0 ; i<nums.size();i++){
            int rightSum = totalSum  - leftSum - nums[i];

            if (leftSum == rightSum) return i;

            leftSum += nums[i];
        }return -1;
    }
};

int main(){
    Helper obj;

    vector<int> arr = {1,7,3,6,5,6};

    int ans = obj.pivotIndex(arr);

    cout<< "if the arr at any point having equilibrium point (it return the idx else return -1 )  :- " << ans;
}