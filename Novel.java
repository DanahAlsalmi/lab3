import java.util.ArrayList;

public class Novel extends Book {
    private String genre;


    public Novel(String title, String auteur, String isbn, double price, int stock,int reviews ,String genre) {
        super(title, auteur, isbn, price, stock,reviews);
        this.genre = genre;
    }


    @Override
    public String getMediaType() {
        return getAverageRating() >= 4.5 ? "Bestselling Novel" : "Novel";
    }


    @Override
    public String toString() {
        return "Novel [Genre: " + genre + "] " + super.toString();

    }
}
