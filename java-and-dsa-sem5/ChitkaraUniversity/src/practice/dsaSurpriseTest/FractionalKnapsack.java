package practice.dsaSurpriseTest;

import java.util.*;

public class FractionalKnapsack {

    static class Item {
        private final int weight;
        private final int profit;

        public Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
        }
    }

    private int N;
    private int maxWeight;
    private List<Item> items;

    public FractionalKnapsack(int size, int maxWeight, int[] weights, int[] profits) {
        this.N = size;
        this.maxWeight = maxWeight;
        makeItemsList(weights, profits);
    }

    private void makeItemsList(int[] weights, int[] profits) {
        items = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Item item = new Item(weights[i], profits[i]);
            items.add(item);
        }
    }

    public double getMaxProfit() {
        Comparator<Item> ItemComparator = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.profit / o2.weight - o1.profit / o1.weight;
            }
        };

        items.sort(ItemComparator);

        double totalProfit = 0;
        int weightLeft = maxWeight;

        while (!items.isEmpty() && weightLeft > 0) {
            Item item = items.get(0);
            if (item.weight <= weightLeft) {
                totalProfit += item.profit;
                weightLeft -= item.weight;
                items.remove(0);
            } else {
                totalProfit += ((double) item.profit / item.weight) * weightLeft;
                weightLeft = 0;
            }
        }

        return totalProfit;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public static void main(String[] args) {

        int[] weights0 = {2, 5, 3};
        int[] profits0 = {7, 1, 3};
        FractionalKnapsack obj0 = new FractionalKnapsack(weights0.length, 10, weights0, profits0);
        System.out.println("Max Profit: " + obj0.getMaxProfit());

        // ============================================================

        int[] weights1 = {2, 8, 3, 1, 6};
        int[] profits1 = {5, 2, 7, 2, 1};
        FractionalKnapsack obj1 = new FractionalKnapsack(weights1.length, 10, weights1, profits1);
        System.out.println("Max Profit: " + obj1.getMaxProfit());

        // ============================================================

        int[] weights2 = {5, 10, 10, 5};
        int[] profits2 = {10, 5, 5, 10};
        FractionalKnapsack obj2 = new FractionalKnapsack(weights2.length, 15, weights2, profits2);
        System.out.println("Max Profit: " + obj2.getMaxProfit());

        // ============================================================

        int[] weights3 = {5, 5, 5, 5, 5};
        int[] profits3 = {1, 2, 3, 4, 5};
        FractionalKnapsack obj3 = new FractionalKnapsack(weights3.length, 25, weights3, profits3);
        System.out.println("Max Profit: " + obj3.getMaxProfit());

    }
}
