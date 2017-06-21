package io.github.jlowery319.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText numberTextView = (EditText)findViewById(R.id.number);
        // convert String to Double
        Double dollars = Double.parseDouble(numberTextView.getText().toString());
        Double pounds = dollars * .75;

        Toast.makeText(this, "£" + String.format("%.2f", pounds), Toast.LENGTH_LONG).show();

        //Toast.makeText(this, "£" + String.format("%.2f", pounds.toString()), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
