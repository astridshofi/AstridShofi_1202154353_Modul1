package com.example.android.astridshofi_1202154353_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReviewPesanan extends AppCompatActivity {
    TextView tvRestaurant, tvMenu, tvPortion, tvprice;
    String restaurant, menu;
    int portion, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesanan);
        tvRestaurant = (TextView)findViewById(R.id.tv_restaurant);//TV= Text View untuk mengambil ID dari xml
        tvMenu = (TextView)findViewById(R.id.tv_menu); //Sama juga
        tvPortion = (TextView)findViewById(R.id.tv_portion);
        tvprice = (TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent(); //Mengambil data dari main activity
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion",0);
        price = intent.getIntExtra("price",0);

        tvRestaurant.setText(restaurant); //setText untuk mengisi komponen dengan datanya
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvprice.setText("Rp. "+price);

        Toast toast = null; //Toast untuk message inisialsasi toasnya null
        if (price < 65000){
            toast = Toast.makeText(getApplicationContext(), "Cocok dengan harga dan kapasitas dompetmu",Toast.LENGTH_SHORT); // pesan yang akan timbul jika kurang dari 65000
        }else {
            toast = Toast.makeText(getApplicationContext(),"Terlalu Mahal",Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
