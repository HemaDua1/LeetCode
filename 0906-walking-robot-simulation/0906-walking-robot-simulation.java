class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
 int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0; 
        int x = 0, y = 0; 
        int maxDistSq = 0;
        for (int command : commands) {
            if (command == -1) {
                dir = (dir + 1) % 4;
            } else if (command == -2) {
                dir = (dir + 3) % 4;
            } else {
                int steps = command;
                int[] direction = directions[dir];
                while (steps-- > 0) {
                    int newX = x + direction[0];
                    int newY = y + direction[1];
                    boolean isObstacle = false;
                    for (int[] obstacle : obstacles) {
                        if (obstacle[0] == newX && obstacle[1] == newY) {
                            isObstacle = true;
                            break;
                        }
                    }
                    
                    if (isObstacle) {
                        break;
                    }
                    
                    x = newX;
                    y = newY;
                    maxDistSq = Math.max(maxDistSq, x * x + y * y);
                }
            }
        }
            return maxDistSq;
    }
}