package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Text1, Text2, Text3;
    private TextView tvText1, tvText2, tvText3 ;
    private Button Button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text1 = findViewById(R.id.T1);
        Text2 = findViewById(R.id.T2);
        Text3 = findViewById(R.id.T3);
        Button1 =  findViewById(R.id.B1);

        Button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String sNama = Text1.getText().toString();
                String sNim = Text2.getText().toString();
                String sNilai = Text3.getText().toString();

                double nilai = Double.parseDouble(sNilai);
                sNilai = hitungNilai(nilai);
                setContentView(R.layout.tampilanhasil);
                tvText1 = findViewById(R.id.tvT1);
                tvText2 = findViewById(R.id.tvT2);
                tvText3 = findViewById(R.id.tvT3);

                tvText1.setText("Nama: "+sNama);
                tvText2.setText("NIM : "+sNim);
                tvText3.setText("Nilai :"+sNilai);
            }
        });

    }

    protected String hitungNilai (double nilai){
        if (nilai > 3.66 && nilai <=4.00) {
            return "A";}
        else if (nilai > 3.33 && nilai <=3.66 ) {
            return "A-";}
        else if (nilai > 3.00 && nilai <=3.33 ) {
            return "B+";}
        else if (nilai > 2.66 && nilai <=3.00 ) {
            return "B";}
        else if (nilai > 2.33 && nilai <=2.66 ) {
            return "B-";}
        else if (nilai > 2.00 && nilai <=2.33 ) {
            return "C+";}
        else if (nilai > 1.66 && nilai <=2.00 ) {
            return"C";}
        else if (nilai > 1.33 && nilai <=1.66 ) {
            return "C-";}
        else if (nilai > 1.00 && nilai <=1.33 ) {
            return "D+";}
        else if (nilai ==1.00 ) {
            return "D";}
        else{
            return "Nilai yang dimasukkan tidak sesuai!";}
    }
}