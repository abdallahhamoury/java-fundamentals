package inheritanc;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int countStar;
    private String price;
    public ArrayList<Review> reviewArrayList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountStar() {
        return countStar;
    }

    public void setCountStar(int countStar) {
        this.countStar = countStar;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    public Restaurant(String name,int countstar,String price){
        this.name= name;
        this.countStar = countstar;
        this.price = price;
    }
    public String toString(){
        String reviesCostomer = " Resturant " + this.name+ " start " + this.countStar + " price category "+ this.price+" " + reviewArrayList;
        return reviesCostomer;
    }
    public int addReview(Review review){
        reviewArrayList.add(review);
        this.countStar = (this.getCountStar()+review.getStar()) / reviewArrayList.size();
//        System.out.println(review.test());
        return this.countStar;
    }
}
