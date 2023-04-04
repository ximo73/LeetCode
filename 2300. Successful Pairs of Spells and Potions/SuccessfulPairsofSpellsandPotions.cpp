#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:

    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        vector<int> res;
        int cont=0;
        int n = spells.size();
        int m = potions.size();
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                if(spells[i]*potions[j] >= success)
                    cont++;
            }
            res.push_back(cont);
            cont=0;
        }
        return res;
    }
};

int main(){
    Solution obj;
    vector<int> spells = {5,1,3};
    vector<int> potions = {1,2,3,4,5};
    vector<int> resultado = obj.successfulPairs(spells, potions, 7);
    int n = spells.size();
    
    for(int i=0; i<n; ++i){
        cout<<resultado[i];
    }
    return 0;
}