package com.example.david.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Num;
    private TextView Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num = (EditText)findViewById(R.id.edtxt1);
        Res = (TextView)findViewById(R.id.edtxt2);
    }


    public void sumatoria(View view){
        String val  = Num.getText().toString();
        int n = Integer.parseInt(val);
        int suma = n*(n+1)/2;
        String resultado = "";
        resultado = "La suma de los primeros " + n + " numeros es: " + suma;

        Res.setText(resultado);

    }
}
