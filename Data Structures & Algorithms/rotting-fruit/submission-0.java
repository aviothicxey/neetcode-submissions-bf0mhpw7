class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        int fresh = 0;

        for(int i =0; i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair(i,j,0));
                }else if (grid[i][j]== 1){
                    fresh++;
                }
            }
        }
        
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        int cnt =0;
        int mins = 0;

        while(!q.isEmpty()){
            int ro = q.peek().row;
            int co = q.peek().col;
            int time = q.peek().time;

            q.poll();

            mins = Math.max(time , mins);

            for(int i = 0; i <4 ; i++){
                int nrow = ro + drow[i];
                int ncol = co + dcol[i];

                if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && grid[nrow][ncol] == 1){
                    grid[nrow][ncol] = 2;
                    cnt++;
                    q.offer(new Pair(nrow , ncol , time + 1));
                }
            }
        }
        if(fresh == cnt){
            return mins;
        }
        else return -1;
    }
}
class Pair{
    int row ;
    int col ;
    int time;
    Pair(int row , int col , int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}