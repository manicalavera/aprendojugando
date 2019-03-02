package com.example.aprendojugando;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    SoundPool sp;
    int sonido_de_reproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //se encarga de cargar el sonido del botón para después reproduciorlo
        sp= new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido_de_reproduccion= sp.load(this, R.raw.selec, 1);

        //Poner el ícono al lado de action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

    }

    public void Niveles (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

        //linkea al menu niveles

        Intent siguiente = new Intent(this, MenuNiveles.class);
        startActivity(siguiente);

    }
    public void Letras (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

        Intent siguiente = new Intent(this, MenuLetras.class);
        startActivity(siguiente);



    }
    public void Acercade (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
}
