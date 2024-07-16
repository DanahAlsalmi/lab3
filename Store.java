import java.util.ArrayList;
import java.util.List;
public class Store {
    private List<Media> medias;
    private List<User> users;


    public Store() {
        this.medias = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public Store(List<Media> media, List<User> users) {
        this.medias = media;
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Media> getMedia() {
        return medias;
    }

    public void setMedia(List<Media> media) {
        this.medias = media;
    }

    public void addUser(User user) {
        users.add(user);
    }

public List<User> displayUsers() {
    for (User user : users) {
            System.out.println("Username: " + user.getUser_name() + ", Email: " + user.getEmail());
        }
    return getUsers();
}


    public void addMedia(Media m) {
        medias.add(m);
    }

    public void displayMedias() {
        System.out.println("\nMedia in the Store:");
        for (Media media : medias) {
            System.out.println(media.toString());
        }
    }



    public Media searchBook(String title) {
        for (Media media : medias) {
            if (title.equalsIgnoreCase(media.getTitle())) {
                return media;
            }
        }
        System.out.println("Book not found in our library.");
        return null;
    }
    }



