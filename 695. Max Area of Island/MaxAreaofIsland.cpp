#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    void recorrerIsla(vector<vector<int>>& grid, int x, int y, int cantFilas, int cantCol, int &tamano){
        if(grid[x][y] == 1){
            grid[x][y] = 2;     //cambio el 1 por un 2 para indicar que la casilla fue visitada
            tamano++;

            if((y+1 < cantCol) && (grid[x][y+1] != 2))
                recorrerIsla(grid, x, y+1, cantFilas, cantCol, tamano);
            if((x+1 < cantFilas) && (grid[x+1][y] != 2))
                recorrerIsla(grid, x+1, y, cantFilas, cantCol, tamano);
            if((y -1 >= 0) && (grid[x][y-1] != 2))
                recorrerIsla(grid, x, y-1, cantFilas, cantCol, tamano);
            if((x -1 >= 0) && (grid[x-1][y] != 2))
                recorrerIsla(grid, x-1, y, cantFilas, cantCol, tamano);
        }
    };
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int max = 0;
        int nuevoMax = 0;
        int m = grid.size();
        int n = grid[0].size();
        
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(grid[i][j] == 1){
                    recorrerIsla(grid, i, j, m, n, nuevoMax);
                    if (nuevoMax > max)
                        max = nuevoMax;
                    nuevoMax = 0;
                }
            }
        }
        return max;
    };
};

int main(){
    vector<vector<int>> input {{1,1,0},{0,1,1}};
    Solution obj;
    int resultado = obj.maxAreaOfIsland(input);
    cout<<resultado;


    return 0;
}