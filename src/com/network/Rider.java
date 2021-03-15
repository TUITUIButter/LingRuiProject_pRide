package com.network;

import java.util.ArrayList;

/**
 * @ClassName: Rider
 * @Description: TODO
 * @Author: tuitui
 * @Date: 2021/3/15 7:22 下午
 * @Version 1.0
 **/
public class Rider {
    double x, y;
    Rider(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double[] CreatS(ArrayList<ArrayList<Crossroads>> R){
        double[] S = new double[R.size()];
        int i = 0;
        for(ArrayList<Crossroads> outIt : R){
            double min = Double.MAX_VALUE;
            for(Crossroads cross : outIt){
                double distance = Math.pow(cross.getX() * cross.getX() + cross.getY() * cross.getY(), 0.5);
                if(distance < min){
                    min = distance;
                }
            }
            S[i] = min;
            i++;
        }
        return S;
    }
}
