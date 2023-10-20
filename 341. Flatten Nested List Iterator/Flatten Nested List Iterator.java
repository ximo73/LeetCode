import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {
    private List<Integer> listaAplanada;
    private Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedList) {
        listaAplanada = new LinkedList<Integer>();
        aplanarLista(nestedList);
        it = listaAplanada.iterator();
    }

    public void aplanarLista(List<NestedInteger> lista){
        for(NestedInteger current : lista){
            if(current.isInteger()){
                listaAplanada.add(current.getInteger());
            }else{
                aplanarLista(current.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }
}
