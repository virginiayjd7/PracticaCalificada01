package com.desarrollo.practicacalificada01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.id_texto);
        tv1 = (TextView)findViewById(R.id.txtResultado);
        et2 = (EditText)findViewById(R.id.texto_busqueda);
        tv2 = (TextView)findViewById(R.id.txtLetras);
        tv3 = (TextView)findViewById(R.id.txtPalindromo);

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //contador en tiempo real
                tv2.setText(String.valueOf("Numero de vocales es : "+et1.length()));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void Visualizar(View view) {

        String texto1 = et1.getText().toString();
        StringTokenizer a = new StringTokenizer(texto1);
        int npalabras = a.countTokens();
        String Resultado = String.valueOf(npalabras);
        String palabrab="";
        int cont=0;
        palabrab = et2.getText().toString();
        while(a.hasMoreTokens()){
            if(!a.nextElement().equals(palabrab)){

            }else{
                cont++;
            }
        }

        tv1.setText("Numero de vocales en el texto es: "+ Resultado + "\n"
                +"la frace: "+palabrab+" se Repite: "+cont+" veces");



    }




}
