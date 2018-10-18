package com.simarro.practica.cryptotareas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MiArrayAdapter<T> extends ArrayAdapter<T> {

    public MiArrayAdapter(Context context, ArrayList<T> resource) {
        super(context,0,resource);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        //obteniendo una instancia del inflater
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Salvando la referencia de la fila
        View listaItemView=convertView;
        //Comprobando si el view no existe
        if(null==convertView){
            listaItemView=inflater.inflate(
                    R.layout.diseno_item_menu,parent,false
            );

        }
        //Obteniendo isntancias de los text views

        TextView titulo=listaItemView.findViewById(R.id.text1);
        TextView protocolo=listaItemView.findViewById(R.id.text2);
        TextView precio=listaItemView.findViewById(R.id.text3);
        ImageView logo=listaItemView.findViewById(R.id.foto);

        //Obteniendo instancia de la tarea en posicion actual
        Criptomoneda item=(Criptomoneda) getItem(position);



        titulo.setText(item.getNombre().trim());
        protocolo.setText(item.getProtocolo().trim());
        precio.setText(item.getPrecioAct()+"".trim());
        logo.setImageResource(item.getImagenView());

        return listaItemView;
    }
}
