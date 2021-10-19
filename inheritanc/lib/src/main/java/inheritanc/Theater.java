package inheritanc;
import java.util.ArrayList;

public class Theater {
   private String name;

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

    public void addReview(String body, String author, int numOfStars) {
        Review review = new Review(body,author,numOfStars);
        reviewList.add(review);
    }


    public void addReview(String body,String author,int numOfStars, String Movie) {
        Review review = new Review(body,author,numOfStars, Movie);
        reviewList.add(review);
    }

}
