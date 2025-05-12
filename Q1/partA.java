public int walkDogs(int hour){
        //find out from dogWalkCompany how many dogs at that hour
        int numDogs =  company.numAvailableDogs(hour);
        if(maxDogs > numDogs){
            company.updateDogs(numDogs);
            return numDogs;
        }
        else{
            company.updateDogs(maxDogs);
            return maxDogs;
        }
    }
