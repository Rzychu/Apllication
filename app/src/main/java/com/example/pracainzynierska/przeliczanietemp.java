package com.example.pracainzynierska;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class przeliczanietemp extends AppCompatActivity {
    EditText celsjusz;
    EditText kelwin;
    TextView wynik;
    Button przyciskkelwin;
    Button przyciskcelsjusz;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.przeliczanietemp);

        celsjusz = findViewById(R.id.Celsjusz);
        kelwin = findViewById(R.id.Kelwin);
        wynik = findViewById(R.id.wynik);
        przyciskkelwin = findViewById(R.id.wynikkelwin);
        przyciskcelsjusz = findViewById(R.id.wynikcelsjusz);


    przyciskkelwin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (celsjusz.getText().toString().isEmpty()){
            Toast toast = Toast.makeText(getApplicationContext(), "Wprowadz poprawne dane", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Float stopniecelsjusza = Float.valueOf(celsjusz.getText().toString());
            double suma = (stopniecelsjusza + 273.15);
            String sum = String.format("%.2f", suma);
            wynik.setText(sum);
        }
    }
});

    przyciskcelsjusz.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (kelwin.getText().toString().isEmpty()){
                Toast toast = Toast.makeText(getApplicationContext(), "Wprowadz poprawne dane", Toast.LENGTH_SHORT);
                toast.show();
            }
            else {
                Float stopniekelwina = Float.valueOf(kelwin.getText().toString());
                double roznica = (stopniekelwina - 273.15);
                String roz = String.format("%.2f", roznica);
                wynik.setText(roz);
            }
        }
    });
    }
}



