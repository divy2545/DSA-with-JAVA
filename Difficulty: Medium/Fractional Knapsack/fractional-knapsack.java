//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] valueInput = br.readLine().trim().split(" ");
            int[] values = new int[valueInput.length];
            for (int i = 0; i < valueInput.length; i++) {
                values[i] = Integer.parseInt(valueInput[i]);
            }
            String[] weightInput = br.readLine().trim().split(" ");
            int[] weights = new int[weightInput.length];
            for (int i = 0; i < weightInput.length; i++) {
                weights[i] = Integer.parseInt(weightInput[i]);
            }
            int w = Integer.parseInt(br.readLine().trim());
            System.out.println(String.format(
                "%.6f", new Solution().fractionalKnapsack(values, weights, w)));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static class Item {
        int value, weight;
        double ratio;
        
        Item(int v, int w) {
            value = v;
            weight = w;
            ratio = (double) v / w;
        }
    }

    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio)); // Sort by value/weight

        double totalValue = 0.0;
        int currentWeight = 0;

        for (int i = 0; i < n && currentWeight < W; i++) {
            Item item = items[i];

            if (currentWeight + item.weight <= W) {
                // Take full item
                totalValue += item.value;
                currentWeight += item.weight;
            } else {
                // Take fractional part
                int remain = W - currentWeight;
                totalValue += item.ratio * remain;
                break;
            }
        }

        return totalValue;
    }
}
