package com.example.quinto_programa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    private EditText n1, n2;
    private TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.numero1);
        n2 = (EditText)findViewById(R.id.numero2);
        resp = (TextView)findViewById(R.id.r);
        sp = (Spinner)findViewById(R.id.spiner);
        String []opc={"sumar","restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opc);
        sp.setAdapter(adapter);
    }
    public void operar (View view){
        String v=n1.getText().toString();
        String v1=n2.getText().toString();
        int nr1=Integer.parseInt(v);
        int nr2=Integer.parseInt(v1);
        String selec= sp.getSelectedItem().toString();
        String resultado = " ";
        if(selec.equals("sumar")){
            int suma=nr1+nr2;
            resultado ="la suma es "+suma;
            resp.setText(resultado);
        }else{
            if(selec.equals("restar")){
                int resta=nr1-nr2;
                resultado="la resta es"+resta;
                resp.setText(resultado);
            }else{
                if(selec.equals("multiplicar")){
                    int m=nr1*nr2;
                    resultado="la multiplicacion es "+m;
                    resp.setText(resultado);

                }else{
                    if (selec.equals("dividir")){
                        int d=nr1/nr2;
                        resultado="la divicion es "+d;
                        resp.setText(resultado);
                    }
                }
            }
        }
    }
}