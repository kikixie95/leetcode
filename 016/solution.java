class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int res = nums[0] + nums[1] + nums[nums.length-1];
        
        for(int i = 0; i < nums.length-2; i++){
            
            int left = i+1, right = nums.length-1;
            
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                
                if(sum > target){
                    right--;
                }
                else if(sum < target){
                    left++;
                }else{
                    return sum;
                }
                
                if(Math.abs(target-sum) < Math.abs(target-res)){
                    res = sum;
                }
               
            }
             
        }
        return res;
    }
}