package com.patern;

// Однопоточный
public class SingletonApp {
    public static void main(String[] args) {

        final int size = 1000;
        Singleton arr[] = new Singleton[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Singleton.getInstanse();
        }
        System.out.println(Singleton.counter);
    }
}

    class Singleton {
        public static int counter = 0;
        private static Singleton instanse;
        private Singleton(){
            counter++;
        }

        public static Singleton getInstanse(){
            if(instanse == null){
                instanse = new Singleton();
            }
            return instanse;
        }
    }