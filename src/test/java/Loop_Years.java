import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Loop_Years {
    /*
        CRITERIA FOR LEAP YEARS
        - Divisible by 4, but not 100
        - Divisible by 400

        CRITERIA FOR NON-LEAP YEARS
        - Not divisible by 4
        - Divisible by 100, but not 400
     */

    // LEAP YEAR TESTS
    // This test is for years divisible by 4, but not 100
    @Test
    public void Year_2024_is_divisible_by_4_but_not_100() {
        assertTrue(Main.isLeapYear(2024));
    }

    // This test is for years divisible by 400
    @Test
    public void Year_2000_is_divisible_by_400(){
        assertTrue(Main.isLeapYear(2000));
    }

    // NON-LEAP YEAR TESTS
    // This test is for years not divisible by 4
    @Test
    public void Year_2003_is_not_divisible_by_4() {
        assertFalse(Main.isLeapYear(2003));
    }

    //This test is for years divisible by 100, but not 400
    @Test
    public void Year_1700_is_divisible_by_100_but_not_400() {
        assertFalse(Main.isLeapYear(1700));
    }
}

