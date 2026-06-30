#include <iostream>
#include <vector>
#include <unordered_Set>
using namespace std;

class Solution{
public :
    bool helper(vector<int>& nums){
        unordered_set<int> set;
        
        for (int i : nums){
            if (set.find(i) != set.end()) return true;
            set.insert(i);
        }return false;
    }
};
int main (){
    Solution obj ;
    vector<int> arr = {1,2,3};
    bool ans = obj.helper(arr);
    
    cout<< "if any element is duplicate it will return 1(ture) else 0(false) :- " <<ans;
}