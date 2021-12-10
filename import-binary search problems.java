// { Driver Code Starts
//Initial Template for Java


// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1#
// rows with maximum no.of one's (matrix is sorted)
class Solution {
    int getPivotIndex(int arr[], int low, int high){
        
        int ans =-1; 
    //  low =0; high= arr.length;
        
        while(low<= high){
            int mid = low + (high- low)/2;
            
            
            if(arr[mid]== 1){
                ans = mid;
                high = mid-1;
            }else if(arr[mid]< 1){
                
                low = mid +1;
            }
            // else {
            //     right = mid-1;
            // }
        }
        return ans;
    }
    int rowWithMax1s(int nums[][], int n, int col) {
        // c
        int previousCountOfOnes =0,previousPivotIndex = col-1;              
        int ans = -1;
        for(int row =0; row< nums.length; row++){
            
            // for each row find the maximum count of ones
            
              int firstOccurenceOfOne = getPivotIndex(nums[row],0, previousPivotIndex);
             int  currentCountOfOnes = (firstOccurenceOfOne == -1 )? 0 : col - firstOccurenceOfOne;
             // firstoccureneOfone exist krta hai and aur previousCountOfone sa bda
            //  hai toh firsOccurenceOfone waala index sa aaga walla hi checkkaro 
            // kuki km 1's waali row ans ka part mai waisa hi contribute nhi krenga
             if( firstOccurenceOfOne != -1 && currentCountOfOnes > previousCountOfOnes){
                //  if(currentCountOfOnes == col -1) {
                //      return row;
                //  }
                 ans = row;
                 previousCountOfOnes = col - firstOccurenceOfOne;
                 previousPivotIndex = firstOccurenceOfOne -1;
             }
           
            
        }
        return ans;
    }
}
