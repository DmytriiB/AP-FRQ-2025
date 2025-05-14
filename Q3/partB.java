public ArrayList<Match> buildMatches(){
  ArrayList<Match> matches = new ArrayList<Match>();
  for(int i = 0; i< competitorList.size();i++){
    for(int j = competitorList.size()-1; j>i; j++){
      if(i == j){
        return matches;
      }
      else{
        matches.add(Match(competitorList.get(i), competitorList.get(j)));
      }
    }
  }
}
