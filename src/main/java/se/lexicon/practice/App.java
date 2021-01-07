package se.lexicon.practice;

public class App {

    public static void main(String[] args) {

        CalculatorImpl calculator = new CalculatorImpl();
        calculator.menu();
        int result = 0;
        while (true) {
            int temp = 0;

            System.out.println("Enter a Number or make a result =: ");
            String input = Calculator.takeInput();
            if (input.equalsIgnoreCase("=")) {
                System.out.println("result = " + result);
                result = 0;
                continue;
            }
            System.out.println("Enter Operation Type: ");
            String operationType = Calculator.takeInput();
            if (input.equalsIgnoreCase("=")) {
                System.out.println("result = " + result);
                result = 0;
                continue;
            }
            switch (operationType) {
                case "+":
                    // todo:
                    temp = calculator.addition(Integer.parseInt(input), result);
                    result = temp;
                    break;
                case "=":
                    // todo:
                    System.out.println("result = " + result);
                    result = 0;
                    break;
                default:
                    System.out.println("operation is not valid");
            }
        }

    }
}
