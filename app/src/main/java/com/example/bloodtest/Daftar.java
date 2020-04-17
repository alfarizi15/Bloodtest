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
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;




public class Daftar extends AppCompatActivity {
    AutoCompleteTextView act;

    ArrayAdapter<String> adapter;

    String[] item = {"O","A","B","AB"};
    String[] item2 = {"POSITIVE","NEGATIF"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        act = (AutoCompleteTextView) findViewById(R.id.ac1);
        act = (AutoCompleteTextView) findViewById(R.id.ac2);

                //membuat adapter untuk menampilkan list item
                adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, item);

        //menerapkan adapter pada objek act
        act.setAdapter(adapter);
    }

    public void backhome (View view){
        Intent backhome = new Intent(this, MainActivity.class);
        startActivity(backhome);


    }
    public void almost (View view){
        Intent almost = new Intent(this, almost.class);
        startActivity(almost);
    }



}




