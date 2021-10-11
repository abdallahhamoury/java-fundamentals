package basiclibrary;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;
public class Library {
    public static void main(String[] args) {
        roll(5);
      int[] sampleOne = {66, 64, 58, 65, 71, 57, 60};  
      int[] sampleTwo = {57, 65, 65, 70, 72, 65, 51};
      int[] sampleThree = {55, 54, 60, 53, 59, 57, 61};
      int[] sampleFour = {65, 56, 55, 52, 55, 62, 57};
     
      System.out.println(containsDuplicates(sampleOne));
      System.out.println(containsDuplicates(sampleTwo));
      System.out.println(containsDuplicates(sampleFour));
      System.out.println("the avg is =" + calculatingAverages(sampleThree));
    }
    public static void roll(int n) {
        int newArr[] = new int[n]; // 
        for (int i = 0; i < n; i++) {
            newArr[i] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1); // 
                                                                           // .
        }
        System.out.println(Arrays.toString(newArr));
    public static boolean containsDuplicates(int a[]) {
        Set<Integer> arr = new HashSet<Integer>();  
        for (int i : a) {
            if (arr.contains(i))
                return true;                         
                arr.add(i);
        }
        return false;
    }
    public static double calculatingAverages(int a[]) {
        return Arrays.stream(a).average().orElse(Double.NaN);
    }
    
    public BooleanSupplier someLibraryMethod() {
        return null;
    }

  

    
    
}


