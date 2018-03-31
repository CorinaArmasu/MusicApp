package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DiscoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /** Create a list of songs*/
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Olivia Holt", "Generous"));
        songs.add(new Song("Pink", "Beautiful Trauma"));
        songs.add(new Song("Skylar Stecker", "Blame"));
        songs.add(new Song("Ralphi Rosario Featuring Donna Blakely", "Cold"));
        songs.add(new Song("Demi Lovato", "Tell Me You Love Me"));
        songs.add(new Song("Bruno Mars & Cardi B", "Finesse"));
        songs.add(new Song("Tony Moran Featuring Kimberly Davis", "You're Good For Me"));
        songs.add(new Song("Joe Bermudez Featuring Louise Carver", "Crazy Enough"));
        songs.add(new Song("Keala Settle & The Greatest Showman Ensemble", "This Is Me"));
        songs.add(new Song("Rita Ora", "Anywhere"));
        songs.add(new Song("Alan Walker, Noah Cyrus & Digital Farm Animals", "All Falls Down"));
        songs.add(new Song("Rihanna Featuring SZA", "Consideration"));
        songs.add(new Song("Crystal Waters, Sted-E & Hybrid Heights", "I Am House"));

        /**Create a SongAdapter; create layouts for each item in the list.*/
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_disco);

        /** Find the ListView object in the song_list.xml layout file.*/
        ListView listView = (ListView) findViewById(R.id.list);

        /**Attach the SongAdapter; ListView will display list items for each song in the list of songs */
        listView.setAdapter(adapter);

    }
}
