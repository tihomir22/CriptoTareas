package com.simarro.practica.cryptotareas;

import java.util.ArrayList;

public class CryptoDatos {

    static ArrayList<Criptomoneda> listaCriptomoneda=new ArrayList<>();

    static{
        listaCriptomoneda.add(new Criptomoneda("Bitcoin","SHA256",6300,"https://coinmarketcap.com/currencies/bitcoin/",R.drawable.coin));
        listaCriptomoneda.add(new Criptomoneda("Ethereum","Solidity",220,"https://coinmarketcap.com/currencies/ethereum/",R.drawable.ethereum));
        listaCriptomoneda.add(new Criptomoneda("IOTA","Tangle DAG",0.56,"https://coinmarketcap.com/currencies/iota/",R.drawable.iota));
        listaCriptomoneda.add(new Criptomoneda("PO.ET","Proof Of Existense",0.10,"https://coinmarketcap.com/currencies/poet/",R.drawable.poet));
        listaCriptomoneda.add(new Criptomoneda("CARDANO","Solidity",0.09,"https://coinmarketcap.com/currencies/cardano/",R.drawable.cardanet));
    }

}
