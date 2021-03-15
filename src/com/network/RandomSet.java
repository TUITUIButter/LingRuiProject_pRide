package com.network;

import java.util.ArrayList;
import java.util.Random;

public class RandomSet {
    public ArrayList<ArrayList<Crossroads>> R = new ArrayList<>();
    ArrayList<Crossroads> crossroads;

    RandomSet(Chart chart){
        crossroads = chart.getCrossroads();
        init();
    }

    public void init(){
        int n = crossroads.size();
        int sizeOfR = (int)Math.floor(Math.log(n) / Math.log(2));

        //添加随机子集
        Random r = new Random();
        for(int i = 1; i <= sizeOfR; i++){
            ArrayList<Crossroads> subset = new ArrayList<>();
            // 第i项随机添加2^i个
            for(int j = 0; j < Math.pow(2,i-1); j++){
                int temp = r.nextInt(n);
                subset.add(crossroads.get(temp));
            }
            R.add(subset);
        }
    }

    public ArrayList<ArrayList<Crossroads>> getR() {
        return R;
    }
}
