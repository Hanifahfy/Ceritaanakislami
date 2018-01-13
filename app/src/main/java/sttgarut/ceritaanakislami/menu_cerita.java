package sttgarut.ceritaanakislami;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by user on 1/11/2018.
 */

public class menu_cerita extends AppCompatActivity {
    String[] listArray={"Kisah Nabi Daus AS","Kisah Nabi Yusuf dan Mukjizatnya","Kisah Nabi Musa dan Harun","Kisah Nabi Yaqub","Kisah Nabi Ibrahim dan Putranya","Kisah Nabi Yunus"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_cerita);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.activity_list_view, listArray);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent nabi_daud = new Intent(view.getContext(), nabi_daud.class);
                    startActivityForResult(nabi_daud, 0);
                }

        if (position==1) {
                    Intent nabi_yusuf = new Intent(view.getContext(), nabi_yusuf.class);
                    startActivityForResult(nabi_yusuf, 1);
                }
                if (position==2) {
                    Intent nabi_musa_dan_nabi_harun = new Intent(view.getContext(), nabi_musa_dan_nabi_harun.class);
                    startActivityForResult(nabi_musa_dan_nabi_harun, 2);
                }
                if (position==3) {
                    Intent nabi_yaqub = new Intent(view.getContext(), nabi_yaqub.class);
                    startActivityForResult(nabi_yaqub, 3);
                }
                if (position==4) {
                    Intent nabi_ibrahim = new Intent(view.getContext(), nabi_ibrahim.class);
                    startActivityForResult(nabi_ibrahim, 4);
                }
                if (position==5) {
                    Intent nabi_yunus = new Intent(view.getContext(), nabi_yunus.class);
                    startActivityForResult(nabi_yunus, 5);
                }
    }
});
    }
}
