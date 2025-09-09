public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Can not divide by zero");
    }
    return a / b;
  }

  public boolean isEven(int num) {
    return num % 2 == 0;
  }

  public int[] incrementList(int[] numbers) {
    int[] result = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      result[i] = numbers[i] + 1;
    }
    return result;
  }
}
