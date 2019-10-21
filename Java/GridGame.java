//GridGame

private static List<List<Integer>> gridGame(List<List<Integer>> grid, int k, List<String> rules){
    int row = grid.size();
    int col = grid.get(0).size();
    if(row == 0 || col == 0)
        return null;
    for(int turns = 0; turns <= k; turns++) {
        int[][] gridState = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int countNeighbors = 0;

                //top i-1,j
                if(i-1 > 0 && grid.get(i-1).get(j)==1)
                    countNeighbors++;

                //down i+1,j
                if(i+1 < row && grid.get(i+1).get(j)==1)
                    countNeighbors++;

                //left i,j-1
                if(j-1 > 0 && grid.get(i).get(j-1)==1)
                    countNeighbors++;

                //right i,j+1
                if(j+1 < col && grid.get(i).get(j+1)==1)
                    countNeighbors++;

                //top left i-1,j-1
                if(i-1 > 0 && j-1 > 0 && grid.get(i-1).get(j-1)==1)
                    countNeighbors++;

                //top right i-1,j+1
                if(i-1 > 0 && j+1 < col && grid.get(i-1).get(j+1)==1)
                    countNeighbors++;

                //bottom left i+1,j-1
                if(i+1 < row && j-1 > 0 && grid.get(i+1).get(j-1)==1)
                    countNeighbors++;

                //bottom right i+1,j+1
                if(i+1 < row && j+1 < col && grid.get(i+1).get(j+1)==1)
                    countNeighbors++;

                gridState[i][j] = countNeighbors;
            }
        }
        System.out.println(gridState.toString());
        for (int p = 0; p < row; p++){
            for(int q = 0; q < col; q++){
                if(rules.get(gridState[p][q]).equalsIgnoreCase("alive"))
                    grid.get(p).set(q,1);
                else
                    grid.get(p).set(q,0);
            }
        }
    }
    return grid;
}