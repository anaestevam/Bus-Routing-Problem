package entities;

public class SwapMove {
    private int sourceIndex, targetIndex;
    private double moveCostFrom, moveCostTo, moveCost;
    private int fromRemainingCap, toRemainingCap;
    private Route examinedRouteFrom, examinedRouteTo;

    public SwapMove() {

    }

    protected void applySwapMove() {
        if(examinedRouteFrom.equals(examinedRouteTo)) {
            Node b = examinedRouteFrom.getRouteNodes().get(sourceIndex);
            Node f = examinedRouteTo.getRouteNodes().get(targetIndex);

            examinedRouteFrom.getRouteNodes().set(sourceIndex, f);
            examinedRouteTo.getRouteNodes().set(targetIndex, b);

        } else {
            Node b = examinedRouteFrom.getRouteNodes().get(sourceIndex);
            Node f = examinedRouteTo.getRouteNodes().get(targetIndex);


            examinedRouteFrom.getBus().setRemainingCap(fromRemainingCap);
            examinedRouteTo.getBus().setRemainingCap(toRemainingCap);

            examinedRouteFrom.getRouteNodes().set(sourceIndex, f);
            examinedRouteTo.getRouteNodes().set(targetIndex, b);
        }
    }

    public void setSourceIndex(int sourceIndex) {
        this.sourceIndex = sourceIndex;
    }
    public void setTargetIndex(int targetIndex) {
        this.targetIndex = targetIndex;
    }
    public double getMoveCostFrom() {
        return moveCostFrom;
    }
    public void setMoveCostFrom(double moveCostFrom) {
        this.moveCostFrom = moveCostFrom;
    }
    public void setMoveCostTo(double moveCostTo) {
        this.moveCostTo = moveCostTo;
    }
    public void setMoveCost(double moveCost) {
        this.moveCost = moveCost;
    }
    public void setFromRemainingCap(int fromRemainingCap) {
        this.fromRemainingCap = fromRemainingCap;
    }
    public void setToRemainingCap(int toRemainingCap) {
        this.toRemainingCap = toRemainingCap;
    }
    public Route getExaminedRouteFrom() {
        return examinedRouteFrom;
    }
    public void setExaminedRouteFrom(Route examinedRouteFrom) {
        this.examinedRouteFrom = examinedRouteFrom;
    }
    public Route getExaminedRouteTo() {
        return examinedRouteTo;
    }
    public void setExaminedRouteTo(Route examinedRouteTo) {
        this.examinedRouteTo = examinedRouteTo;
    }

}
