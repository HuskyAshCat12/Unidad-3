package com.example.eva3_4_multiples_hilos;

import android.util.Log;

public class MiRunnable implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.wtf("MiRunnable",i+"");
            i++;
        }
    }
}
