package entities;

import java.util.ArrayList;

public class TwoOpt {
    Route fromRoute, toRoute;
    int fromIndex, toIndex;
    double moveCost;

    public TwoOpt() {

    }

    protected void applyTwoOptMove() {
        if(fromRoute.equals(toRoute)) {
            ArrayList<Node> modifiedRoute = new ArrayList<Node>();
            for(int i = 0; i <= fromIndex; i++) {
                modifiedRoute.add(fromRoute.getRouteNodes().get(i));
            }
            for(int i = toIndex; i > fromIndex; i--) {
                modifiedRoute.add(fromRoute.getRouteNodes().get(i));
            }
            for(int i = toIndex + 1; i < fromRoute.getRouteSize(); i++) {
                modifiedRoute.add(fromRoute.getRouteNodes().get(i));
            }
            int load = 0;
            for(Node node : modifiedRoute) {
                load += node.getDemand();
            }
            fromRoute.setRouteNodes(modifiedRoute);
            fromRoute.getBus().setRemainingCap(fromRoute.getBus().getMaxCap() - load);
            fromRoute.setTotalRouteTimeInHrs(fromRoute.getTotalRouteTimeInHrs() + moveCost);
        } else {
            ArrayList<Node> modifiedRoute1 = new ArrayList<Node>();
            ArrayList<Node> modifiedRoute2 = new ArrayList<Node>();
            for(int i = 0; i <= fromIndex; i++) {
                modifiedRoute1.add(fromRoute.getRouteNodes().get(i));
            }
            for(int i = toIndex + 1; i < toRoute.getRouteSize(); i++) {
                modifiedRoute1.add(toRoute.getRouteNodes().get(i));
            }

            for (int i = 0 ; i <= toIndex; i++) {
                modifiedRoute2.add(toRoute.getRouteNodes().get(i));
            }
            for (int i = fromIndex + 1 ; i < fromRoute.getRouteSize(); i++) {
                modifiedRoute2.add(fromRoute.getRouteNodes().get(i));
            }
            fromRoute.setRouteNodes(modifiedRoute1);
            toRoute.setRouteNodes(modifiedRoute2);
            updateRouteCap(fromRoute);
            updateRouteCap(toRoute);
        }
    }

    private void updateRouteCap(Route route) {
        int load = 0;
        for(Node node : route.getRouteNodes()) {
            load += node.getDemand();
        }
        route.getBus().setRemainingCap(route.getBus().getMaxCap() - load);
    }

    public Route getFromRoute() {
        return fromRoute;
    }
    public void setFromRoute(Route fromRoute) {
        this.fromRoute = fromRoute;
    }
    public Route getToRoute() {
        return toRoute;
    }
    public void setToRoute(Route toRoute) {
        this.toRoute = toRoute;
    }
    public void setFromIndex(int fromIndex) {
        this.fromIndex = fromIndex;
    }
    public void setToIndex(int toIndex) {
        this.toIndex = toIndex;
    }
    public void setMoveCost(double moveCost) {
        this.moveCost = moveCost;
    }

}
