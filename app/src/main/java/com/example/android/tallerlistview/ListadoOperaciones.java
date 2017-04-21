package com.example.android.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListadoOperaciones extends AppCompatActivity {
    private TableLayout tabla;
    private String aux;
    private ArrayList<Operacion> operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_operaciones);

        tabla=(TableLayout)findViewById(R.id.tbListado);
        operaciones=Datos.getOperaciones();

        for (int i=0; i<operaciones.size();i++){
            TableRow fila= new TableRow(this);
            TextView c1=new TextView(this);
            TextView c2=new TextView(this);
            TextView c3=new TextView(this);
            TextView c4=new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(operaciones.get(i).getOperacion());
            c3.setText(operaciones.get(i).getDatos());
            c4.setText(operaciones.get(i).getResultado()+"");

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);

        }

    }
}
