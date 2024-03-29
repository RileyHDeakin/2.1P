package com.example.a21p;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("inch");
        arrayList.add("foot");
        arrayList.add("yard");
        arrayList.add("mile");
        arrayList.add("cm");
        arrayList.add("km");

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        Spinner spinner2 = findViewById(R.id.spinner2);
        spinner2.setAdapter(arrayAdapter);


    }

    public double inchToCm(int value) {
        return value * 2.54;
    }

    public double footTocm(int value) {
        return value * 30.48;
    }

    public double yardTocm(int value) {
        return value * 91.44;
    }

    public double mileToKm(int value) {
        return value * 1.60934;
    }
    @SuppressLint("ResourceType")
    public void submitbuttonHandler(View view) {
        EditText origionalTextValue = (EditText) findViewById(R.id.editTextText);
        String stringOrigionalValue = origionalTextValue.getText().toString();

         Spinner origUnitSpinner = (android.widget.Spinner)findViewById(R.id.spinner1);
         String origUnit = origUnitSpinner.getSelectedItem().toString();

         Spinner newUnitSpinner = (android.widget.Spinner)findViewById(R.id.spinner2);
         String newUnit = newUnitSpinner.getSelectedItem().toString();

         double newValue = Double.parseDouble(stringOrigionalValue);

        TextView boi = (TextView) findViewById(R.id.textView3);

        if (origUnit.equals("inch")) {
            switch (newUnit) {
                case "cm":
                    boi.setText(String.valueOf(newValue * 2.54));
                    break;
                case "foot":
                    boi.setText(String.valueOf(newValue * 0.0833333));
                    break;
                case "km":
                    boi.setText(String.valueOf(newValue * 2.54e-5));
                    break;
                case "yard":
                    boi.setText(String.valueOf(newValue * 0.0277778));
                    break;
                case "mile":
                    boi.setText(String.valueOf(newValue * 1.5782840909e-5));
                    break;
            }
        }
            if (origUnit.equals("foot")) {
                switch (newUnit) {
                    case "cm":
                        boi.setText(String.valueOf(newValue * 30.48));
                        break;
                    case "inch":
                        boi.setText(String.valueOf(newValue * 12));
                        break;
                    case "km":
                        boi.setText(String.valueOf(newValue * 0.0003048));
                        break;
                    case "yard":
                        boi.setText(String.valueOf(newValue * 0.333333));
                        break;
                    case "mile":
                        boi.setText(String.valueOf(newValue * 0.000189394));
                        break;
                }
            }
        if (origUnit.equals("yard")) {
            switch (newUnit) {
                case "cm":
                    boi.setText(String.valueOf(newValue * 91.44));
                    break;
                case "inch":
                    boi.setText(String.valueOf(newValue * 36));
                    break;
                case "km":
                    boi.setText(String.valueOf(newValue * 0.0009144));
                    break;
                case "foot":
                    boi.setText(String.valueOf(newValue * 3));
                    break;
                case "mile":
                    boi.setText(String.valueOf(newValue * 0.000568182));
                    break;
            }
        }
        if (origUnit.equals("mile")) {
            switch (newUnit) {
                case "cm":
                    boi.setText(String.valueOf(newValue * 160934));
                    break;
                case "inch":
                    boi.setText(String.valueOf(newValue * 63360));
                    break;
                case "km":
                    boi.setText(String.valueOf(newValue * 1.60934));
                    break;
                case "foot":
                    boi.setText(String.valueOf(newValue * 5280));
                    break;
                case "yard":
                    boi.setText(String.valueOf(newValue * 1760));
                    break;
            }
        }

        if (origUnit.equals("cm")) {
            switch (newUnit) {
                case "mile":
                    boi.setText(String.valueOf(newValue * 6.2137e-6));
                    break;
                case "inch":
                    boi.setText(String.valueOf(newValue * 0.393701));
                    break;
                case "km":
                    boi.setText(String.valueOf(newValue * 1e-5));
                    break;
                case "foot":
                    boi.setText(String.valueOf(newValue * 0.0328084));
                    break;
                case "yard":
                    boi.setText(String.valueOf(newValue * 0.0109361));
                    break;
            }
        }
        if (origUnit.equals("km")) {
            switch (newUnit) {
                case "mile":
                    boi.setText(String.valueOf(newValue * 0.621371));
                    break;
                case "inch":
                    boi.setText(String.valueOf(newValue * 39370.1));
                    break;
                case "cm":
                    boi.setText(String.valueOf(newValue * 100000));
                    break;
                case "foot":
                    boi.setText(String.valueOf(newValue * 3280.84));
                    break;
                case "yard":
                    boi.setText(String.valueOf(newValue * 1093.61));
                    break;
            }
        }


        }
    }