package com.network;

public class Crossroads {
    public double x;
    public double y;

    Crossroads(double x, double y){
        this.x = x;
        this.y = y;
    }

    Crossroads(){}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
