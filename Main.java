

public class Main {
    public static void main(String[] args) {
      int dogCount = 1;
      System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

      int catCount = 2;
      System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

      int turtleCount = 0;
      System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    }
  
    // Functions that return nothing have a return type of "void"
    public static String pluralize(String name, int count) {
      if ( count == 0 || count > 1 ) {
          return name + "s";
      } else {
          return name;  
      }
  }
}
   

public class flipNHeads {
  int numFlibs=0;
  int seqFlibs=0;
  
  while(seqFlibs != num ){
  int random= math.random();
  if(random>0.5){
      System.out.println("heads");
      numFlibs++;
      seqFlibs++;
  }else{
  System.out.println("talis");
  seqFlibs = 0;
  numFlibs++;
  
  }
  System.out.println("It took " + numFlibs + "flips to flip  heads in a row.");
  
  }
  }
  
  }
}

  public static void clock() {
    boolean times = true;
    int min = 0;
    while(times){
      LocalDateTime now = localDateTime.now();
      int persecond = getPerSecond();
      if(min!= persecond){
        min = persecond;
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);

      }
    }
  }
