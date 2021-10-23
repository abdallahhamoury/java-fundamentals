package inheritanc;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int countStar;
    private String price;
    public ArrayList<Review> reviewArrayList = new ArrayList<>();


    public Restaurant(String name,int countstar,String price){
        this.name= name;
        this.setCountStar(countstar);
        this.price = price;
    }

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
        if ( countStar>=0 && countStar<=5) {
            this.countStar = countStar;
        }else {
            System.out.println("the star should be between 0 and 5 ");
        }
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }




    public String toString(){
        String reviesCostomer = " Resturant " + this.name+ " start " + this.countStar + " price category "+ this.price+" " + reviewArrayList;
        return reviesCostomer;
    }
    public int addReview(Review review){
        reviewArrayList.add(review);
        this.countStar = (this.getCountStar()+review.getStar()) / (reviewArrayList.size()+1);
        return this.countStar;
    }
}
