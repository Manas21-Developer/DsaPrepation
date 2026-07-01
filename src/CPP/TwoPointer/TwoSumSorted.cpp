#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int s = 0;
        int e = numbers.size() - 1;

        while (s < e) {
            int sum = numbers[s] + numbers[e];

            if (sum == target)
                return {s + 1, e + 1};
            else if (sum < target)
                s++;
            else
                e--;
        }

        return {-1, -1};
    }
};

int main() {
    vector<int> numbers = {2, 7, 11, 15};
    int target = 9;

    Solution obj;
    vector<int> ans = obj.twoSum(numbers, target);

    cout << "Indices: " << ans[0] << " " << ans[1] << endl;

    return 0;
}