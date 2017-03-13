package com.peregruzka;

public class Main {
    public static void main(String[] args) {
        System.out.println(summ(25.1f,12.3f));
        System.out.println(summ(15,22,33));
    }
    public static float summ(float a, float b, float c){
        return a+b+c;
    }
    public static float summ(float a, float b){
        return a+b;
    }
    public static int summ(int a, int b, int c){
        return a+b+c;
    }
}
