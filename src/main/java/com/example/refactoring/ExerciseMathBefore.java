package com.example.refactoring;

public class ExerciseMathBefore {

    public static int factorial(int args) {
        if (args <= 0) {
            throw new IllegalArgumentException("0以下の値は不正です。");
        }

        if (13 <= args) {
            throw new IllegalArgumentException("13以上の値は不正です。");
        }

        int answer = 1;
        for (int i = 1; i <= args; i++) {
            answer *= i;
        }
        return answer;
    }
}
