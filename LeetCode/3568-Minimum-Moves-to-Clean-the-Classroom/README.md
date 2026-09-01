# 3568. Minimum Moves to Clean the Classroom

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int minMoves(String[] classroom, int energy) {
3        int rows = classroom.length;
4        int cols = classroom[0].length();
5      
6        // Store the index of each light in the grid
7        int[][] lightIndex = new int[rows][cols];
8        int startRow = 0, startCol = 0;
9        int lightCount = 0;
10      
11        // Find start position and assign indices to lights
12        for (int i = 0; i < rows; i++) {
13            String row = classroom[i];
14            for (int j = 0; j < cols; j++) {
15                char cell = row.charAt(j);
16                if (cell == 'S') {
17                    startRow = i;
18                    startCol = j;
19                } else if (cell == 'L') {
20                    lightIndex[i][j] = lightCount;
21                    lightCount++;
22                }
23            }
24        }
25      
26        // If no lights to turn off, return 0
27        if (lightCount == 0) {
28            return 0;
29        }
30      
31        // 4D visited array: [row][col][energy][light_state_mask]
32        boolean[][][][] visited = new boolean[rows][cols][energy + 1][1 << lightCount];
33      
34        // BFS queue storing states: [row, col, current_energy, lights_mask]
35        List<int[]> queue = new ArrayList<>();
36        int initialMask = (1 << lightCount) - 1; // All lights initially on
37        queue.add(new int[] {startRow, startCol, energy, initialMask});
38        visited[startRow][startCol][energy][initialMask] = true;
39      
40        // Direction vectors for moving up, right, down, left
41        int[] directions = {-1, 0, 1, 0, -1};
42        int steps = 0;
43      
44        // BFS to find minimum steps
45        while (!queue.isEmpty()) {
46            List<int[]> currentLevel = queue;
47            queue = new ArrayList<>();
48          
49            for (int[] state : currentLevel) {
50                int currentRow = state[0];
51                int currentCol = state[1];
52                int currentEnergy = state[2];
53                int lightsMask = state[3];
54              
55                // All lights turned off, return steps
56                if (lightsMask == 0) {
57                    return steps;
58                }
59              
60                // No energy left, skip this state
61                if (currentEnergy <= 0) {
62                    continue;
63                }
64              
65                // Try all 4 directions
66                for (int k = 0; k < 4; k++) {
67                    int nextRow = currentRow + directions[k];
68                    int nextCol = currentCol + directions[k + 1];
69                  
70                    // Check if next position is valid and not a wall
71                    if (nextRow >= 0 && nextRow < rows && 
72                        nextCol >= 0 && nextCol < cols && 
73                        classroom[nextRow].charAt(nextCol) != 'X') {
74                      
75                        // Calculate next energy (recharge at 'R', otherwise decrease by 1)
76                        int nextEnergy = classroom[nextRow].charAt(nextCol) == 'R' 
77                                        ? energy 
78                                        : currentEnergy - 1;
79                      
80                        // Update lights mask if stepping on a light
81                        int nextMask = lightsMask;
82                        if (classroom[nextRow].charAt(nextCol) == 'L') {
83                            // Turn off the light at this position
84                            nextMask &= ~(1 << lightIndex[nextRow][nextCol]);
85                        }
86                      
87                        // Add to queue if this state hasn't been visited
88                        if (!visited[nextRow][nextCol][nextEnergy][nextMask]) {
89                            visited[nextRow][nextCol][nextEnergy][nextMask] = true;
90                            queue.add(new int[] {nextRow, nextCol, nextEnergy, nextMask});
91                        }
92                    }
93                }
94            }
95            steps++;
96        }
97      
98        // No solution found
99        return -1;
100    }
101}
102-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int minmoves(string[] classroom, int energy) {
3        int rows = classroom.length;
4        int cols = classroom[0].length();
5      
6        // store the index of each light in the grid
7        int[][] lightindex = new int[rows][cols];
8        int startrow = 0, startcol = 0;
9        int lightcount = 0;
10      
11        // find start position and assign indices to lights
12        for (int i = 0; i < rows; i++) {
13            string row = classroom[i];
14            for (int j = 0; j < cols; j++) {
15                char cell = row.charat(j);
16                if (cell == 's') {
17                    startrow = i;
18                    startcol = j;
19                } else if (cell == 'l') {
20                    lightindex[i][j] = lightcount;
21                    lightcount++;
22                }
23            }
24        }
25      
26        // if no lights to turn off, return 0
27        if (lightcount == 0) {
28            return 0;
29        }
30      
31        // 4d visited array: [row][col][energy][light_state_mask]
32        boolean[][][][] visited = new boolean[rows][cols][energy + 1][1 << lightcount];
33      
34        // bfs queue storing states: [row, col, current_energy, lights_mask]
35        list<int[]> queue = new arraylist<>();
36        int initialmask = (1 << lightcount) - 1; // all lights initially on
37        queue.add(new int[] {startrow, startcol, energy, initialmask});
38        visited[startrow][startcol][energy][initialmask] = true;
39      
40        // direction vectors for moving up, right, down, left
41        int[] directions = {-1, 0, 1, 0, -1};
42        int steps = 0;
43      
44        // bfs to find minimum steps
45        while (!queue.isempty()) {
46            list<int[]> currentlevel = queue;
47            queue = new arraylist<>();
48          
49            for (int[] state : currentlevel) {
50                int currentrow = state[0];
51                int currentcol = state[1];
52                int currentenergy = state[2];
53                int lightsmask = state[3];
54              
55                // all lights turned off, return steps
56                if (lightsmask == 0) {
57                    return steps;
58                }
59              
60                // no energy left, skip this state
61                if (currentenergy <= 0) {
62                    continue;
63                }
64              
65                // try all 4 directions
66                for (int k = 0; k < 4; k++) {
67                    int nextrow = currentrow + directions[k];
68                    int nextcol = currentcol + directions[k + 1];
69                  
70                    // check if next position is valid and not a wall
71                    if (nextrow >= 0 && nextrow < rows && 
72                        nextcol >= 0 && nextcol < cols && 
73                        classroom[nextrow].charat(nextcol) != 'x') {
74                      
75                        // calculate next energy (recharge at 'r', otherwise decrease by 1)
76                        int nextenergy = classroom[nextrow].charat(nextcol) == 'r' 
77                                        ? energy 
78                                        : currentenergy - 1;
79                      
80                        // update lights mask if stepping on a light
81                        int nextmask = lightsmask;
82                        if (classroom[nextrow].charat(nextcol) == 'l') {
83                            // turn off the light at this position
84                            nextmask &= ~(1 << lightindex[nextrow][nextcol]);
85                        }
86                      
87                        // add to queue if this state hasn't been visited
88                        if (!visited[nextrow][nextcol][nextenergy][nextmask]) {
89                            visited[nextrow][nextcol][nextenergy][nextmask] = true;
90                            queue.add(new int[] {nextrow, nextcol, nextenergy, nextmask});
91                        }
92                    }
93                }
94            }
95            steps++;
96        }
97      
98        // no solution found
99        return -1;
100    }
101}
102
                            nextCol, 
                            nextEnergy, 
                            nextMask});
                        }
                    }
                }
            }
            steps++;
        }
      
        // No solution found
        return -1;
    }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int minMoves(String[] classroom, int energy) {
3        int rows = classroom.length;
4        int cols = classroom[0].length();
5      
6        // Store the index of each light in the grid
7        int[][] lightIndex = new int[rows][cols];
8        int startRow = 0, startCol = 0;
9        int lightCount = 0;
10      
11        // Find start position and assign indices to lights
12        for (int i = 0; i < rows; i++) {
13            String row = classroom[i];
14            for (int j = 0; j < cols; j++) {
15                char cell = row.charAt(j);
16                if (cell == 'S') {
17                    startRow = i;
18                    startCol = j;
19                } else if (cell == 'L') {
20                    lightIndex[i][j] = lightCount;
21                    lightCount++;
22                }
23            }
24        }
25      
26        // If no lights to turn off, return 0
27        if (lightCount == 0) {
28            return 0;
29        }
30      
31        // 4D visited array: [row][col][energy][light_state_mask]
32        boolean[][][][] visited = new boolean[rows][cols][energy + 1][1 << lightCount];
33      
34        // BFS queue storing states: [row, col, current_energy, lights_mask]
35        List<int[]> queue = new ArrayList<>();
36        int initialMask = (1 << lightCount) - 1; // All lights initially on
37        queue.add(new int[] {startRow, startCol, energy, initialMask});
38        visited[startRow][startCol][energy][initialMask] = true;
39      
40        // Direction vectors for moving up, right, down, left
41        int[] directions = {-1, 0, 1, 0, -1};
42        int steps = 0;
43      
44        // BFS to find minimum steps
45        while (!queue.isEmpty()) {
46            List<int[]> currentLevel = queue;
47            queue = new ArrayList<>();
48          
49            for (int[] state : currentLevel) {
50                int currentRow = state[0];
51                int currentCol = state[1];
52                int currentEnergy = state[2];
53                int lightsMask = state[3];
54              
55                // All lights turned off, return steps
56                if (lightsMask == 0) {
57                    return steps;
58                }
59              
60                // No energy left, skip this state
61                if (currentEnergy <= 0) {
62                    continue;
63                }
64              
65                // Try all 4 directions
66                for (int k = 0; k < 4; k++) {
67                    int nextRow = currentRow + directions[k];
68                    int nextCol = currentCol + directions[k + 1];
69                  
70                    // Check if next position is valid and not a wall
71                    if (nextRow >= 0 && nextRow < rows && 
72                        nextCol >= 0 && nextCol < cols && 
73                        classroom[nextRow].charAt(nextCol) != 'X') {
74                      
75                        // Calculate next energy (recharge at 'R', otherwise decrease by 1)
76                        int nextEnergy = classroom[nextRow].charAt(nextCol) == 'R' 
77                                        ? energy 
78                                        : currentEnergy - 1;
79                      
80                        // Update lights mask if stepping on a light
81                        int nextMask = lightsMask;
82                        if (classroom[nextRow].charAt(nextCol) == 'L') {
83                            // Turn off the light at this position
84                            nextMask &= ~(1 << lightIndex[nextRow][nextCol]);
85                        }
86                      
87                        // Add to queue if this state hasn't been visited
88                        if (!visited[nextRow][nextCol][nextEnergy][nextMask]) {
89                            visited[nextRow][nextCol][nextEnergy][nextMask] = true;
90                            queue.add(new int[] {nextRow, nextCol, nextEnergy, nextMask});
91                        }
92                    }
93                }
94            }
95            steps++;
96        }
97      
98        // No solution found
99        return -1;
100    }
101}
102`

## 📅 Solved On

2026-09-01

---
*Auto-pushed by [CodePush Extension](https://github.com)*
