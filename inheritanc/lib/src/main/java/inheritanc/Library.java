/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritanc;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args){
        Restaurant mcDonalds = new Restaurant("mcDonalds",3,"$");
        Review comments = new Review("amazing" , "abdallah" ,3);
        System.out.println(comments.toString());
        mcDonalds.addReview(comments);
        System.out.println(mcDonalds.toString());
        System.out.println(mcDonalds.toString());

        Shop handm = new Shop("hsndm","$$$");
        System.out.println(handm.toString());
        ArrayList myfav = new ArrayList();
        myfav.add("faceoff");
        myfav.add("lolo");
        Theater preafhard = new Theater("aboali",myfav);
        preafhard.addReview("so waw","abdallah",5);
        System.out.println(preafhard.toString());
    }
}
