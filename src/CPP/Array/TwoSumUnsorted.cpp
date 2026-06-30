#include <iostream>
#include <vector>

using namespace std;

class Solution {
public :
    vector<int> helper (vector<int>& arr, int target){
        for(int i =0;  i<arr.size();i++){
            int sum =0;
            for (int j = i; j<arr.size();j++){
                sum += arr[j];
                if (sum == target) return {i,j};
            }
        }return {-1,-1};
    }
};
int main (){
    Solution obj;
    vector<int> nums = {2,7,11,15};

    vector <int> ans = obj.helper(nums,9);

    cout << "If two idx summ = to target it will return the idx else return {-1,-1}:- " <<ans[0] << ","<<ans[1];
}