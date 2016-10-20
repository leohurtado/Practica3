package edu.tecii.android.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNum, txtHoras, txtMin, txtSeg, txtmilSeg;
    Button btnConvert;
    Double num, hor, min, seg, milseg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHoras = (EditText)findViewById(R.id.txtHoras);
        txtMin = (EditText)findViewById(R.id.txtMin);
        txtNum = (EditText)findViewById(R.id.txtNum);
        txtSeg = (EditText)findViewById(R.id.txtSeg);
        txtmilSeg = (EditText)findViewById(R.id.txtmilSeg);
        btnConvert = (Button)findViewById(R.id.btnConvert);
    }
    public void Convertir(View v){
        num = Double.parseDouble(txtNum.getText().toString());
        double aux,aux1,aux2,aux3,aux4;
        aux = num%60;
        hor = (num-aux)/60;
        aux1 = aux%1;
        min = aux-aux1;
        aux2 = aux1*60;
        aux3 = aux2%1;
        seg = aux2-aux3;
        aux4 = aux3*1000;
        milseg = aux4;
        txtHoras.setText(hor+"");
        txtMin.setText(min+"");
        txtSeg.setText(seg+"");
        txtmilSeg.setText(milseg+"");
    }
}
