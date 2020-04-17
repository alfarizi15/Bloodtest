
/*
Waktu pengerjaan : 13-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/

package com.example.bloodtest;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button btAlert;
    EditText contoh;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contoh = findViewById(R.id.txtusername);

        btAlert = (Button) findViewById(R.id.bt_login);
        btAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);
        String stringIsian = contoh.getText().toString();
        // set title dialog
        alertDialogBuilder.setTitle("Cek data ?"+stringIsian);

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("isi semua data!")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        dialog.cancel();
                    }
                })
               ;

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        if (stringIsian.equals("")){
            alertDialog.show();
        }else{


        }

    }
    public void daftar(View view) {
        Intent daftar= new Intent(MainActivity.this, Daftar.class);
        startActivity(daftar);
    }


        public void coba (View view){
            Intent coba = new Intent(this, almost.class);
            startActivity(coba);
        }

    public void almost (View view){
        Intent almost = new Intent(this, almost.class);
        startActivity(almost);
    }


}