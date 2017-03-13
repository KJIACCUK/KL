package com.patern;
///Очень крутой пример Singleton с многопоточкой
public class SingletonMnog {
    public static void main(String[] args) throws InterruptedException{
    final int size = 1000;

    Thread t[] = new Thread[size];
        for (int i = 0; i < size; i++) {
            t[i] = new Thread(new R());
            t[i].start();
    }
    for(int i=0; i<size; i++){
            t[i].join();
    }
        System.out.println(Mnogop.counter);
}
}

class R implements Runnable{
    @Override
    public void run() {
        Mnogop.getInstance();
    }
}

class Mnogop{
    //или вот так private static final Object sync = new Object();
    public static int counter = 0;
    private static volatile Mnogop instance = null;
    private Mnogop(){
        counter++;
    }

public static Mnogop getInstance(){
    if(instance == null){
        synchronized (Mnogop.class){ //или вот так synchronized(sync)
            if(instance == null)
            instance = new Mnogop();
        }
    }
    return instance;
}
}
