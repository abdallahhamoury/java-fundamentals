package inheritance;

public class Review {
    String body;
    String author;
    int star;

    public Review(String body,String author,int star){
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
