package com.clara.ejerciciolayout_extra2botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText gradosAConvertir;
    private TextView resultado;
    private RadioButton rBcelsius;
    private RadioButton rBfahrenheit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void conversion(View v) {

        resultado = (TextView) findViewById(R.id.tVresultado);
        gradosAConvertir = (EditText) findViewById(R.id.editText);
        rBcelsius = (RadioButton) findViewById(R.id.rBcelsius);
        rBfahrenheit = (RadioButton) findViewById(R.id.rBfahrenheit);

        //cogemos el valor del EditText y lo convertimos a double porque el resultado será decimal
        double grados = Double.parseDouble(String.valueOf(gradosAConvertir.getText()));

        //comprobamos que RadioButton está seleccionado
        if (rBcelsius.isChecked()) {
            resultado.setText(f2c(grados) + " ºC");
        }
        else {
            resultado.setText(c2f(grados) + " ºF");
        }
    }

    //Método para convertir ºC en ºF
    private double c2f(double c) {
        return (c * 9) / 5 + 32;
    }

    //Método para convertir ºF en ºC
    private double f2c(double f) {
        return (f - 32) * 5 / 9;
    }
}
