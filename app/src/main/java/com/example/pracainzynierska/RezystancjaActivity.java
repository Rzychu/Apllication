package com.example.pracainzynierska;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class RezystancjaActivity extends AppCompatActivity {

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rezystancja_layout);


        final TextView wynikrez = findViewById(R.id.wynikrez);
        final RadioButton szeregowo = findViewById(R.id.szeregowo);
        final RadioButton rownolegle = findViewById(R.id.rownolegle);
        final EditText pole1 = findViewById(R.id.pole1);
        final EditText pole2 = findViewById(R.id.pole2);
        final Button przelicz1 = findViewById(R.id.przelicz1);


        przelicz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (szeregowo.isChecked()) {

                    Float liczba = Float.valueOf(pole1.getText().toString());
                    Float liczba2 = Float.valueOf(pole2.getText().toString());
                    Float suma = liczba + liczba2;
                    wynikrez.setText(suma.toString());
                }

                else if (rownolegle.isChecked()) {
                    Float liczba = Float.valueOf(pole1.getText().toString());
                    Float liczba2 = Float.valueOf(pole2.getText().toString());
                    Float suma = (1/liczba) + (1/liczba2);
                    wynikrez.setText(suma.toString());
                }
            }
        });
    }
}
