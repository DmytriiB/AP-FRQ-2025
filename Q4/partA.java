
public SumOrSameGame(int numRows, int numCols){
  puzzle = new int[numRows][numCols];
  for(int row = 0; row< puzzle.length; row++){
    for(int col = 0; col< puzzle[0].length; col++){
      puzzle[row][col] = (int)(Math.random()*9)+1;
    }
  }
}
