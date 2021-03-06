class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
       int i  = m + n - 1;
       int j = m-1;
       int k = n-1;
    
   
        while(j >= 0 && k >= 0 && i >= 0){
         if(nums1[j] == nums2[k]) nums1[i] = nums1[j];
         else  nums1[i] = Math.max(nums1[j],nums2[k]);
            
         if(nums1[j] >= nums2[k]) j--;
            else k--;
            i--;
           
        }
        
        while(j >= 0){
           return;
        }
        
        while(k >= 0){
            nums1[i] = nums2[k];
            i--;
            k--;
            
        }
        
    }
}