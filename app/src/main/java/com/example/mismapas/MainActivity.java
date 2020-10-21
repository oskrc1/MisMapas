package com.example.mismapas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);
        View view = getSupportActionBar().getCustomView();
        TextView name = view.findViewById(R.id.name);

    }
    public void mapaBiblioteca(View v){
        Intent a = new Intent(this, MapsActivityBiblioteca.class);
        startActivity(a);
    }

    public void mapaParqueAguas(View v){
        Intent b = new Intent(this, MapsActivityParqueAguas.class);
        startActivity(b);
    }

    public void mapaParroquiaFunza(View v){
        Intent c = new Intent(this, MapsActivityParroquiaFunza.class);
        startActivity(c);
    }

    public void mapaParroquiaMosquera(View v){
        Intent d = new Intent(this, MapsActivityParroquiaMosquera.class);
        startActivity(d);
    }
}