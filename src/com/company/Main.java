package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int task = MyFun(3,5);
        System.out.print(task);
    }
    public static int MyFun( int a, int b){
        int result = 1;
        for(int i=0; i < b; i++)
            result *=a;
        return result;
    }
}
