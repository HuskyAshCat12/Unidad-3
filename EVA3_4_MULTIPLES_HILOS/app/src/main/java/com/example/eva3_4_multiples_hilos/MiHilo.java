package com.example.eva3_4_multiples_hilos;

import android.util.Log;

public class MiHilo extends Thread {
    @Override
    public void run() {
        super.run();
        int i = 0;
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.wtf("MiHilo",i+"");
                i++;
            }
    }
}
