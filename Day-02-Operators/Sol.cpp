#include <bits/stdc++.h>

using namespace std;

int main() {
    double meal_cost;
    cin >> meal_cost;
    int tip_percent;
    cin >> tip_percent;
    int tax_percent;
    cin >> tax_percent;
        
    double tip = tip_percent * meal_cost / 100;
    double tax = tax_percent * meal_cost / 100;

    int totalCost = (int) round(tip + tax + meal_cost);
    cout<<"The total meal cost is "<<totalCost<<" dollars.";

    return 0;
}
