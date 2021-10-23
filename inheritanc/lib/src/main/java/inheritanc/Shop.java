package inheritanc;
import java.util.ArrayList;



public class Shop {
    private int rate ;
    private String name;
    private String price;
    private ArrayList<Review> reviewList = new ArrayList<>();

    public Shop(String name, String price) {
        this.name = name;
        this.price = price;

    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public int addReview(Review review) {
        reviewList.add(review);
        if (this.rate==0) {
            this.rate = ( review.getStar() );
        }else{
            this.rate = (this.rate + review.getStar()) / (reviewList.size() + 1);
        }
        return this.rate;
    }

    public String toString(){
        String rating = "Shop: " + this.name + " " + " Rate depend on reviews = " + this.rate + " " + " price category: " + this.price+ " " ;

        return rating;
    }

}
