public static String solve(int N, int X, int[] A) {
        String ans="no";
        for(int val:A){
            if(X==val){
                ans="yes";
            }
        }
    return ans;
}
