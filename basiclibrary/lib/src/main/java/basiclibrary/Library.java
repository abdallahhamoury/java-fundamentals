
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;
import java.util.List;

// import java.util.function.BooleanSupplier;
public class Library {
    public static void main(String[] args) {


        System.out.println((roll(5)));


        int[] testDuplicatFun1 = {1, 2, 8, 11, 20, 70, 0};
        int[] testDuplicatFun2 = {3, 5, 56, 80, 10, 9, 1};
        int[] testDuplicatFun3 = {70, 51, 51, 0, 0, 9, 9};

        System.out.println(containsDuplicates(testDuplicatFun1));
        System.out.println(containsDuplicates(testDuplicatFun2));
        System.out.println(containsDuplicates(testDuplicatFun3));


        int[] testCalculatingAveragesFun1 = {70, 51, 51, 0, 0, 9, 9};
        int[] testCalculatingAveragesFun2 = {1, 2, 8, 11, 20, 70, 0};;
        System.out.println("the avg is =" + calculatingAverages(testCalculatingAveragesFun1));
        System.out.println("the avg is =" + calculatingAverages(testCalculatingAveragesFun2));


        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[][] weeklyMonthTemperatures2 = {
                {1, 2, 8, 11, 20, 70, 0},
                {3, 5, 56, 80, 10, 9, 1},
                {70, 51, 51, 0, 0, 9, 9},
                {65, 56, 55, 52, 55, 62}
        };
        System.out.println(Arrays.toString(lowestAverage(weeklyMonthTemperatures)));
        System.out.println(Arrays.toString(lowestAverage(weeklyMonthTemperatures2)));


        System.out.println( analysisWeatherData(weeklyMonthTemperatures));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }

    public static  ArrayList<Integer> roll (int num){

        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        int randomNum = 0;
        for(int i =0;i<num;i++){
            while (true){
                randomNum = random.nextInt(7);
                if(randomNum !=0) break;
            }
            array.add(randomNum);
        }
        return array;
    }

    public static boolean containsDuplicates(int[] array){
        boolean val =false ;
        for(int i: array){
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    val = true ;
                    break;
                }
            }}
        return val;
    }

    public static double calculatingAverages(int []arr) {
        double sum = 0;
        double avg = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
            count++;
        }
        avg=sum/count;
        return avg;
    }

    public static int[] lowestAverage(int[][] arr) {
        ArrayList<Double> averageArray = new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            averageArray.add(sum / arr[i].length);
        }
        return arr[averageArray.indexOf(Collections.min(averageArray))];
    }


    public static String analysisWeatherData(int [][] arr){
        HashSet<Integer> hashSet =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0 ; j<arr[i].length;j++){
                hashSet.add(arr[i][j]);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num:hashSet)
            arrayList.add(num);
        Collections.sort(arrayList);
        String result = "";
        int min = arrayList.get(0);
        int max = arrayList.get(arrayList.size()-1);
        int count =min;
        for(int i =0;i<arrayList.size();i++){
            if( arrayList.get(i) != count){
                    result +="Never saw temperature: " + count + "\n";
                    count++;
            }
            count++;
        }
        System.out.println("High: " + max);
        System.out.println("Low: " + min );
        return result;
    }

    public static String tally( List <String> list){
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String dataString:list){
            map.put(dataString,0);
        }
        for(String key : map.keySet()){
            for (String name :list){
                Integer count = map.get(key);
                if(key == name){
                    map.put(key,count+1);
                }
            }
        }
        String winner = "";

        for(String key : map.keySet()){
            if(map.get(key) == Collections.max(map.values()))
                winner = key;
        }
        return winner;
    }

}


