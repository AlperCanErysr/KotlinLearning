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

        //Integer

        println("---------- Integer ---------")
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

        var myLong : Long = 100;
        println(myLong);


        //Double && Float

        println("---------- Double && Float ----------")

        val pi = 3.14;
        println(pi*2);

        val myFloat = 3.14f;
        println(myFloat*2)

        val myNotes : Double = 3.43;
        println(myNotes/2);


        //String
        println("---------- String ----------");

        val myString = "alper Can Eryasar";

        val name = "James";
        val surname = "Hetfield";
        val fullName = name + " " + surname;

        println(fullName);

        val larsName : String = "Lars";

        println(myString.capitalize()) //ilk harfini büyük yapıyor


        println("---------- Boolean ----------");

        var myBoolean : Boolean = true;
        myBoolean = false;

        var isAlive = true;

        println(3<5);
        println(5<3);


        //Conversion
        println("---------- Conversion ----------");

        var myNumber = 5;
        var myLongNumber = myNumber.toLong();
        println(myLongNumber);

        var input = "10";
        var inputInteger = input.toInt();
        println(inputInteger*2);


        //Collections
        //Arrays
        println("---------- Array ----------");

        val myArray = arrayOf("James","Kirk","Lars","Bob");
        //index
        println(myArray[0]);
        myArray[0] = "James Hetfield";
        println(myArray[0]);

        myArray.set(1,"Kirk Hammett");
        println(myArray[1]);

        /*
        myArray[4] = "Alper Can Eryasar";
        println(myArray[4])
        */

        val numberArray = arrayOf(1,2,3,4,5);
        println(numberArray[3]);

        val myNewArray = doubleArrayOf(1.0,2.0,3.0);
        val mixedArray = arrayOf("Alper",5);
        println(mixedArray[0]);
        println(mixedArray[1]);


        //List - ArrayList
        println("---------- List ----------");

        val myMusicians = arrayListOf<String>("James","Kirk")
        myMusicians.add("Lars");
        println(myMusicians[2]);
        myMusicians.add(0,"Can");
        println(myMusicians[0]);

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1);
        myArrayList.add(200);

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Alper Can");
        myMixedArrayList.add(20);
        myMixedArrayList.add(20.15);
        myMixedArrayList.add(false);

        println(myMixedArrayList[0]);
        println(myMixedArrayList[1]);
        println(myMixedArrayList[2]);
        println(myMixedArrayList[3]);


        //Set
        println("---------- Set ----------");

        val myExampleArray = arrayOf(1,2,3,4);

        println("Element 1 : ${myExampleArray[0]}");
        println("Element 2 : ${myExampleArray[1]}");
        println("Element 3 : ${myExampleArray[2]}");
        println("Element 4 : ${myExampleArray[3]}");

        val mySet = setOf<Int>(1,1,2,2,3,3,4,4);

        println(mySet.size);

        //For Each
        println("---------- For Each ----------");

        mySet.forEach {
            println(it)
        }

        val myStringSet = HashSet<String>();
        myStringSet.add("Alper Can");
        myStringSet.add("Alper Can");

        println(myStringSet.size);


        //Map - HashMap
        println("---------- Map ----------");

        //Key - Value

        val fruitArray = arrayOf("Apple","Banana");
        val caloriesArray = arrayOf(100,50);

        println("${fruitArray[0]} : ${caloriesArray[0]}");

        val fruitCaloriesArray = hashMapOf<String,Int>();
        fruitCaloriesArray.put("Apple",100);
        fruitCaloriesArray.put("Banana",50);

        println(fruitCaloriesArray["Apple"]);

        //Operator
        println("---------- Operator ----------");

        var m = 5;
        println(m);
        m = m + 1;
        println(m);
        m+=1;
        println(m);
        m++;
        println(m)


        //If Control
        println("---------- If Control ----------");

        val myNumberAge = 50;

        if (myNumberAge <30){
            println("<30");
        }else if(myNumberAge>=30 && myNumberAge<40){
            println("30-40");
        }else if (myNumberAge>=40 && myNumberAge<50){
            println("40-50");
        }else{
            println(">=50")
        }


        //Switch - When
        println("---------- Switch - When ----------");

        val day = 5;
        var dayString = "";

        if (day == 1){
            dayString = "Monday";
            println(dayString);
        }else if (day == 2){
            dayString = "Tuesday"
            println(dayString);
        }else if (day == 3){
            dayString = "Wednesyad"
            println(dayString);
        }else if (day == 4){
            dayString = "Thursday"
            println(dayString);
        }else if (day == 5){
            dayString = "Friday"
            println(dayString);
        }else if (day == 6){
            dayString = "Saturday"
            println(dayString);
        }else if (day == 7){
            dayString = "Sunday"
            println(dayString);
        }


        when(day){

            1 -> dayString = "Monday";
            2 -> dayString = "Tuesday";
            3 -> dayString = "Wednesday";
            4 -> dayString = "Thursday";
            5 -> dayString = "Friday";
            6 -> dayString = "Saturday";
            7 -> dayString = "Sunday";

        }
        println(dayString);


        //Loops

        //For Loop
        println("---------- For Loop ----------");

        val myArrayOfNumbers = arrayOf(10,20,30,40,50,60,70,80,90,100);
        val q = myArrayOfNumbers[9] / 5 * 10;
        println(q);

        for (number in myArrayOfNumbers){
            val q = number / 5 * 10;
            println(q)
        }













    }
}