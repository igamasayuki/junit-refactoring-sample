package com.example.sample;

public class MyMath {

    /**
     * aのn乗を求める.
     * @param a ベース
     * @param n 指数
     * @return aのn乗
     */
    public static double power(int a, int n) {
        if(a >= 100 || n >= 100){
            throw new IllegalArgumentException("100以上の値は不正です");
        }
        return Math.pow(a, n);
    }
}
