package com.example.eva3_5_interrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Thread tHilo;

    Runnable rRun = new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //break, continue
                    break;
                }
                Log.wtf("MiRunnable",i+"");
                i++;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tHilo = new Thread(rRun);
        Toast.makeText(this, "Estado: " + tHilo.getState(), Toast.LENGTH_SHORT).show();
        Log.wtf("MiRunnable",tHilo.getState()+"");
        tHilo.start();
        Toast.makeText(this, "Estado: " + tHilo.getState(), Toast.LENGTH_SHORT).show();
        Log.wtf("MiRunnable",tHilo.getState()+"");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tHilo.interrupt();
    }
}
