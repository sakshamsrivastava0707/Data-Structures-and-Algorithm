class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int left = 0, right = tokens.length -1;
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);
        while(left <=right){
            
            if(power >=tokens[left] ){
                score++;
                // reduce the current power
                power-= tokens[left];
                left++;
                maxScore = Math.max(maxScore, score);
                System.out.println(left);
            }else if(score > 0){
                score--;
                power+= tokens[right];
                right--;
                
            }else {
                break;
            }
        }
        return maxScore;
    }
}