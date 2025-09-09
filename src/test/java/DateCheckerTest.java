import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", 
    "MAY","JULY", "AUGUST", "OCTOBER", "DECEMBER" }  )
    public void testHas31Days(DateChecker.Month month) {
        boolean expected =  dateChecker.has31Days(month);
        assertTrue(expected);
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"APRIL", "JUNE", 
    "SEPTEMBER","NOVEMBER" }  )
    public void testDoesNotHave31Days(DateChecker.Month month) {
        boolean expected = dateChecker.has31Days(month);
        assertFalse(expected);
    }

}