package com.example.pracainzynierska;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class konwerter extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kon);


        final Spinner spinner = findViewById(R.id.Spinner1);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.jednostki, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner2 = findViewById(R.id.Spinner2);
        final  ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.jednostki, android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

                Button baton = findViewById(R.id.button);
                baton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText pole = findViewById(R.id.pole);
                        TextView widok = findViewById(R.id.textView3);
                        Float str = Float.valueOf(pole.getText().toString());

                        String original = (String) spinner.getSelectedItem();
                        String original2 = (String) spinner2.getSelectedItem();


                        switch (original) {
                            case "Milimetry":
                            {
                                switch (original2) {
                                    case "Milimetry":
                                        String sum = String.format("%.0f", str );
                                        widok.setText(sum);
                                        break;
                                    case "Centymetr":
                                        String sum1 = String.format("%.2f", str /10 );
                                        widok.setText(sum1);
                                        break;
                                    case "Decymetr":
                                        String sum2 = String.format("%.2f", str/100 );
                                        widok.setText(sum2);
                                        break;
                                    case "Metr":
                                        String sum3 = String.format("%.2f", str/1000 );
                                        widok.setText(sum3);
                                        break;
                                    case "Kilometr":
                                        String sum4 = String.format("%.6f", str/1000000 );
                                        widok.setText(sum4);
                                        break;
                                }
                                break;
                            }

                            case "Centymetr":
                                {
                                    switch (original2) {
                                        case "Milimetry":
                                            String sum = String.format("2f", str * 10);
                                            widok.setText(sum);
                                            break;
                                        case "Centymetr":
                                            String sum1 = String.format("%.0f", str  );
                                            widok.setText(sum1);
                                            break;
                                        case "Decymetr":
                                            String sum2 = String.format("%.2f", str/10 );
                                            widok.setText(sum2);
                                            break;
                                        case "Metr":
                                            String sum3 = String.format("%.2f", str/100 );
                                            widok.setText(sum3);
                                            break;
                                        case "Kilometr":
                                            String sum4 = String.format("%.6f", str/100000 );
                                            widok.setText(sum4);
                                            break;
                                    }
                                    break;
                                }
                            case "Decymetr":
                            {
                                switch (original2) {
                                    case "Milimetry":
                                        String sum = String.format("%.2f", str * 100);
                                        widok.setText(sum);
                                        break;
                                    case "Centymetr":
                                        String sum1 = String.format("%.3f", str *10 );
                                        widok.setText(sum1);
                                        break;
                                    case "Decymetr":
                                        String sum2 = String.format("%.0f", str );
                                        widok.setText(sum2);
                                        break;
                                    case "Metr":
                                        String sum3 = String.format("%.3f", str/10 );
                                        widok.setText(sum3);
                                        break;
                                    case "Kilometr":
                                        String sum4 = String.format("%.6f", str/10000 );
                                        widok.setText(sum4);
                                        break;
                                }
                                break;
                            }
                            case "Metr":
                            {
                                switch (original2) {
                                    case "Milimetry":
                                        String sum = String.format("%.3f", str * 100);
                                        widok.setText(sum);
                                        break;
                                    case "Centymetr":
                                        String sum1 = String.format("%.3f", str *10 );
                                        widok.setText(sum1);
                                        break;
                                    case "Decymetr":
                                        String sum2 = String.format("%.3f", str *10 );
                                        widok.setText(sum2);
                                        break;
                                    case "Metr":
                                        String sum3 = String.format("%.0f", str );
                                        widok.setText(sum3);
                                        break;
                                    case "Kilometr":
                                        String sum4 = String.format("%.6f", str/1000 );
                                        widok.setText(sum4);
                                        break;
                                }
                                break;
                            }
                            case "Kilometr":
                            {
                                switch (original2) {
                                    case "Milimetry":
                                        String sum = String.format("%.3f", str * 100000);
                                        widok.setText(sum);
                                        break;
                                    case "Centymetr":
                                        String sum1 = String.format("%.3f", str *10000 );
                                        widok.setText(sum1);
                                        break;
                                    case "Decymetr":
                                        String sum2 = String.format("%.3f", str *10000 );
                                        widok.setText(sum2);
                                        break;
                                    case "Metr":
                                        String sum3 = String.format("%.3f", str *1000 );
                                        widok.setText(sum3);
                                        break;
                                    case "Kilometr":
                                        String sum4 = String.format("%.0f", str );
                                        widok.setText(sum4);
                                        break;
                                }
                                break;
                            }
                        }

                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}