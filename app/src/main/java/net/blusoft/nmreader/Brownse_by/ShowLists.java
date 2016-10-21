package net.blusoft.nmreader.Brownse_by;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import net.blusoft.nmreader.R;

public class ShowLists extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_manga);
        String origen= getIntent().getStringExtra("origen");
        String accion=getIntent().getStringExtra("accion");
        ListView menu = (ListView) findViewById(R.id.listview2);
        ArrayAdapter<String> adaptador = new ArrayAdapter(this,  R.layout.listview_style);
        String llista[] = getResources().getStringArray(R.array.llistaMangas);
        adaptador.addAll(llista);
        menu.setAdapter(adaptador);
        menu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        int identificador=position+1;
        Toast.makeText(this, "Has polsat per veure el manga " + identificador, Toast.LENGTH_SHORT).show();
    }
}
