#include <iostream>
#include <vector>


using namespace std;

class Solution {
public :
    vector<int> runningSum(vector<int>& nums){
        for (int i = 1; i <nums.size();i++){
            nums[i] += nums[i-1];
        }return nums;
    }
};
int main(){
    Solution obj;
    vector<int> arr = {1,2,3,4,5};
    cout<< "Normal arr look like :- ";
    for (int i : arr){
        cout<< i <<" ";
    }
    cout<<endl;
    
    vector<int> ans = obj.runningSum(arr);

    cout << "Running Sum :- ";
    for (int no : ans){
        cout<< no <<" ";
    }
    return 0;
}