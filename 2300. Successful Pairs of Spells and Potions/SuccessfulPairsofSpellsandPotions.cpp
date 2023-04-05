#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>

using namespace std;
class Solution {
public:
    int binarySearch(vector<int>&arr, long long target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left != right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right + 1;
    };
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        vector<int> res;
        int n = spells.size();
        int m = potions.size();
        sort(potions.begin(), potions.end());

        for(int i=0; i<n; ++i){
            long long target = trunc(success/spells[i]);
            if (target*spells[i] < success)
                target++;
            
            int resBS = binarySearch(potions, target);

            if(potions[m-1] < target){
                res.push_back(0);
            } else if (potions[0] > target){
                res.push_back(m);
            } else {
                res.push_back(m - resBS + 1);
            }
        }
        return res;
    }
};

int main(){
    Solution obj;
    vector<int> spells = {5,1,3};
    vector<int> potions = {1,2,3,4,5};
    vector<int> potions2 = {8,5,8};
    
    vector<int> resultado = obj.successfulPairs(spells, potions, 7);
    int n = spells.size();
    
    for(int i=0; i<n; ++i){
        cout<<resultado[i];
    }

    return 0;
}