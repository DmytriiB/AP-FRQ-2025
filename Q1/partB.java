public int dogWalkShift(int startHour, int endHour){
  int moneyEarned = 0;

  for(int hour = startHour; hour<= endHour; hour++){
    int dogs = walkDogs(hour);
    moneyEarned += dogs*5;
    if(dogs = maxDogs || (hour>= 9 && hour <= 17)){
      moneyEarned += 3;
    }
  }  
}
