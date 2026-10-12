class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        switch(operation) {
            case "+":
                int sum = operand1 + operand2;
                return operand1 + " + " + operand2 + " = " + sum;
            case "*":
                int product = operand1 * operand2;
                return operand1 + " * " + operand2 + " = " + product;
            case "/":
                int trade;
                try {
                    trade = (int) operand1 / operand2;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                return operand1 + " / " + operand2 + " = " + trade;
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException("Operation \'"+ operation +"\' does not exist");
        }
    }
}
