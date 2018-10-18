package com.simarro.practica.cryptotareas;

import java.util.ArrayList;

public class CryptoDatos {

    static ArrayList<Criptomoneda> listaCriptomoneda=new ArrayList<>();

    static{
        listaCriptomoneda.add(new Criptomoneda("Bitcoin","SHA256",6300,R.drawable.coin));
        listaCriptomoneda.add(new Criptomoneda("Ethereum","Solidity",220,R.drawable.ethereum));
        listaCriptomoneda.add(new Criptomoneda("IOTA","Tangle DAG",0.56,R.drawable.iota));
        listaCriptomoneda.add(new Criptomoneda("PO.ET","Proof Of Existense",0.10,R.drawable.poet));
        listaCriptomoneda.add(new Criptomoneda("CARDANO","Solidity",0.09,R.drawable.cardanet));
    }

}
