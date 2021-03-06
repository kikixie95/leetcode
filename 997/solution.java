class Solution {
    public int findJudge(int N, int[][] trust) {
         if(trust.length<  N-1){
            return -1;
        }
        
        int [] inEdges = new int[N+1];
        int [] outEdges =new int[N+1];
        for(int[] relation :trust){
            outEdges[relation[0]]++;
            inEdges[relation[1]]++;
        }
        for (int i = 1; i <= N; i++) {
        if (inEdges[i] == N - 1 && outEdges[i] == 0) {
            return i;
        }
    }
        return -1;
       
    }
}