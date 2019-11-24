package com.example.pracainzynierska;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

    public class ResistorActivity extends AppCompatActivity {

        TextView widok;
        TextView widok2;
        Button przelicz;
        int pasekk;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.rez);

            widok = findViewById(R.id.widok);
            przelicz = findViewById(R.id.button);

            List<Resistor> Resistor = new ArrayList<>();
            Resistor.add(new Resistor("Czarny", 0, 0,  1, " 0%"));
            Resistor.add(new Resistor("Brązowy", 1, 1, 10, " ~1%"));
            Resistor.add(new Resistor("Czerwony", 2, 2, 100, " ~2%"));
            Resistor.add(new Resistor("Pomarańczowy", 3, 3, 1000, " 0%"));
            Resistor.add(new Resistor("Żółty", 4, 4, 10000, " 0%"));
            Resistor.add(new Resistor("Zielony", 5, 5, 100000, " ~0,5%"));
            Resistor.add(new Resistor("Niebieski", 6, 6, 1000000, " ~0,25%"));
            Resistor.add(new Resistor("Fioletowy", 7, 7, 10000000, " ~ 0,1%"));
            Resistor.add(new Resistor("Szary", 8, 8, 0, " ~ 0,05%"));
            Resistor.add(new Resistor("Biały", 9, 9, 0, " 0%"));
            Resistor.add(new Resistor("Złoty", 0, 0, 0.1 , " ~ 5%"));
            Resistor.add(new Resistor("Srebrny", 0, 0, 0.01, " ~ 10%"));

            final Spinner spinner = findViewById(R.id.kolor1);
            final ArrayAdapter<Resistor> adapter = new ArrayAdapter<Resistor>(this, android.R.layout.simple_spinner_dropdown_item, Resistor);
            spinner.setAdapter(adapter);

            final Spinner spinner1 = findViewById(R.id.kolor2);
            final ArrayAdapter<Resistor> adapter1 = new ArrayAdapter<Resistor>(this, android.R.layout.simple_spinner_dropdown_item, Resistor);
            spinner1.setAdapter(adapter1);

            final Spinner spinner2 = findViewById(R.id.mnoznik);
            final ArrayAdapter<Resistor> adapter2 = new ArrayAdapter<Resistor>(this, android.R.layout.simple_spinner_dropdown_item, Resistor);
            spinner2.setAdapter(adapter2);

            final Spinner spinner3 = findViewById(R.id.tolerancja);
            final ArrayAdapter<Resistor> adapter3 = new ArrayAdapter<Resistor>(this, android.R.layout.simple_spinner_dropdown_item, Resistor);
            spinner3.setAdapter(adapter3);

            przelicz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Resistor r1 = (com.example.pracainzynierska.Resistor) spinner.getSelectedItem();
                    final Resistor r2 = (com.example.pracainzynierska.Resistor) spinner1.getSelectedItem();
                    final Resistor r3 = (com.example.pracainzynierska.Resistor) spinner2.getSelectedItem();
                    final Resistor r4 = (com.example.pracainzynierska.Resistor) spinner3.getSelectedItem();

                    pasekk = (r1.getpasek1()*10 + r2.getpasek2());
                    double wynik = (pasekk * r3.getv());
                    String wyniktolerancji = (wynik +" " + r4.geto()+ "Ω");
                    widok.setText(wyniktolerancji);
                }
            });
        }
    }


