/*
 * Copyright 2016 Roger G. Coscojuela aka Diddi / Wewannado
 */

package net.blusoft.nmreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import net.blusoft.nmreader.Brownse_by.BrowseByActivity;

public class BrowseMangaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_manga);
        ListView menu = (ListView) findViewById(R.id.listview2);
        ArrayAdapter<String> adaptador = new ArrayAdapter(this,  R.layout.listview_style);
        String llista[] = getResources().getStringArray(R.array.menuOrigens);
        adaptador.addAll(llista);
        menu.setAdapter(adaptador);
        menu.setOnItemClickListener(this);
        }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(BrowseMangaActivity.this, BrowseByActivity.class);
                intent.putExtra("origen", "MangaHere");
                break;
            case 1:
                intent = new Intent(BrowseMangaActivity.this, BrowseByActivity.class);
                intent.putExtra("origen", "Batoto");
                break;
             }
        if (intent != null) {
            startActivity(intent);
        }
    }
    }
