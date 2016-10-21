package net.blusoft.nmreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView menu = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adaptador = new ArrayAdapter(this,  R.layout.listview_style);

        String llista[] = getResources().getStringArray(R.array.menu1);
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
                intent = new Intent(MainActivity.this, BrowseManga.class);
                break;
            case 1:
                //My library
                //intent = new Intent(MainActivity.this, TelefonActivity.class);
                break;
            case 2:
                //Favorites
                //intent = new Intent(MainActivity.this, WebActivity.class);
                break;
            case 3:
                //history
                //intent = new Intent(MainActivity.this, MailActivity.class);
                break;
            case 4:
                //settings
                //intent = new Intent(MainActivity.this, MailActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
