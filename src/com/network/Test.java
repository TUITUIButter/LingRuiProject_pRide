package com.network;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Chart chart = new Chart();
        for(int i = 0; i < 32;i++){
            for(int j = 0; j < 32;j++){
                chart.addCrossroads(i, j);
            }
        }
        ArrayList<ArrayList<Crossroads>> R = new RandomSet(chart).getR();
        System.out.println(R);


    }
}
