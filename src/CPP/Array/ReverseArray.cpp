#include <iostream>
#include <vector>

using namespace std;

class Solution {
public :
    void swap (vector<int>& arr , int i , int j ){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void helper(vector<int>& nums){
        int i =0;
        int j = nums.size()-1;
        while (i< j){
           swap(nums,i,j);
           i++;
           j--; 
        }
    }
};
int main(){
    Solution obj ;
    vector<int> arr = {1,2,3,4,5};
    cout<< "before reverse the arr :-";
    for (int i : arr){
        cout << i << " ";
    }
    cout<<endl;
   
    obj.helper(arr);
    cout<< "After reverse the arr it look like :- ";
    for (int  i : arr){
        cout << i <<" ";
    }    
}