package com.vedant.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "SongsApp";
//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager layoutManager;

    List<Songs> SongsList = new ArrayList<Songs>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fillSongList();
        Log.d(TAG,"onCreate" + SongsList.toString());

        recyclerView = findViewById(R.id.lv_SongList);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
//      layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new RecyclerViewAdapter(SongsList, MainActivity.this);
        recyclerView.setAdapter(mAdapter);
    }



    private void fillSongList() {
        Songs s1 = new Songs(1, "Heathens", "Twenty One Pilots",  "https://upload.wikimedia.org/wikipedia/en/e/e0/Twentyonepilotsheathens.jpg", "https://www.youtube.com/watch?v=UprcpdwuwCg&list=PLekNfBXtDGkQZhls7isj2rOPiOeHCrbCY&index=1", "https://en.wikipedia.org/wiki/Heathens_(song)", "https://en.wikipedia.org/wiki/Twenty_One_Pilots");
        Songs s2 = new Songs(2, "Faded", "Alan Walker", "https://upload.wikimedia.org/wikipedia/en/thumb/d/da/Alan_Walker_-_Faded.png/220px-Alan_Walker_-_Faded.png", "https://www.youtube.com/watch?v=60ItHLz5WEA", "https://en.wikipedia.org/wiki/Faded_(Alan_Walker_song)", "");
        Songs s3 = new Songs(3, "Jeena Jeena", "Sachin-Jiga", "https://upload.wikimedia.org/wikipedia/en/thumb/2/22/Jeena_Jeena_%282015%29_-_Album_Cover.jpeg/220px-Jeena_Jeena_%282015%29_-_Album_Cover.jpeg",  "https://www.youtube.com/watch?v=zFdi834FiZ4", "https://en.wikipedia.org/wiki/Jeena_Jeena", "https://en.wikipedia.org/wiki/Sachin%E2%80%93Jigar" );
        Songs s4 = new Songs(4, "Capital Letters", "Hailee Steinfeld", "https://upload.wikimedia.org/wikipedia/en/thumb/5/54/Hailee_Steinfeld_and_BloodPop_Capital_Letters.jpg/220px-Hailee_Steinfeld_and_BloodPop_Capital_Letters.jpg", "https://www.youtube.com/watch?v=pj6k-EFxqAI", "https://en.wikipedia.org/wiki/Capital_Letters_(song)", "https://en.wikipedia.org/wiki/Hailee_Steinfeld");
        Songs s5 = new Songs(5, "Closer", "The Chainsmokers", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a5/Closer_%28featuring_Halsey%29_%28Official_Single_Cover%29_by_The_Chainsmokers.png/220px-Closer_%28featuring_Halsey%29_%28Official_Single_Cover%29_by_The_Chainsmokers.png","https://www.youtube.com/watch?v=PT2_F-1esPk", "https://en.wikipedia.org/wiki/Closer_(The_Chainsmokers_song)", "https://en.wikipedia.org/wiki/The_Chainsmokers");
        Songs s6 = new Songs(6, "Memories", "Maroon 5", "https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Maroon_5_-_Memories.png/220px-Maroon_5_-_Memories.png" ,"https://www.youtube.com/watch?v=SlPhMPnQ58k", "https://en.wikipedia.org/wiki/Memories_(Maroon_5_song)", "https://en.wikipedia.org/wiki/Maroon_5");
        Songs s7 = new Songs(7, "Money","Berry Gordy", "https://en.wikipedia.org/wiki/File:MoneyBStrong_single.jpg", "https://www.youtube.com/watch?v=H-O8A1pXjyE", "https://en.wikipedia.org/wiki/Money_(That%27s_What_I_Want)", "https://en.wikipedia.org/wiki/Berry_Gordy");
        Songs s8 = new Songs(8, "All the Stars", "Kendrick Lamar", "https://en.wikipedia.org/wiki/File:All_the_Stars_Kendrick_Lamar_SZA.jpg", "https://www.youtube.com/watch?v=JQbjS0_ZfJ0", "https://en.wikipedia.org/wiki/All_the_Stars", "https://en.wikipedia.org/wiki/Kendrick_Lamar");
        Songs s9 = new Songs(9,"In the Name of Love","Bebe Rexha","https://en.wikipedia.org/wiki/File:In_the_Name_of_Love_Cover_Art_by_Bebe_Rexha_and_Martin_Garrix.jpeg", "https://www.youtube.com/watch?v=PT2_F-1esPk", "https://en.wikipedia.org/wiki/In_the_Name_of_Love_(Martin_Garrix_and_Bebe_Rexha_son", "https://en.wikipedia.org/wiki/Bebe_Rexha");
        Songs s10 = new Songs(10, "Ae Dil Hai Mushkil","Pritam,", "https://en.wikipedia.org/wiki/File:ADHM_Soundtrack_Cover.jpg", "https://www.youtube.com/watch?v=vUCM_0evdQY", "https://en.wikipedia.org/wiki/Ae_Dil_Hai_Mushkil_(soundtrack)", "https://en.wikipedia.org/wiki/Pritam");
        Songs s11 = new Songs(11, "Heathens", "Twenty One Pilots",  "https://upload.wikimedia.org/wikipedia/en/e/e0/Twentyonepilotsheathens.jpg", "https://www.youtube.com/watch?v=UprcpdwuwCg&list=PLekNfBXtDGkQZhls7isj2rOPiOeHCrbCY&index=1", "https://en.wikipedia.org/wiki/Heathens_(song)", "https://en.wikipedia.org/wiki/Twenty_One_Pilots");
        Songs s12 = new Songs(12, "Faded", "Alan Walker", "https://upload.wikimedia.org/wikipedia/en/thumb/d/da/Alan_Walker_-_Faded.png/220px-Alan_Walker_-_Faded.png", "https://www.youtube.com/watch?v=60ItHLz5WEA", "https://en.wikipedia.org/wiki/Faded_(Alan_Walker_song)", "");
        Songs s13 = new Songs(13, "Jeena Jeena", "Sachin-Jiga", "https://upload.wikimedia.org/wikipedia/en/thumb/2/22/Jeena_Jeena_%282015%29_-_Album_Cover.jpeg/220px-Jeena_Jeena_%282015%29_-_Album_Cover.jpeg",  "https://www.youtube.com/watch?v=zFdi834FiZ4", "https://en.wikipedia.org/wiki/Jeena_Jeena", "https://en.wikipedia.org/wiki/Sachin%E2%80%93Jigar" );
        Songs s14 = new Songs(14, "Capital Letters", "Hailee Steinfeld", "https://upload.wikimedia.org/wikipedia/en/thumb/5/54/Hailee_Steinfeld_and_BloodPop_Capital_Letters.jpg/220px-Hailee_Steinfeld_and_BloodPop_Capital_Letters.jpg", "https://www.youtube.com/watch?v=pj6k-EFxqAI", "https://en.wikipedia.org/wiki/Capital_Letters_(song)", "https://en.wikipedia.org/wiki/Hailee_Steinfeld");
        Songs s15 = new Songs(15, "Closer", "The Chainsmokers", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a5/Closer_%28featuring_Halsey%29_%28Official_Single_Cover%29_by_The_Chainsmokers.png/220px-Closer_%28featuring_Halsey%29_%28Official_Single_Cover%29_by_The_Chainsmokers.png","https://www.youtube.com/watch?v=PT2_F-1esPk", "https://en.wikipedia.org/wiki/Closer_(The_Chainsmokers_song)", "https://en.wikipedia.org/wiki/The_Chainsmokers");
        Songs s16 = new Songs(16, "Memories", "Maroon 5", "https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Maroon_5_-_Memories.png/220px-Maroon_5_-_Memories.png" ,"https://www.youtube.com/watch?v=SlPhMPnQ58k", "https://en.wikipedia.org/wiki/Memories_(Maroon_5_song)", "https://en.wikipedia.org/wiki/Maroon_5");
        Songs s17 = new Songs(17, "Money","Berry Gordy", "https://en.wikipedia.org/wiki/File:MoneyBStrong_single.jpg", "https://www.youtube.com/watch?v=H-O8A1pXjyE", "https://en.wikipedia.org/wiki/Money_(That%27s_What_I_Want)", "https://en.wikipedia.org/wiki/Berry_Gordy");
        Songs s18 = new Songs(18, "All the Stars", "Kendrick Lamar", "https://en.wikipedia.org/wiki/File:All_the_Stars_Kendrick_Lamar_SZA.jpg", "https://www.youtube.com/watch?v=JQbjS0_ZfJ0", "https://en.wikipedia.org/wiki/All_the_Stars", "https://en.wikipedia.org/wiki/Kendrick_Lamar");
        Songs s19 = new Songs(19,"In the Name of Love","Bebe Rexha","https://en.wikipedia.org/wiki/File:In_the_Name_of_Love_Cover_Art_by_Bebe_Rexha_and_Martin_Garrix.jpeg", "https://www.youtube.com/watch?v=PT2_F-1esPk", "https://en.wikipedia.org/wiki/In_the_Name_of_Love_(Martin_Garrix_and_Bebe_Rexha_son", "https://en.wikipedia.org/wiki/Bebe_Rexha");
        Songs s20 = new Songs(20, "Ae Dil Hai Mushkil","Pritam,", "https://en.wikipedia.org/wiki/File:ADHM_Soundtrack_Cover.jpg", "https://www.youtube.com/watch?v=vUCM_0evdQY", "https://en.wikipedia.org/wiki/Ae_Dil_Hai_Mushkil_(soundtrack)", "https://en.wikipedia.org/wiki/Pritam");
        SongsList.addAll(Arrays.asList(new Songs [] {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20}));
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.grid:
                System.out.println( "grid Selected ");
                layoutManager = new GridLayoutManager(this,2);
                recyclerView.setLayoutManager(layoutManager);
                mAdapter = new RecyclerViewAdapter(SongsList, MainActivity.this);
                recyclerView.setAdapter(mAdapter);
                Toast.makeText(getApplicationContext(),"Grid view", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.list:
                System.out.println( "List Selected ");
                layoutManager = new LinearLayoutManager(this);
                recyclerView.setLayoutManager(layoutManager);
                mAdapter = new RecyclerViewAdapter(SongsList, MainActivity.this);
                recyclerView.setAdapter(mAdapter);
                Toast.makeText(getApplicationContext(),"List view", Toast.LENGTH_SHORT).show();
                return true;
            default:
                layoutManager = new LinearLayoutManager(this);
                return false;
        }
    }
}