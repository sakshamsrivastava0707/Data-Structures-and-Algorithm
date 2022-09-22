class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int currentSum = 0;
        int previousSum =0;
        int [] ans = new int [nums.length];
        
        // int [
        for(int i= 0; i<queries.length; i++)
        {
            int value = queries[i][0];
            int index = queries[i][1];
            int oldNums = nums[index];
            
            nums[index] += value;
            if(i==0){
                // currentSum = 

                
                for(int pos =0; pos<nums.length; pos++){
                    currentSum+=  nums[pos] %2 ==0 ? nums[pos]: 0;
                }
                ans[i] = currentSum;
            }else {
                // updated value for next iteration use previous sum
                if(nums[index] %2 == 0) {
                    if(oldNums %2 != 0 ) currentSum+= nums[index];
                    else currentSum+= value;
                }else 
                    { 
                    // System.out.println(oldNums);
                    if(oldNums %2 == 0)
                    currentSum-= oldNums;
                    }
                         
                ans[i] = currentSum;
            }
        }
        return ans;
    }
}