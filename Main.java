import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        // Create some media objects
        Media book1 = new Book("Effective Java", "Joshua Bloch", "123456789", 45.0, 10,5);
        Media movie1 = new Movie("Inception", "Christopher Nolan", "987654321", 15.0, 148);
        Media music1 = new Music("Thriller", "Michael Jackson", "111222333", 9.99, "Michael Jackson");
        Media novel1 = new Novel("1984", "George Orwell", "444555666", 12.99, 5, 5, "Dystopian");
        Media academicBook1 = new AcademicBook("Artificial Intelligence: A Modern Approach", "Stuart Russell", "777888999", 100.0, 3, 5, "Computer Science");

        // Add media to store
        store.addMedia(book1);
        store.addMedia(movie1);
        store.addMedia(music1);
        store.addMedia(novel1);
        store.addMedia(academicBook1);

        // Create some users
        User user1 = new User("Danah", "Danah@example.com");
        User user2 = new User("Yara", "Yara@example.com");

        // Add users to store
        store.addUser(user1);
        store.addUser(user2);

        // Display all media and users
        store.displayMedias();
        System.out.println("----------------------------------------------------------");
        System.out.println("Users in the Store :");
        store.displayUsers();
        System.out.println("----------------------------------------------------------");


        // User interactions
        System.out.println("\n--- User1 Shopping ---");
        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.checkout();
        System.out.println("----------------------------------------------------------");


        System.out.println("\n--- User2 Shopping ---");
        user2.addToCart(music1);
        user2.removeFromCart(music1);
        user2.addToCart(novel1);
        user2.checkout();
        System.out.println("----------------------------------------------------------");


        // Specific actions for media
        System.out.println("\n--- Media Interactions ---");
        ((Movie) movie1).watch(user1);
        ((Music) music1).listen(user2);

        // Generate playlist and recommend movies
        List<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add((Music) music1);
        ((Music) music1).generatePlaylist(musicCatalog);

        List<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add((Movie) movie1);
        ((Movie) movie1).recommendSimilarMovies(movieCatalog);
        System.out.println("----------------------------------------------------------");

        // Search for a book
        System.out.println("\n--- Book Search ---");
        Media searchedBook = store.searchBook("Effective Java");
        if (searchedBook != null) {
            System.out.println("Book found: " + searchedBook.toString());

        }

    }
}