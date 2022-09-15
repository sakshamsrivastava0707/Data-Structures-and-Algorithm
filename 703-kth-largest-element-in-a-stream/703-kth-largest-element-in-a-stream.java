class KthLargest {
    private final PriorityQueue<Integer> minHeap; 
    private final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap= new PriorityQueue<>(); // by default min Heap
        for(Integer eachEle: nums){
          add(eachEle);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > k  ){
            minHeap.remove();
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */