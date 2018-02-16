  var totalTip = mealCost*(tipPercent/100);
  var totalTax = mealCost*(taxPercent/100);
  var totalCost=Math.round(mealCost+totalTip+totalTax);
  
  console.log("The total meal cost is "+totalCost+" dollars.");
