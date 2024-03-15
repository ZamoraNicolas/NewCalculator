package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sum;
    private Button res;
    private Button mult;
    private Button div;
    private TextView mensaje;
    private EditText num1;
    private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.mensaje);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        sum = findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionSuma(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        res = findViewById(R.id.res);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionResta(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        mult = findViewById(R.id.mult);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionMultiplicacion(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionDivision(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });
    }

    public double funcionSuma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double funcionResta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double funcionMultiplicacion(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double funcionDivision(double valor1, double valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            return Double.NaN;
        }
    }
}
