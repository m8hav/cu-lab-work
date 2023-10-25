package dsa.greedy.problems.jobSequencingWithDeadline;

/*

You are given n jobs, each with a deadline (d) and a profit (p).
Each job takes one unit of time to complete.

Your task is to find the sequence of jobs to maximise the total profit,
subject to the constraint that each job must be completed within its deadline.

KEEP IN MIND:
You will be given a time frame,
so you have to schedule jobs to maximise profit in that time frame

Step 1:
Sort the profit in descending order

 */


import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingWithDeadline {

    // INNER CLASS
    static class Job implements Comparable<Job> {
        String name;
        int deadline;
        int profit;

        @Override
        public int compareTo(Job otherJob) {
            return otherJob.profit - this.profit;
        }

        public Job(String name, int deadline, int profit) {
            this.name = name;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void findJobSequence(ArrayList<Job> jobs) {

        // sort the jobs as per profits
        Collections.sort(jobs);

        int totalJobs = jobs.size();
        boolean[] slots = new boolean[totalJobs];
        int sequence[] = new int[totalJobs];

        // STEP 2: Get the maximum deadline
        for (int i = 0; i < totalJobs; i++) {
            for (int j = jobs.get(i).deadline - 1; j >= 0; j--) {
                if (!slots[j]) {
                    sequence[j] = i;
                    slots[j] = true;
                    break;
                }
            }
        }

        // STEP 4: Get the jobs
        System.out.println("Jobs:");

        int totalProfit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            if (slots[i]) {
                System.out.println(jobs.get(sequence[i]).name + " ");
                totalProfit += jobs.get(sequence[i]).profit;
            }
        }
        System.out.println("Total profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job a = new Job("A", 2, 140);
        Job b = new Job("B", 1, 90);
        Job c = new Job("C", 2, 100);
        Job d = new Job("D", 3, 50);
        Job e = new Job("E", 3, 15);

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(a);
        jobs.add(b);
        jobs.add(c);
        jobs.add(d);
        jobs.add(e);

        findJobSequence(jobs);
    }

}
