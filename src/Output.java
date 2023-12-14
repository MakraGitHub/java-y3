public class Output {
    public static void main(String[] args){
        //Show links (And) can prevent dividing a number by zero in java
        int numerator = 10;
        int denominator = 0;

        //Using logical And to check if the 
        if (denominator != 0 && numerator > 0) {
            // Perform division only if the denominator is not zero and the numerator is greater than 0
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } else {
            System.out.println("Cannot divide by zero or numerator is not greater than 0.");
        }
    }
}
