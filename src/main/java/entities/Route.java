package entities;

import java.util.ArrayList;

public class Route implements Cloneable {

    private int routeID;
    private Bus bus;
    private ArrayList<Node> routeNodes;
    private double totalRouteTimeInHrs;
    private boolean finalised;

    public Route(Bus bus) {
        this.bus = bus;
        this.routeID = bus.getBusID();
        this.routeNodes = new ArrayList<Node>();
        this.totalRouteTimeInHrs = 0;
        this.finalised = false;
    }
    public boolean equals(Route otherRoute) {
        return this.routeID == otherRoute.getRouteID();
    }

    public int getRouteSize() {
        return routeNodes.size();
    }

    public void addNodeToRoute(Node node) {
        routeNodes.add(node);
        node.updateServiceStatus(true);
        //TODO increase totalRouteTimeInHrs
    }

    public Node getCurrentNode() {
        return routeNodes.get(routeNodes.size() - 1);
    }

    public void updateCap(Node addedNode) {
        int cap = bus.getRemainingCap();
        bus.setRemainingCap(cap - addedNode.getDemand());
    }

    public void updateTotalRouteTime(double cost, Node node) {
        setTotalRouteTimeInHrs(getTotalRouteTimeInHrs() + cost + node.getServicetime());
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
    public ArrayList<Node> getRouteNodes() {
        return routeNodes;
    }
    public void setRouteNodes(ArrayList<Node> routeNodes) {
        this.routeNodes = routeNodes;
    }
    public double getTotalRouteTimeInHrs() {return totalRouteTimeInHrs;}
    public void setTotalRouteTimeInHrs(double totalRouteTimeInHrs) {
        this.totalRouteTimeInHrs = totalRouteTimeInHrs;
    }
    public boolean isFinalised() {return finalised;}
    public void setFinalised(boolean finalised) {
        this.finalised = finalised;
    }
}
