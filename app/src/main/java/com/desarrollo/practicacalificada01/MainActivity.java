package com.desarrollo.practicacalificada01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView  text_igual,txt_1,txt_2;
    private Button button;
    private int y1 = 0, y2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        vista();
       /* et1 = (EditText)findViewById(R.id.id_texto);
        tv1 = (TextView)findViewById(R.id.txtResultado);
        et2 = (EditText)findViewById(R.id.texto_busqueda);
        tv2 = (TextView)findViewById(R.id.txtLetras);
        */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = et1.getText().toString();
                String texto2 = et2.getText().toString();
                if(texto1.isEmpty())
                { Toast.makeText(MainActivity.this, "Ingrese el primer texto", Toast.LENGTH_SHORT).show();
                }
                else if(texto2.isEmpty())
                { Toast.makeText(MainActivity.this, "Ingrese el segundo texto", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ver(texto1, texto2);
                }
            }
        });
        /*@Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //contador en tiempo real
            tv2.setText(String.valueOf("Numero de vocales es : "+et1.length()));
        }*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
    private void ver(String texto1, String texto2)
    {
        y1 = 0;y2= 0;
        String equals_value = texto1.equals(texto2) ? "son iguales " : "No son iguales";
        text_igual.setText(equals_value);
        Pattern vocales = Pattern.compile("[IiíUu]");
        Matcher frace1 = vocales.matcher(texto1);
        Matcher frace2 = vocales.matcher(texto2);
        while (frace1.find()) y1++;
        while (frace2.find()) y2++;
        txt_1.setText(String.valueOf(y1));
        txt_2.setText(String.valueOf(y2));

    }

    /*public void Visualizar(View view) {

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



    }*/
    private void vista()
    {


        button = findViewById(R.id.button);
        text_igual= findViewById(R.id.text_egual);
        et1 = findViewById(R.id.id_texto);
        et2 = findViewById(R.id.id_texto2);
        txt_1 = findViewById(R.id.txt_y);
        txt_2 = findViewById(R.id.txt_x);


    }


}
