package com.example.pracainzynierska;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button konwerter;
    Button przeliczanietemp;
    Button kontakt;
    Button rezystancja;
    Button quitt;
    Button rezystancja1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        konwerter = findViewById(R.id.button2);
        konwerter.setOnClickListener(this);

        przeliczanietemp = findViewById(R.id.przycisk_temperatura);
        przeliczanietemp.setOnClickListener(this);

        kontakt = findViewById(R.id.button4);
        kontakt.setOnClickListener(this);

        quitt = findViewById(R.id.exit);
        quitt.setOnClickListener(this);

        rezystancja = findViewById(R.id.button3);
        rezystancja.setOnClickListener(this);

        rezystancja1 = findViewById(R.id.button5);
        rezystancja1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId() ) {
            case R.id.przycisk_temperatura:
            Intent intent = new Intent(this, przeliczanietemp.class);
            startActivity(intent);
            break;

            case R.id.button2:
            Intent cos = new Intent(this, konwerter.class);
            startActivity(cos);
            break;

            case R.id.button3:
             Intent rezy = new Intent(this, ResistorActivity.class);
             startActivity(rezy);
             break;

            case R.id.button4:
            Intent kontakt = new Intent(this, kontakt.class);
            startActivity(kontakt);
            break;

            case R.id.button5:
                Intent rezy1 = new Intent(this, RezystancjaActivity.class);
                startActivity(rezy1);
                break;

            case R.id.exit:
                System.exit(0);
                break;

            default:
                break;

        }
    }

}
