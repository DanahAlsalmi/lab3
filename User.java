import java.util.ArrayList;
import java.util.List;

public class User {
    private String user_name;
    private String email;
    private List<Media> purchasedMediaList;
    private List<Media> shoppingCart;

    public User(String user_name, String email) {
        this.user_name = user_name;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }



    public void addToCart(Media media) {
        shoppingCart.add(media);
        System.out.println("'" + media.getTitle() + "' added to " + getUser_name() + "'s shopping cart.");
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
        System.out.println("'" + media.getTitle() + "' removed from " + getUser_name() + "'s shopping cart.");
    }

    public void checkout() {
        purchasedMediaList.addAll(shoppingCart);
        shoppingCart.clear();
        System.out.println(getUser_name() + "'s purchase completed.");

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public List<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(List<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
