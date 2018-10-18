package com.simarro.practica.cryptotareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView lista;
    MiArrayAdapter<Criptomoneda> listaMonedas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.lista);

        listaMonedas=new MiArrayAdapter<Criptomoneda>(this,CryptoDatos.listaCriptomoneda);
        lista.setAdapter(listaMonedas);


        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Criptomoneda monedaActual=(Criptomoneda)listaMonedas.getItem(position);
        String mensaje="Elegiste la criptomoneda "+monedaActual.getNombre()+" - "+monedaActual.getProtocolo();
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}
