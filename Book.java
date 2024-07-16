import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<Integer> reviews;


    public Book(String title, String auteur, String ISBN, double price, int stock, int reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
        addReview(reviews);

    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Integer> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Integer> reviews) {
        this.reviews = reviews;
    }

    public void addReview(int review){
        reviews.add(review);
    }

    public double getAverageRating(){
        if (reviews.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int review : reviews) {
            sum += review;
        }

        return (double) sum / reviews.size();
    }

    public void purchase(User user){
        if (stock>0){
            user.getPurchasedMediaList().add(this);
            stock--;
            System.out.println("Book purchased: " + getTitle());
        }else  System.out.println("Out of stock.");


    }

    public boolean isBestseller(){
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity){
        this.stock += quantity;
        System.out.println(quantity + " copies of \"" + getTitle()+ "\" have been restocked.");


    }

    public String getMediaType(){
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return String.format("Book [Stock: %d, Reviews: %s] %s", stock, reviews.toString(), super.toString());

    }
}
