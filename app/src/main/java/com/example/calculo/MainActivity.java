package com.example.calculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txTitulo;
EditText totale,Etmemoria;
RadioButton rbi3,rbi5,rbi7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        txTitulo=findViewById(R.id.txTitulo);
        Etmemoria=findViewById(R.id.etmemoria);
        totale=findViewById(R.id.Totale);
        rbi3=findViewById(R.id.rbi3);
        rbi5=findViewById(R.id.rbi5);
        rbi7=findViewById(R.id.rbi7);
    }
    public void calcular(View view){
        String numero1=totale.getText().toString();
        if(rbi3.isChecked())
        {

            Float operacion= Float.parseFloat(numero1)*300000;
            operacion=operacion+Float.parseFloat(numero1)*100000;
            operacion=operacion+(operacion*10)/100;
            txTitulo.setText(String.valueOf(operacion));
        }
        if(rbi5.isChecked())
        {
            Float operacion= Float.parseFloat(numero1)*400000;
            operacion=operacion+Float.parseFloat(numero1)*100000;
            operacion=operacion+(operacion*10)/100;
            txTitulo.setText(String.valueOf(operacion));
        }
        if(rbi7.isChecked()){
            Float operacion= Float.parseFloat(numero1)*500000;
            operacion=operacion+Float.parseFloat(numero1)*100000;
            operacion=operacion+(operacion*10)/100;
            txTitulo.setText(String.valueOf(operacion));
        }
    }
}