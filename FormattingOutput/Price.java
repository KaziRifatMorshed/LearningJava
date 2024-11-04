package FormattingOutput;

import java.text.NumberFormat;
import java.util.Scanner;

public class Price {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final double TAX_RATE = 0.06;
        int quantity;
        double subTotal, tax, totalCost, unitPrice;
        quantity = scan.nextInt();
        unitPrice = scan.nextDouble();

        subTotal = quantity * unitPrice;
        tax = subTotal * TAX_RATE;
        totalCost = tax + subTotal;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println(STR."Subtotal \{money.format(subTotal)} and total cost is \{money.format(totalCost)} at \{percent.format(TAX_RATE)} rate...  BUT NOT \{percent.format(100*TAX_RATE)} percent rate");
    }
}
