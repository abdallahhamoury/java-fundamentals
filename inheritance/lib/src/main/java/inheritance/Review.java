package inheritance;

public class Review {
    private String body;
    private String author;
    private int star;

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
        this.star = star;
    }

    public Review(String body, String author, int star){
        this.body = body;
        this.author =author;
        this.star = star;
    }
    public String toString(){
        String comments = "comments" + this.body + "name" + this.author + "start*" + this.star;
        return comments;
    }
    public String test (){
        String comments = "from comments";
        return comments;
    }
}
