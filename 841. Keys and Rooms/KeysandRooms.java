public class KeysandRooms{

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        //Crear grafo
        Graph g = new Graph(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < rooms.get(i).size(); j++){
                g.addEdge(i, rooms.get(i).get(j));
            }
        }
        //DFS
        g.DFS(0, visited);
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
}