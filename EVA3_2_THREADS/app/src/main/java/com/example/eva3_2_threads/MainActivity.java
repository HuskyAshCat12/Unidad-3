package com.example.eva3_2_threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        //SIMULAR UNA TAREA QUE TOME MUCHO TIEMPO

        for (int i = 0; i < 10; i++){
            //Duerme al hilo principal
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

         */

        Thread tHilo1 = new Thread(){
            @Override
            public void run() { //Aqui va el trabajo en segundo plano
                super.run();
                //SIMULAR UNA TAREA QUE TOME MUCHO TIEMPO

                for (int i = 0; i < 10; i++){
                    //Duerme al hilo principal
                    try {
                        Thread.sleep(1000);
                        Log.wtf("tHilo1",i+ "");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        tHilo1.start();//Crea un nuevo hilo
    }
}
