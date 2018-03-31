package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LatinoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /** Create a list of songs*/
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Luis Fonsi & Daddy Yankee Featuring Justin Bieber", "Despacito"));
        songs.add(new Song("Daddy Yankee", "Dura"));
        songs.add(new Song("Ozuna & Romeo Santos", "El Farsante"));
        songs.add(new Song("Nicky Jam x J Balvin", "X"));
        songs.add(new Song("J Balvin & Willy William Featuring Beyonce", "Mi Gente"));
        songs.add(new Song("Luis Fonsi & Demi Lovato", "Echame La Culpa"));
        songs.add(new Song("Ozuna x Cardi B", "La Modelo"));
        songs.add(new Song("Maluma X Nego do Borel", "Corazon"));
        songs.add(new Song("Reik Featuring Ozuna & Wisin", "Me Niego"));
        songs.add(new Song("DJ Kass", "Scooby Doo Pa Pa"));
        songs.add(new Song("Enrique Iglesias Featuring Bad Bunny", "El Bano"));
        songs.add(new Song("J Balvin x Jeon x Anitta", "Machika"));
        songs.add(new Song("Romeo Santos Featuring Ozuna", "Sobredosis"));

        /**Create a SongAdapter; create layouts for each item in the list.*/
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_latino);

        /** Find the ListView object in the song_list.xml layout file.*/
        ListView listView = (ListView) findViewById(R.id.list);

        /**Attach the SongAdapter; ListView will display list items for each song in the list of songs */
        listView.setAdapter(adapter);

    }
}

