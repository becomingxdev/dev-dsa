# Knight's Tour

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer  **n**, representing the size of an n × n chessboard. A Knight moves two cells in one direction and one cell perpendicular to that direction.

- Knight starts at the top-left corner (0, 0) of the board.
- Your task is to find a valid tour, in which the Knight visits every cell of the board exactly once. Return an n × n matrix in which each cell contains the order in which it is visited. 
- If a valid tour does not exist, return an empty list.  
- There can be multiple valid tours, you may return any one.

 **Examples:** 

```
Input: n = 5
Output: 
[[0, 11, 2, 17, 20],
[3, 16, 19, 12, 7],
[10, 1, 6, 21, 18],
[15, 4, 23, 8, 13],
[24, 9, 14, 5, 22]]
Explanation: A possible knight's tour in a 5 x 5 chessboard is given above where each number represents the step at which the Knight visits that cell, starting from (0, 0) as step 0.

```

```
Input: n = 4
Output: []
Explanation: For n = 4, no sequence of knight moves can visit all 16 cells exactly once, starting from the top-left cell. Hence, the answer is an empty array [].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T04:17:07.250Z  

```java
class Solution {
    
    private static final int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};
    
    private static class Cell {
        int x, y, onwardMoves;
        Cell(int x, int y, int onwardMoves) {
            this.x = x;
            this.y = y;
            this.onwardMoves = onwardMoves;
        }
    }
    
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        // code here
        
        if(n <= 0 || n == 2 || n == 3 || n == 4) {
            return new ArrayList<>();
        }
        
        if(n == 1) {
            ArrayList<ArrayList<Integer>> single = new ArrayList<>();
            ArrayList<Integer> row = new ArrayList<>();
            row.add(0);
            single.add(row);
            return single;
        }
        
        ArrayList<ArrayList<Integer>> board = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                row.add(-1);
            }
            board.add(row);
        }
        
        board.get(0).set(0,0);
        
        if(solve(0, 0, 1, n, board)) {
            return board;
        }
        
        return new ArrayList<>();
        
    }
    
    private boolean solve(int curX, int curY, int moveCount, int n, ArrayList<ArrayList<Integer>> board) {
        if (moveCount == n * n) {
            return true;
        }

        ArrayList<Cell> candidates = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int nextX = curX + moveX[i];
            int nextY = curY + moveY[i];

            if (isValid(nextX, nextY, n, board)) {
                int count = getOnwardMovesCount(nextX, nextY, n, board);
                candidates.add(new Cell(nextX, nextY, count));
            }
        }

        Collections.sort(candidates, new Comparator<Cell>() {
            @Override
            public int compare(Cell c1, Cell c2) {
                return Integer.compare(c1.onwardMoves, c2.onwardMoves);
            }
        });

        for (Cell nextCell : candidates) {
            int nextX = nextCell.x;
            int nextY = nextCell.y;

            board.get(nextX).set(nextY, moveCount);

            if (solve(nextX, nextY, moveCount + 1, n, board)) {
                return true;
            }

            board.get(nextX).set(nextY, -1);
        }

        return false;
    }

    private boolean isValid(int x, int y, int n, ArrayList<ArrayList<Integer>> board) {
        return (x >= 0 && x < n && y >= 0 && y < n && board.get(x).get(y) == -1);
    }

    private int getOnwardMovesCount(int x, int y, int n, ArrayList<ArrayList<Integer>> board) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nextX = x + moveX[i];
            int nextY = y + moveY[i];
            if (isValid(nextX, nextY, n, board)) {
                count++;
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-knights-tour-problem/1)