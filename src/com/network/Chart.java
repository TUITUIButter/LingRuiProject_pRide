package com.network;

import java.util.ArrayList;

public class Chart {
    public ArrayList<Crossroads> crossroads = new ArrayList<Crossroads>();

    public void addCrossroads(double x,double y){
        crossroads.add(new Crossroads(x ,y));
    }

    public void addCrossroads(Crossroads c){
        crossroads.add(c);
    }

    public ArrayList<Crossroads> getCrossroads() {
        return crossroads;
    }
}
