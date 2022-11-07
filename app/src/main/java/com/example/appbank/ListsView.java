package com.example.appbank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListsView extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Facturne Interne","Emission d'un",
            "Paiment d'un","Paiment par carte",
            "Retrait d'especes",
    };

    String[] money ={
            "299,00","500,00",
            "1000,00","250,00",
            "140,00",
    };

    String[] date ={
            "02/01/2013", "02/02/2012",
            "22/11/2012", "23/05/2019",
            "11/02/2010",
    };

    Integer[] imgid={
            R.drawable.telephone_call,R.drawable.send,
            R.drawable.percent,R.drawable.visa,
            R.drawable.cash,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, money, date, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
