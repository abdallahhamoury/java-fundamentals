package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double countStar;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCountStar() {
        return countStar;
    }

    public void setCountStar(double countStar) {
        this.countStar = countStar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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
        reviewArrayList.getClass();
        this.countStar = (this.getCountStar()+review.getStar())/2;
         System.out.println(review.test());
         return this.countStar;
     }


    public class ArrayList<T> {
        ArrayList<Review> reviewArrayList = new ArrayList<>();
    }
}
