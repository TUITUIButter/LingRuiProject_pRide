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
                double x_d = cross.getX() - x;
                double y_d = cross.getY() - y;
                //double distance = Math.pow(x_d * x_d + y_d * y_d, 0.5);
                double distance = Math.abs(x_d) + Math.abs(y_d);
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
