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

        // ArrayList<ArrayList<Crossroads>> R = new RandomSet(chart).getR();
        Rider rider1 = new Rider(4,5);
        Rider rider2 = new Rider(4,4.5);
        Rider rider3 = new Rider(4,6);

        int wrong = 0;
        for(int num = 0; num < 4000;num++){
            ArrayList<ArrayList<Crossroads>> R = new RandomSet(chart).getR();
            double[] S1 = rider1.CreatS(R);
            double[] S2 = rider2.CreatS(R);
            double[] S3 = rider3.CreatS(R);

            double dis = CompareDis.Compare(S1, S2);
            double dis2 = CompareDis.Compare(S1, S3);

            if(dis2 < dis){
                wrong++;
            }
        }
        System.out.println(wrong/4000.0);

    }
}
