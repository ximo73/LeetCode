#include <iostream>
#include <vector>
using namespace std;

class Solution {

public:
    Solution(){};
    void pintado(vector<vector<int>>& image, int x, int y, int color, int inicio, int cantFilas, int cantCol){
        if((image[x][y] == inicio)&&(inicio != color)){
            image[x][y] = color;
            
            if(y+1 < cantCol)
                pintado(image, x, y+1, color, inicio, cantFilas, cantCol);
            if(x+1 < cantFilas)
                pintado(image, x+1, y, color, inicio, cantFilas, cantCol);
            if(y -1 >= 0)
                pintado(image, x, y-1, color, inicio, cantFilas, cantCol);
            if(x -1 >= 0)
                pintado(image, x-1, y, color, inicio, cantFilas, cantCol);
        }
    };
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int inicio = image[sr][sc];
        int m = image.size();           //gives the total number of rows
        int n = image[0].size();        //gives you the total number of colums in 0th row

        pintado(image, sr, sc, color, inicio, m, n);

        return image;
    };
};

int main(){
    vector<vector<int>> input {{0,0,0},{0,0,0}};
    Solution obj;
    vector<vector<int>> resultado = obj.floodFill(input, 0, 0,0);
    
    for(int i = 0; i < 2; ++i){
        for(int j = 0; j < 3; ++j){
            cout<< resultado[i][j];
        }
        cout<<endl;
    }
    



    return 0;
}