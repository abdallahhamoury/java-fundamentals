package inheritanc;
import java.util.ArrayList;



public class Shop {
    String name;
    String price;
    ArrayList<Review> reviewList = new ArrayList<>();

    public Shop(String name, String price) {
        this.name = name;
        this.price = price;

    }

    public void addReview(String body,String author,int numOfStars) {
        Review review = new Review(body,author,numOfStars);
        reviewList.add(review);
    }

    public String toString(){
        String rating = "Shop: " + this.name + " \n" + " Number of reviews = " + reviewList.size() + " \n" + " price category: " + this.price+ "$" ;

        return rating;
    }

}
