package calculate;

import java.text.DecimalFormat;

public class BmiCalculator implements Calculate{

    private int height;
    private int weight;

    private double bmi;

    public BmiCalculator(int height, int weight) {
        this.height = height;
        this.weight = weight;

    }

    @Override
    public double calcuate() {
        bmi = ((double) weight) / (((double) height/100) * ((double) height/100)) ;
        return bmi;
    }

    @Override
    public String interpet() {

        String textInterpet = "";

        if (bmi < 18.5) {
            textInterpet = "Underweight";
        } else if (bmi <= 25) {
            textInterpet = "Normal";
        } else if (bmi <= 30) {
            textInterpet = "Overweight";
        } else  {
            textInterpet = "Obese";
        }
        return textInterpet;
    }

    public boolean toHeight() {
        return height > 300;
    }

    public boolean toSmall() {
        return height < 50;
    }
}
