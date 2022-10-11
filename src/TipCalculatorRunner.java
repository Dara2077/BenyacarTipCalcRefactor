import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String [] args){
        DecimalFormat roundNumber = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPpl = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPerc = scan.nextInt();
        TipCalculator myCalc = new TipCalculator(numPpl, tipPerc);
            int i = 0;
            double mealCost;
            while (i < numPpl){
                System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
                mealCost = scan.nextDouble();
                myCalc.addMeal(mealCost);
                i++;
            }
            System.out.println("-------------------------");
            System.out.println("Total Bill Before Tip: " + roundNumber.format(myCalc.totalBillBeforeTip));
            System.out.println("Tip Percentage: " + myCalc.tipPercentage);
            System.out.println("Total Tip: " + roundNumber.format(myCalc.tipAmount()));
            System.out.println("Total Bill With Tip: " + roundNumber.format(myCalc.totalBill()));
            System.out.println("Per Person Cost Before Tip: " + roundNumber.format(myCalc.perPersonCostBeforeTip()));
            System.out.println("Tip Per Person: " + roundNumber.format(myCalc.perPersonTipAmount()));
            System.out.println("Total Cost Per Person: " + roundNumber.format(myCalc.perPersonTotalCost()));
    }
}
