/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;
import java.util.List;

// import java.util.function.BooleanSupplier;
public class Library {
    public static void main(String[] args) {

// problem 1
        System.out.println(Arrays.toString(roll(5)));

// problem 2
        int[] sample1 = {6, 4, 8, 5, 1, 7, 0};
        int[] sample2 = {7, 5, 5, 0, 2, 9, 1};

        System.out.println(containsDuplicates(sample1));
        System.out.println(containsDuplicates(sample2));

        // problem 3
        int[] sample3 = {15, 54, 77, 110, 11, 19, 61};
        System.out.println("the avg is =" + calculatingAverages(sample3));

        // problem 4
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(arrayOfArrays(weeklyMonthTemperatures)));
 // problem 5
        analysisWeatherData(weeklyMonthTemperatures);
// problem 6
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

    // roll function
    public static int[] roll(int numOfRoll) {
        int[] array = new int[numOfRoll];

        for (int i = 0; i < numOfRoll; i++) {
            double random = (Math.random() * 6) + 1;
            array[i] = (int) random;
        }
        return array;
    }

    // duplicates function
    public static boolean containsDuplicates(int[] arr) {
        boolean isDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                }
            }
        }
        return isDuplicate;
    }

    // Calculating Averages
    public static double calculatingAverages(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }

    // array Of Arrays
    public static int[] arrayOfArrays(int[][] array) {
        HashMap<Integer, Double> lowAvg = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
            }
            double average = sum / array[i].length;
            lowAvg.put(i, average);
        }

        double avg = lowAvg.get(0);
        int key = 0;
        for (int x = 1; x < lowAvg.size(); x++) {
            if (avg > lowAvg.get(x)) {
                avg = lowAvg.get(x);
                key = x;
            }
        }
        return array[key];
    }
    public  static  void  analysisWeatherData(int [][] weatherData){
        HashSet<Integer> weatherDataSet = new HashSet<Integer>();
        int minTemp = weatherData[0][0];
        int maxTemp = weatherData[0][0];
        for (int i = 0; i <weatherData.length ; i++) {
            for (int j = 0; j <weatherData[i].length ; j++) {
                weatherDataSet.add(weatherData[i][j]);
                if(weatherData[i][j]< minTemp)
                    minTemp = weatherData[i][j];
                if(weatherData[i][j]>maxTemp)
                    maxTemp = weatherData[i][j];
            }
        }
        System.out.println("High: "+maxTemp);
        System.out.println("Low: "+minTemp);
        for (int i = minTemp+1; i <maxTemp-1 ; i++) {
            if(!weatherDataSet.contains(i))
                System.out.println("Never saw temperature: "+i);
        }
    }

    public static String tally(List<String> votes){
        HashMap<String,Integer> candidatesVotes = new HashMap<String,Integer>();
        for (String vote: votes) {
            if(!candidatesVotes.containsKey(vote))
                candidatesVotes.put(vote,1);
            else{
                int voteInc = candidatesVotes.get(vote)+1;
                candidatesVotes.put(vote,voteInc);
            }

        }
        int maxVote = candidatesVotes.get(votes.get(0));
        String winner;
        winner = votes.get(0);
        for (String vote:candidatesVotes.keySet()){
            if(candidatesVotes.get(vote)>maxVote)
                winner = vote;
        }
        return winner;
    }
}


