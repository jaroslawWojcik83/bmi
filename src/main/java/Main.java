import calculate.BmiCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        System.out.print("Enter height [cm]: ");
        int height = scr.nextInt();

        System.out.print("Enter weight [kg]: ");
        int weight = scr.nextInt();

        BmiCalculator bmiCalculator = new BmiCalculator(height, weight);

        if (!bmiCalculator.toHeight() && !bmiCalculator.toSmall()) {

            bmiCalculator.calcuate();
            System.out.println(bmiCalculator.interpet());

         }

    }


}
