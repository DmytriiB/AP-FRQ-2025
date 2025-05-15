public boolean clearPair(int row, int col){
  for(int r = 0; r < puzzle.length; r++){
    for(int c = 0; c< puzzle[0].length; c++){
      if(r != row || c != col){
        if(puzzle[row][col] == pizzle[r][c] || puzzle[row][col] + puzzle[r][c] == 10){
          puzzle[row][col] = 0;
          puzzle[r][c] = 0;
          return true;
        }
      }
    }
  }
  return false;
}
        
