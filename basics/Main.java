package basics;
import java.time.LocalDateTime;



public class Main {

  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println(
      "I own " + dogCount + " " + pluralize("dog", dogCount) + "."
    );

    int catCount = 2;
    System.out.println(
      "I own " + catCount + " " + pluralize("cat", catCount) + "."
    );

    int turtleCount = 0;
    System.out.println(
      "I own " + turtleCount + " " + pluralize("turtle", turtleCount) + "."
    );

    flipNHeads(1);
    clock();
    reverseArray(array)
  }

  // Functions that return nothing have a return type of "void"
  public static String pluralize(String name, int count) {
    if (count == 0 || count > 1) {
      return name + "s";
    } else {
      return name;
    }
  }

  public static void flipNHeads(int num) {
    int numFlibs = 0;
    int seqFlibs = 0;

    while (seqFlibs != num) {
      double random = Math.random();
      if (random > 0.5) {
        System.out.println("heads");
        numFlibs++;
        seqFlibs++;
      } else {
        System.out.println("talis");
        seqFlibs = 0;
        numFlibs++;
      }
      System.out.println(
        "It took " + numFlibs + "flips to flip  heads in a row."
      );
    }
  }

  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    boolean times = true;
    int curtnSecond = now.getSecond();
    while (times) {
       now = LocalDateTime.now();
      int newtnSecond = now.getSecond();
      if (curtnSecond != newtnSecond) {
        System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
        curtnSecond = now.getSecond();
      }
    }
  }


}
