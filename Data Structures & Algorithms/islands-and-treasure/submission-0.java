class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i < r ; i++){
            for(int j = 0 ;j < c ; j++){
                if(grid[i][j] == 0){
                    q.offer(new Pair(i,j));
                }
            }
        }

        int[] drow = {-1,0,1,0};
        int[]dcol = {0,1,0,-1};

        while(!q.isEmpty()){
            int ro = q.peek().row;
            int co = q.peek().col;
            q.poll();

            for(int i =0 ;i < 4 ; i++){
                int nrow = ro + drow[i];
                int ncol = co + dcol[i];

                if(nrow >= 0 && ncol >= 0 && nrow <r && ncol < c && grid[nrow][ncol] == Integer.MAX_VALUE){
                    grid[nrow][ncol] = grid[ro][co] + 1;
                    q.add(new Pair(nrow , ncol)); 
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
