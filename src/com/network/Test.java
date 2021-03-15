package com.network;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Chart chart = new Chart();
        chart.addCrossroads(1,1);
        chart.addCrossroads(2,2);
        chart.addCrossroads(3,3);
        chart.addCrossroads(1,3);
        chart.addCrossroads(1,2);
        chart.addCrossroads(2,3);
        chart.addCrossroads(2,1);
        chart.addCrossroads(3,1);

        ArrayList<ArrayList<Crossroads>> R = new RandomSet(chart).getR();
        System.out.println(R);
    }
}
