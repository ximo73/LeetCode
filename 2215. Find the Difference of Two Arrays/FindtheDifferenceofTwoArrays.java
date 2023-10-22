import java.util.*;

public class FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(0, recorrerArrays(nums1, nums2));
        res.add(1, recorrerArrays(nums2, nums1));
        return res;
    }

    List<Integer> recorrerArrays(int[] arr1, int[] arr2){
        List<Integer> lista = new ArrayList<>();
        HashMap<Integer, Integer> recorrido = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr1.length; i++){
            recorrido.put(arr1[i],2);   //2 = no recorrido
        }

        int h = 0;
        while(h < arr1.length){
            if(recorrido.get(arr1[h]) == 2){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[h] == arr2[j]){
                        recorrido.put(arr1[h],1);
                        break;
                    }
                }
                if(recorrido.get(arr1[h]) != 1){
                    recorrido.put(arr1[h],0);
                    lista.add(arr1[h]);
                }
                
            }
            h++;
        }
        return lista;
    }

    public static void main(String args[]){  
        FindtheDifferenceofTwoArrays obj = new FindtheDifferenceofTwoArrays();
        int[] nums1 = {1,2,3};
        int[] nums2 = {1};
        List<List<Integer>> lista = obj.findDifference(nums1, nums2);
        for(int i = 0; i < lista.size(); i++){
            for(int j = 0; j < lista.get(i).size(); j++){
                System.out.println( "i:" +i +" "+lista.get(i).get(j));
            }
            System.out.println("Siguiente");
        }
    } 
}
