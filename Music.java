import java.util.ArrayList;
import java.util.List;

public class Music extends Media{

    private String artist;

    public Music(String title, String auteur, String isbn, double price, String artist) {
        super(title, auteur, isbn, price);
        this.artist = artist;
    }

    public Music(String artist) {
        super(artist);
        this.artist = artist;
    }

    public void listen(User user) {
        System.out.println("User '" + user.getUser_name() + "' is listening to '" + getTitle() + "'."+getArtist());
    }


    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        System.out.println("Playlist of similar songs by " + artist + ":");
        List<Music> playlist = new ArrayList<>();
        for (Music song : musicCatalog) {
            if (song.getAuteur().equals(artist) && !song.equals(this)) {
                System.out.println("- " + song.getTitle());
                playlist.add(song);
            }
        }
        return playlist;
    }

    public String getMediaType() {
        return getPrice() >= 10 ? "Premium Music" : "Music";

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Music [Artist: " + artist + "] " + super.toString();
    }
}
