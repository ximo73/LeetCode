import java.util.LinkedList;

class NumberofRecentCalls {
    LinkedList<Integer> llamadas;

    public RecentCounter() {
        llamadas = new LinkedList<Integer>();  
    }
    
    public int ping(int t) {
        llamadas.add(t);
        
        while(llamadas.peek() < t - 3000){
            llamadas.poll();
        }

        return llamadas.size();
    }
}
