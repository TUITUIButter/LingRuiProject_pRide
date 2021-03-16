package com.network;

public class CompareDis {
    public static double Compare(double[] S1,double[] S2){
        double max = -1;
        for(int i = 0; i < S1.length; i++){
            double dis = Math.abs((S1[i] - S2[i]));
            if(dis > max){
                max = dis;
            }
        }
        return max;
    }
}
