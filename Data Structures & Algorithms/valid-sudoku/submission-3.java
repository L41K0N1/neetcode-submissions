class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                

                if (board[i][j] != '.') {
                    if (!set.add(board[i][j])) {
                        return false;
                    }
                }

            }
        }

        for (int j = 0; j < 9; j++) {
            set.clear();
            for (int i = 0; i < 9; i++) {
                

                if (board[i][j] != '.') {
                    if (!set.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }


        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {

                set.clear();

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {

                        if (board[x][y] != '.') {
                            if(!set.add(board[x][y])) {
                                return false;
                            }
                        }

                    }
                }
                
            }
        }

        return true;
    }
}
