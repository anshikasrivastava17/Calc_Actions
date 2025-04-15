public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        assert calc.add(3, 2) == 5 : "Add failed";
        assert calc.subtract(5, 2) == 3 : "Subtract failed";
        assert calc.multiply(4, 2) == 8 : "Multiply failed";
        assert calc.divide(10, 2) == 5 : "Divide failed";

        System.out.println("All tests passed!");
    }
}
