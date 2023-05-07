package com.can_erysr.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //Variables && Constants

        var x = 5;
        var y = 4;

        println(x*y);

        var age = 35;
        println("Age = " + age/7*5);

        age = 36;
        println("New age = " + age/6);
        
        val age1 = 20;

        //VAR DAHA SONRA DEĞİŞTİRİLEBİLİYOR
        //VAL DAHA SONRA DEĞİŞTİRİLEMİYOR



    }
}