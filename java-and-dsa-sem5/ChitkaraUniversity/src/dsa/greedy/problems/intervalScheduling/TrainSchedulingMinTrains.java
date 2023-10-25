package dsa.greedy.problems.intervalScheduling;

/*

You are given a list of train arrival and departure times at a railway station.

Your task is to find a schedule that accommodate all trains on a single platform without conflicts.

 */

import java.util.Arrays;

public class TrainSchedulingMinTrains {

    public static void doTrainScheduling(int n, int[] arrivalTime, int[] departureTime) {
        Arrays.sort(arrivalTime);
        Arrays.sort(departureTime);

        int i = 0, j;
        int counter = 1;
        System.out.print(i);

        for (j = 1; j < n; j++) {
            if (arrivalTime[j] >= departureTime[i]) {
                System.out.print(" " + j);
                i = j;
                counter++;
            }
        }
        System.out.println();

        System.out.println("Total trains to stop: " + counter);
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arrivalTime = {900, 940, 950, 1100, 1500, 1800};
        int[] departureTime = {910, 1200, 1120, 1130, 1900, 2000};

        doTrainScheduling(n, arrivalTime, departureTime);
    }
}