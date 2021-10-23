package inheritanc;


public class Review {
    private String body;
    private String author;
    private int star;
    private String movie;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        if ( star>=0 && star<=5) {
            this.star = star;
        }else {
            System.out.println("the star should be between 0 and 5 ");
        }
    }

    public Review(String body, String author, int star){
        this.body = body;
        this.author =author;
        this.setStar(star);
    }
    public Review(String body, String author, int star,String movie){
        this.body = body;
        this.author =author;
        this.setStar(star);
        this.movie= movie;
    }
    public String toString(){
        String comments = " comments : " + this.body + " / "+ " name : " + this.author + " start * " + this.star;
        return comments;
    }
    public String test (){
        String comments = "from comments";
        return comments;
    }
}
