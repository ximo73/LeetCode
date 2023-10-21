class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i]< nums2[j]){
                res[k] = nums1[i];
                i++;
                k++;
            }else if(nums1[i]> nums2[j]){
                res[k] = nums2[j];
                j++;
                k++;
            }else{
                res[k] = nums1[i];
                i++;
                k++;
                res[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < m){
            res[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            res[k] = nums2[j];
            j++;
            k++;
        }
        
        for(int l = 0; l < m+n; l++){
            nums1[l] = res[l];
        }
        
    }
    public static void main(String args[]){  
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6}; 
        int m = 3;
        int n = 3;
        MergeSortedArray s = new MergeSortedArray();
        s.merge(nums1, m, nums2, n);
        
        for(int i = 0; i < m+n; i++){
            System.out.println(nums1[i]);
        }
    }  
    
}
