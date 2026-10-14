 public class Sudoku_Solver {
    int n = 3;
    int N = n * n;
    int[][] rows = new int[N][N + 1];
    int[][] columns = new int[N][N + 1];
    int[][] boxes = new int[N][N + 1];
    char[][] board;
    boolean sudokuSolved = false;
    public boolean couldPlace(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
        return rows[row][d] + columns[col][d] + boxes[idx][d] == 0;
    }
    public void placeNumber(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
        rows[row][d]++;
        columns[col][d]++;
        boxes[idx][d]++;
        board[row][col] = (char)(d + '0');
    }
    public void removeNumber(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
        rows[row][d]--;
        columns[col][d]--;
        boxes[idx][d]--;
        board[row][col] = '.';
    }
    public void placeNextNumbers(int row, int col) {
        if (row == N - 1 && col == N - 1) {
            sudokuSolved = true;
        } else {
            if (col == N - 1) backtrack(row + 1, 0);
            else backtrack(row, col + 1);
        }
    }
    public void backtrack(int row, int col) {
        if (board[row][col] == '.') {
            for (int d = 1; d <= 9; d++) {
                if (couldPlace(d, row, col)) {
                    placeNumber(d, row, col);
                    placeNextNumbers(row, col);
                    if (sudokuSolved) return;
                    
                    removeNumber(d, row, col);
                }
            }
        } else {
            placeNextNumbers(row, col);
        }
    }
    public void solveSudoku(char[][] board) {
        this.board = board;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] != '.') {
                    int d = Character.getNumericValue(board[i][j]);
                    placeNumber(d, i, j);
                }
            }
        }
        backtrack(0, 0);
    }
    public void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
            {'3','.','.','.','4','9','.','.','.'},
            {'.','.','.','6','.','.','5','.','1'},
            {'7','5','2','.','.','1','.','.','.'},
            {'.','.','1','.','.','.','7','.','.'},
            {'5','.','.','3','9','6','.','.','.'},
            {'.','.','8','1','5','.','.','9','6'},
            {'.','.','3','.','1','.','.','6','.'},
            {'.','.','4','.','.','.','1','.','.'},
            {'.','.','.','.','2','8','.','.','.'}
        };
        Sudoku_Solver solver = new Sudoku_Solver();
        solver.solveSudoku(board);
        
        System.out.println("Solved Board:");
        solver.printBoard();
    }
}