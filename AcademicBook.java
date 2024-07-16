import java.util.ArrayList;

public class AcademicBook extends Book{


    private String subject;

    public AcademicBook(String title, String auteur, String isbn, double price, int stock,int reviews ,String subject) {
        super(title, auteur, isbn, price, stock,reviews);
        this.subject = subject;
    }


    @Override
    public String getMediaType() {
        return getAverageRating() >= 4.5 ? "Bestselling Academic Book" : "Academic Book";

    }


    @Override
    public String toString() {
        return "Academic Book [Subject: " + subject + "] " + super.toString();

    }
}
