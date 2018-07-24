package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RatingBar;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovieList;
    ArrayList<movieItem> almovieList;
    CustomAdapter caMovieList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovieList = findViewById(R.id.listViewMovie);
        almovieList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2014,10,15);

        Calendar date2= Calendar.getInstance();
        date2.set(2015,4,15);



        movieItem movie1= new movieItem("The Avengers","2012", "pg13", "Action | Sci-Fi", date1, "Golden Village - Bishan",
                "Nick fury of S.H.I.E.L.D assembles a team of superheroes to save the planet from Loki and his army.",4f);

        movieItem movie2= new movieItem("Planes", "2013", "pg", "Animation | Comedy", date2, "Cathay - AMK Hub",
                "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.",2f);

        almovieList.add(movie1);
        almovieList.add(movie2);

        caMovieList = new CustomAdapter(this,R.layout.movie_item,almovieList);

        lvMovieList.setAdapter(caMovieList);

        lvMovieList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), MovieDetailsActivity.class);
                movieItem currentMovie = almovieList.get(position);

                intent.putExtra("title", currentMovie.getTitle());
                intent.putExtra("year", currentMovie.getYear());
                intent.putExtra("rated", currentMovie.getRated());
                intent.putExtra("genre", currentMovie.getGenre());
                intent.putExtra("watchDate", currentMovie.getWatched_on_String());
                intent.putExtra("theatre", currentMovie.getIn_theatre());
                intent.putExtra("desc", currentMovie.getDescription());
                intent.putExtra("rating",currentMovie.getRating());
                startActivity(intent);
            }
        });
    }
}
