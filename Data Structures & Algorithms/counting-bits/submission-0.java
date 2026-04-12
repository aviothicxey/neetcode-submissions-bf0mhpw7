class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for(int i = 0 ; i <= n ; i++){
            int cnt = 0 ;
            int num = i;
            while(num > 0){
                cnt += num & 1;
                num = num >> 1;
            }
            arr[i] = cnt;
        }
        return arr;
    }
}
