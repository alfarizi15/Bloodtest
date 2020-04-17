
/*
Waktu pengerjaan : 13-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/


package com.example.bloodtest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
    public void homes (View view){
        Intent homes = new Intent(this, homes.class);
        startActivity(homes);
    }

}
