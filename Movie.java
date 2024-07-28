public class Movie {
    public String title;
    public String director;
    public String genre;
    public String timelen;
    public String date;

    public Movie (String title, String director, String genre, String timelen, String date) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.timelen = timelen;
        this.date = date;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getDirector () {
        return director;
    }

    public void setDirector (String director) {
        this.director = director;
    }

    public String getGenre () {
        return genre;
    }

    public void setGenre (String genre) {
        this.genre = genre;
    }

    public String getTimelen () {
        return timelen;
    }

    public void setTimelen (String timelen) {
        this.timelen = timelen;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }
}
