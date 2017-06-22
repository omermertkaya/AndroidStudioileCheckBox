package com.example.mert.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkKedi,checkKopek,checkBalik;
    private Button sec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butonayaz();
        GostermeFonk();
    }
    public void butonayaz(){
        checkKedi = (CheckBox)findViewById(R.id.checkBox);
        checkKopek = (CheckBox)findViewById(R.id.checkBox2);
        checkBalik = (CheckBox)findViewById(R.id.checkBox3);
        sec = (Button)findViewById(R.id.button);

        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sonuc = new StringBuffer();
                sonuc.append("Kedi : ").append(checkKedi.isChecked()); // ischecked ne yaptı True False
                sonuc.append("\nKopek : ").append(checkKopek.isChecked());
                sonuc.append("\nBalik : ").append(checkBalik.isChecked());

                Toast.makeText(MainActivity.this,sonuc.toString(),Toast.LENGTH_LONG).show();

            }
        });



    }

    public void GostermeFonk(){
        checkKedi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(MainActivity.this,"Kedi Seçildi",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );





        checkKopek.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(MainActivity.this,"Kopek Seçildi",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );


    }

}
