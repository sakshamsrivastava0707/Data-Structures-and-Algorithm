class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        // sort them first in increasing order of attack, now it is guaranteed 
        // that element in the start have probability to find the weak elements
        
        // but consider a case , where attacks value is same, that case we 
        // we can make sure, that smaller defence values are first or else 
        // or else our algo will give wrong result
        // test case ; [2, 2], [2, 1] => our algo will give count of weak element as 1
        // but think 2,2 can't beat 2,1 so answer should be 0
        // thats why sort the second column element in decreasing order
        
        // and remember questions wants count of weak elements not the number of pairs
        Arrays.sort(properties, (a,b) -> a[0] != b[0] ? b[0] -a[0]: a[1] -b[1]);
        
        int countOfWeakEle = 0;
        int currentMax = Integer.MIN_VALUE;
        
        for(int pos=0; pos<properties.length; pos++){
            
            if(currentMax > properties[pos][1] ){
                countOfWeakEle++;
            }
            
            currentMax = Math.max( currentMax, properties[pos][1]);
        }
        
        return countOfWeakEle;
        
        
        
    }
} 