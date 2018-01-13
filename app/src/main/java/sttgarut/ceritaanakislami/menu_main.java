package sttgarut.ceritaanakislami;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by user on 1/11/2018.
 */

public class menu_main extends AppCompatActivity {
    Button cerita, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        cerita = (Button) findViewById(R.id.button);
        about = (Button) findViewById(R.id.button1);

        cerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu_main.this, menu_cerita.class);
                startActivity(i);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu_main.this, tentang.class);
                startActivity(i);
            }
        });
    }
}