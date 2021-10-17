package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    double countStar;
    double price;

    ArrayList<Review> reviewArrayList = new ArrayList<>();

    public Restaurant(String name,double countstar,double price){
        this.name= name;
        this.countStar = countstar;
        this.price = price;
    }
     public String toString(){
        String reviesCostomer = "Resturant" + this.name+ "start" + this.countStar + "price category"+ this.price +"$";
        return reviesCostomer;
     }
     public double addReview(String body,String author,int countstar){
        Review review = new Review(body,author,countstar);
        reviewArrayList.add(review);
        this.countStar = (this.countStar+review.star)/2;
         System.out.println(review.test());
         return this.countStar;
     }


}
