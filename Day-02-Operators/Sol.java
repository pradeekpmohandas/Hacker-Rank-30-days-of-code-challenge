import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        double tip = ((meal_cost * tip_percent)/100);
        double tax = ((meal_cost * tax_percent)/100);
        double totalCost = ( tip + tax + meal_cost);
        int totalCostRounded = (int) Math.round(totalCost);
        System.out.println("The total meal cost is "+totalCostRounded+" dollars.");
        in.close();
    }
}
