package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /** Create a list of songs*/
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("G-Eazy & Halsey", "Him & I"));
        songs.add(new Song("NF", "Let You Down"));
        songs.add(new Song("New Rules", "New Rules"));
        songs.add(new Song("Ed Sheeran", "Perfect"));
        songs.add(new Song("Zedd, Maren Morris & Grey", "The Middle"));
        songs.add(new Song("Bebe Rexha & Florida Georgia Line", "Meant To Be"));
        songs.add(new Song("MAX Featuring gnash", "Lights Down Low"));
        songs.add(new Song("Camila Cabello", "Never Be The Same"));
        songs.add(new Song("Selena Gomez X Marshmello", "Wolves"));
        songs.add(new Song("The Weeknd & Kendrick Lamar", "Pray For Me"));
        songs.add(new Song("Drake", "God's Plan"));
        songs.add(new Song("Camila Cabello Featuring Young Thug", "Havana"));
        songs.add(new Song("Halsey", "Bad At Love"));

        /**Create a SongAdapter; create layouts for each item in the list.*/
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_pop);

        /** Find the ListView object in the song_list.xml layout file.*/
        ListView listView = (ListView) findViewById(R.id.list);

        /**Attach the SongAdapter; ListView will display list items for each song in the list of songs */
        listView.setAdapter(adapter);
    }
}


