class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(grid[i][j] == '1' && vis[i][j] != 1){
                    cnt++;
                    bfs( i , j , vis , grid,n,m);
                }
            }
        }
        return cnt;
    }
    public void bfs(int row , int col , int[][]vis , char[][]grid , int n , int m){
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList();
        q.offer(new Pair(row , col));

        int[]drow = {-1,0,1,0};
        int[]dcol = {0,1,0,-1};

        while(!q.isEmpty()){
            int ro = q.peek().row;
            int co = q.peek().col;
            q.poll();

            for(int i = 0 ; i < 4 ; i++){
                int nrow = ro + drow[i];
                int ncol = co + dcol[i];

                if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && vis[nrow][ncol] != 1 && grid[nrow][ncol] == '1' ){
                    vis[nrow][ncol] = 1;
                    q.offer(new Pair(nrow , ncol));
                }
            }
            
        }
        
    }
}
class Pair{
    int row ;
    int col;
    Pair(int row , int col){
        this.row = row;
        this.col = col;
    }
}