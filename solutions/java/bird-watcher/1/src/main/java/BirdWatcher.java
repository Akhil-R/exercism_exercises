
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int arrSize = birdsPerDay.length;
        return birdsPerDay[arrSize-1];

    }

    public void incrementTodaysCount() {
        int arrSize = birdsPerDay.length;
        birdsPerDay[arrSize-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int noOfBirds:birdsPerDay){
            if (noOfBirds==0)
            {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int noOfBirds = 0;
         int arrSize = birdsPerDay.length;
        for(int i=0; i<numberOfDays && i<arrSize ; i++)
            {
                noOfBirds += birdsPerDay[i];
            }
        return noOfBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
          for(int noOfBirds:birdsPerDay){
              if(noOfBirds >= 5){
                  busyDays += 1;
              }           
        }
        return busyDays;
    }
}
