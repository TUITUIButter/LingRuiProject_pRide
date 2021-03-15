package com.network;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Chart chart = new Chart();
        for(int i = 0; i < 8;i++){
            for(int j = 0; j < 8;j++){
                chart.addCrossroads(i, j);
            }
        }
        ArrayList<ArrayList<Crossroads>> R = new RandomSet(chart).getR();
        Rider rider = new Rider(4,5);
        double[] S = rider.CreatS(R);
        System.out.println(S);


    }
}
