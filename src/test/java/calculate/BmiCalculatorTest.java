package calculate;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class BmiCalculatorTest {


    @Test
    public void overweightTest() {
        BmiCalculator bmiCalculator = new BmiCalculator(177, 86);
        bmiCalculator.calcuate();
        String actual = bmiCalculator.interpet();
        String excepted = "Overweight";
        assertEquals(excepted, actual);
    }

    @Test
    @Parameters({"305, 86"})
    public void toHeightTest(int height, int weight) {
        BmiCalculator bmiCalculator = new BmiCalculator(height, weight);
        assertTrue(bmiCalculator.toHeight());
    }


    @Test
    @Parameters({"30, 86"})
    public void toSmallTest(int height, int weight) {
        BmiCalculator bmiCalculator = new BmiCalculator(height, weight);
        assertTrue(bmiCalculator.toSmall());
    }


}
