package AdvancedCodingExercise19;

public class CoffeeGrinder {
    private final int speedInGramsPerSeconds;

    public CoffeeGrinder(int speedInGramsPerSeconds) {
        this.speedInGramsPerSeconds = speedInGramsPerSeconds;
    }
    public synchronized int grind(int coffeeQuantity, int granularity){
        int waitingTimeInMillis = coffeeQuantity / speedInGramsPerSeconds * 1000;
        waitingTimeInMillis = waitingTimeInMillis + (waitingTimeInMillis / 100 * granularity);
        System.out.println("Coffee grinder will start grinding " + coffeeQuantity + " grams of coffee");
        try {
            Thread.sleep(waitingTimeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Coffee grinder job finished in " + waitingTimeInMillis);
        return coffeeQuantity;
    }
}
