package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String ContactList[] = {
            "Tryndamere",
            "Vladimir",
            "Yone",
            "Aatrox",
            "Lucian",
            "Akali",
            "Garen",
            "Master Yi",
            "Yasuo",
            "Ziggs",
            "Syndra",
            "Orinna",
            "Miss Fortune",
            "Shaco",
            "Malzahar",
            "Leona",
            "Pyke",
            "Reksai",
            "Aphelios",
            "Jhin",
            "Blitzcrank",
            "Xayah",
            "Rakan"


    };

    int contactss[] = {

            R.drawable.tryndamere,
            R.drawable.vladimir,
            R.drawable.yone,
            R.drawable.aatrox,
            R.drawable.lucian,
            R.drawable.akali,
            R.drawable.garen,
            R.drawable.masteryi,
            R.drawable.yasuo,
            R.drawable.ziggs,
            R.drawable.syndra,
            R.drawable.orianna,
            R.drawable.mf,
            R.drawable.shaco,
            R.drawable.malzahar,
            R.drawable.leona,
            R.drawable.pyke,
            R.drawable.reksai,
            R.drawable.aphelios,
            R.drawable.jhin,
            R.drawable.blitzcrank,
            R.drawable.xayah,
            R.drawable.rakan


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView data_list = (ListView)findViewById(R.id.DataList);
        customadapter base = new customadapter(ContactList, contactss,this);

        data_list.setAdapter(base);

    }
}
