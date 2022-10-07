import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group? ");
        int numPpl = scan.nextInt();
        System.out.println("What's the tip percentage? (0-100): ");
        int tipPerc = scan.nextInt();
        TipCalculator myCalc = new TipCalculator(numPpl, tipPerc);
            int i = 0;
            double mealCost;
            while (i < numPpl){
                System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
                mealCost = scan.nextDouble();
                myCalc.addMeal(mealCost);
                i++;
            }
            System.out.println("Total Bill Before Tip: " + myCalc.totalBill());
    }
}
