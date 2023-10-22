public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] resIzq = prefixSumIzq(nums);
        int[] resDer = prefixSumDer(nums);

        for(int i = 0; i < nums.length; i++){
            if(resIzq[i] == resDer[i]){
                return i;
            }
        }
        return -1;
    }

    int[] prefixSumIzq(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            res[i] = res[i-1] + arr[i];
        }
        return res;
    }
    
    int[] prefixSumDer(int[] arr){
        int[] res = new int[arr.length];
        res[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0 ; i--){
            res[i] = res[i+1] + arr[i];
        }
        return res;
    }


    public static void main(String args[]){
        FindPivotIndex f = new FindPivotIndex();
        //int[] arr = {1,2,3};
        //int[] arr = {1,7,3,6,5,6};
        int[] arr = {2,1,-1};
        //int[] arr = {-1,-1,-1,-1,-1,-1};
        
         int[] res = f.prefixSumIzq(arr);
         System.out.println("Prefix sum izq");
         for(int i : res){
             System.out.print(i + " ");
         }
 
         System.out.println("\nPrefix sum der");
         int[] res2 = f.prefixSumDer(arr);
         for(int i : res2){
              System.out.print(i + " ");
          }
         
        System.out.println("\npivote " + f.pivotIndex(arr));
        
    }
}
