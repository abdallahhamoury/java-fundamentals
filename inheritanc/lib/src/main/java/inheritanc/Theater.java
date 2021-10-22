package inheritanc;
import java.util.ArrayList;

public class Theater {
   private String name;
private int rate;
    private ArrayList<Review> reviewList = new ArrayList<>();
    private ArrayList<String> movieList;

    public Theater( String name, ArrayList movies) {
        this.name = name;
        this.movieList = movies;
    }


    @Override
    public String toString() {
        String output = "Theater{" +
                "name='" + name + '\'' +
                ", reviewList=" + reviewList +
                ", movieList=" + movieList +
                '}';
        return output;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void addMovie(String x){

        movieList.add(x);

    }

    public void removeMovie(String x){

        movieList.remove(x);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public ArrayList<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<String> movieList) {
        this.movieList = movieList;
    }

    public int addReview(Review review) {
        reviewList.add(review);
        if (this.rate==0) {
            this.rate = ( review.getStar());
        }else{
            this.rate = (this.rate + review.getStar()) / (reviewList.size() + 1);
        }
        return this.rate;
    }


    public int addReview(String body,String author,int numOfStars, String Movie) {
        Review review = new Review(body,author,numOfStars, Movie);
        reviewList.add(review);
        if (this.rate==0) {
            this.rate = ( review.getStar());
        }else{
            this.rate = (this.rate + review.getStar()) / (reviewList.size() + 1);
        }
        return this.rate;
    }

}
