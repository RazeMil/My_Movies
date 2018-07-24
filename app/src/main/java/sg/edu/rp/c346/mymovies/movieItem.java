package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

public class movieItem {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;
    private float rating;

    public movieItem(String title, String year, String rated, String genre, Calendar watched_on, String in_theatre, String description,float rating) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }
    public String getWatched_on_String(){
        return watched_on.get(Calendar.DAY_OF_MONTH)+"/"+(watched_on.get(Calendar.MONTH)+1+"/"+(watched_on.get(Calendar.YEAR)));
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
}

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "movieItem{" +
                "watched_on=" + watched_on +
                '}';
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}

