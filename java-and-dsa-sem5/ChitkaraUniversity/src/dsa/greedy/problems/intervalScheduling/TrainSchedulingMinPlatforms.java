package dsa.greedy.problems.intervalScheduling;

import java.util.Arrays;

public class TrainSchedulingMinPlatforms {
    public static int findMinimumPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);


        return 0;
    }

    public static void main(String[] args) {

    }
}


/*
package Greedy;

import java.util.Arrays;

public class PlatformSequence {

    public static int findMinPlatform(int[] arrival,int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        System.out.println("Arrival: ");
        for(int i=0;i<arrival.length;i++) {
            System.out.print(arrival[i] + " ");
        }
        System.out.println("\nDeparture: ");
        for(int i=0;i<departure.length;i++) {
            System.out.print(departure[i] + " ");
        }
        System.out.println("\n");

        int platforms=0;
        int maxPlatforms=0;

        int arrivalPointer=0;
        int departurePointer=0;

        while(arrivalPointer < arrival.length && departurePointer < departure.length) {
            if(arrival[arrivalPointer] <= departure[departurePointer]) {
                platforms++;
                arrivalPointer++;
                System.out.println("AP: " + arrivalPointer + " - Platform: " + platforms);
            }
            else {
                platforms--;
                departurePointer++;
                System.out.println("DP: " + departurePointer + " - Platform: " + platforms);
            }
            maxPlatforms=Math.max(maxPlatforms, platforms);
        }
        return departurePointer;
    }

    public static void main(String[] args) {
        int[] arrival= {};
        int[] departure= {};

        int minplatforms=findMinPlatform(arrival,departure);
        System.out.println("Minimum PLatforms Required: " + minPlatform);
    }

}
 */