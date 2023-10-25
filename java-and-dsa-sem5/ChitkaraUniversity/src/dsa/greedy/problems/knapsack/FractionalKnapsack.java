package dsa.greedy.problems.knapsack;

/*
Fractional Knapsack:
For getting values with maximum profits in the knapsack with fraction of products

Given a set of items with weights (w1, w2, ..., wn), values (v1, v2, ..., vn),
and a knapsack of maximum weight capacity w.

Find the most valuable combination of items to include in the knapsack without exceeding its weight capacity.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapsack {

    private int weightOfKnapsack;

    public FractionalKnapsack(int weight) {
        this.weightOfKnapsack = weight;
    }

    public void doFractionalKnapsack(int[] productWeight, int[] productProfit) {
        int productWeightLength = productWeight.length;
        double maxProfit = 0;

        // Step 1: Get the profit per unit.

//        List<Item> itemList = new ArrayList<>();
//
//        ...
//
//        // Step 2: Sort the profit per unit
//
//        // sorting the list in the decreasing order of the value per nit weight ratio
//        Collections.sort(itemList, new Comparator<Item>() {
//            public int compare(Item item1, Item item2) {
//                if (item1.profitPerUnitWeight > item2.profitPerUnitWeight)
//                    return -1;
//                else return 1;
//            }
//        })
//
//        // Step 3: Iterate to get the MAX profit
//        for (int i = 0; i < productWeightLength; i++) {
//            int weight = itemList.get(i).weight;
//            int profit = itemList.get(i).profit;
//
//            double profitPerUnitWeight = itemList.get(i).profitPerUnitWeight;
//
//            // when taking the whole item
//            if (weightOfKnapsack >= weight) {
//                maxProfit += profit;
//                weightOfKnapsack -= weight;
//            }
//            // when taking a fraction i.e. bag is almost full
//            else {
//                maxProfit += (profitPerUnitWeight * weightOfKnapsack);
//                weightOfKnapsack = 0;
//                // IMPORTANT: set w = 0 when knapsack is filled
//                break;
//            }
//        }
    }

    public static void main(String[] args) {
        int weightOfKnapsack = 0;
        // weight of knapsack



        FractionalKnapsack obj = new FractionalKnapsack(weightOfKnapsack);

//        obj.setN();
//
//        obj.setProductsWeight()
    }
}
