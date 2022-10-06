package entities;

public class Bus {

    private int busID, remainingCap;
    public static final int speedKMH = 35;
    private final int maxCap = 3000;


    public Bus() {
        this.busID = BusRoutingProblem.busCounter.incrementAndGet();
        this.remainingCap = maxCap;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public int getRemainingCap() {
        return remainingCap;
    }

    public void setRemainingCap(int remainingCap) {
        this.remainingCap = remainingCap;
    }

    public int getMaxCap() {
        return maxCap;
    }

}

