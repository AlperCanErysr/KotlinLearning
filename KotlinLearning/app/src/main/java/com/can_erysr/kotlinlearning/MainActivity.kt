package com.can_erysr.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //VAR DAHA SONRA DEĞİŞTİRİLEBİLİYOR
        //VAL DAHA SONRA DEĞİŞTİRİLEMİYOR

       //Variables && Constants

        var x = 5;
        var y = 4;

        println(x*y);

        var age = 35;

        val result = age /7*5;
        println("Result = " + result);

        //Defining = tanımlamak
        var myInteger : Int // !!! benim myInteger değişkenim "int" değerinden başka bir değer alamaz !!!

        //Initialize = ilk değerini atamak
        myInteger = 10;
        myInteger = 20;

        var a : Int = 23; // yukarıda yapılanınn aynısı ama daha kısası ikisini de aynı anda yapıyor

        println(a/2); // tam sayı olduğu için 11.5 değil 11 yazdırdı







    }
}