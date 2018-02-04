package com.example.android.astridshofi_1202154353_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Food, et_Portion; //Mendeklarasikan objek makanan dan porsinya
    Intent intent; //Mengarahkan ke aktivitas selanjutnya
    String restaurant, menu; //Tipe data
    int portion; //Tipe data

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Method yang pertama kali dijalankan ketika activity dijalankan
        super.onCreate(savedInstanceState); //Nyambung
        setContentView(R.layout.activity_main); //Layout Main activity
        et_Food = (EditText)findViewById(R.id.et_food); //et=edit text untuk Input Makanan
        et_Portion = (EditText)findViewById(R.id.et_portion); //Input Porsi
        intent = new Intent(this,ReviewPesanan.class);//Untuk Mengarahkan ke aktivitas selanjutnya
    }

    public void onEatbus(View view) {
        menu = et_Food.getText().toString(); //Mengambil data input makanan
        restaurant = "Eatbus"; //Set restaurant
        portion = Integer.parseInt(et_Portion.getText().toString()); //Mengambil data input porsi
        int total = 50000 * portion; //Dikalikan
        Log.d("TOTAL HARGA", "Rp."+total);
        intent.putExtra("restaurant", restaurant);//Fungsinya putExtra untuk melempar ke second activity,Intent untuk melink ke aktivitas selanjutnya
        intent.putExtra("menu",menu);
        intent.putExtra("portion", portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }


    public void onAbnormal(View view) { //Sama kaya Eatbus
        menu = et_Food.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(et_Portion.getText().toString());
        int total = 30000 * portion;
        Log.d("TOTAL HARGA", "Rp."+total);
        intent.putExtra("restaurant", restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion", portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}
