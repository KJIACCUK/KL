package com.interfacejv;

public class MyArray implements Array {
    int a[] = new int[3];
    int size = 0;

    @Override
    public int Get(int i){
        return a[i];
    }

    @Override
    public boolean Add(int value) {
        if (size != a.length) {
            a[size]=value;
            size++;
            return true;
        } else
            return false;
    }
}
