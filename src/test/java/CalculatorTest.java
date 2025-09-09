import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
    int expected = 5;
    int actual = calculator.add(2, 3);
    assertEquals(expected, actual);
  }


  @Test
  public void testSubtract() {
    int expected = 1;
    int actual = calculator.subtract(3, 2);
    assertEquals(expected, actual);
  }

  @Test
  public void testMultiply() {
    int expected = 6;
    int actual = calculator.multiply(2, 3);
    assertEquals(expected, actual);
  }

  @Test
  public void testDivide() {
    int expected = 1;
    int actual = calculator.divide(6, 5);
    assertEquals(expected, actual);
  }

  @Test
  public void testIsEven() {
    boolean actual = calculator.isEven(2);
    assertTrue(actual);
  }

  @Test
  public void testIsOdd(){
    boolean actual = calculator.isEven(3);
    assertFalse(actual);
  }


 @Test 
 public void incrementArray(){
   int[] expected = new int[]{2,3,4};
   int[] actual = calculator.incrementList(new int[]{1,2,3});
   assertArrayEquals(expected, actual);
 }

 @Test
 public void testDivideByZero(){
   Exception ex =  assertThrows(IllegalArgumentException.class,() -> calculator.divide(5, 0));
   String expected = "Can not divide by zero"; 
   String actual = ex.getMessage();
   assertEquals(expected, actual);
 }


}
