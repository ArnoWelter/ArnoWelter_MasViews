package com.welter.arno.masviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = (EditText)findViewById(R.id.entrada);
        salida = (TextView)findViewById(R.id.salida);

    }

    public void sePulsa(View view){
        String entrada2 = entrada.getText().toString();
        if (entrada2.equals("")){
            Toast.makeText(getApplicationContext(),"Introduzca un numero antes de pulsar el boton rojo", Toast.LENGTH_SHORT).show();
        }else{
            salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString()) * 2.0));
        }
    }

    public void sePulsa0(View view){
        entrada.setText(entrada.getText() + (String)view.getTag());
    }


}
