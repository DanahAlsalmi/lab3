import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{

    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int i) {
        super(title, auteur, ISBN, price);
    }

    public Movie(String artist) {
        super(artist);
    }


    public void watch(User user) {
        user.getPurchasedMediaList().add(this);
        System.out.println(user.getUser_name() + " watched " + getTitle());
    }

public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
    List<Movie> recommendations = new ArrayList<>();
    for (Movie movie : movieCatalog) {
        if (movie.getAuteur().equals(getAuteur())) {
            recommendations.add(movie);
            System.out.println("- " + movie.getTitle());

        }
    }
    return recommendations;
}

    public String getMediaType() {
        return duration >= 120 ? "Long Movie" : "Movie";

    }


    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " minutes";
    }
}
