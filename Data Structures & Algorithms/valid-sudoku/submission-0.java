class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<String> chk = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;

                char c = board[i][j];

                String row = "row " + c + " " + i;
                String col = "col " + c + " " + j;
                String box = "box " + c + " " + (i / 3) + " " + (j / 3);

                if (!chk.add(row) || !chk.add(col) || !chk.add(box)) {
                    return false;
                }
            }
        }
        return true;
    }
}
