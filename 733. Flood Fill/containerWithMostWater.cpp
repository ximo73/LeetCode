#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int min(int a, int b){
        if(a<=b)
        return a;
        else return b;
    };

    int maxArea(vector<int>& height) {
        int inicio = 0;
        int final = height.size()-1;
        int max=0;

        while(inicio != final){
            int res = min(height[inicio],height[final])*(final-inicio);
            if(res > max)
                max = res;
            else if(height[inicio]<height[final])
                inicio++;
            else final--;
        }
        return max;
    }
};