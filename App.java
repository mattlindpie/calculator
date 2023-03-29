import java.util.Scanner;

public class App{
    private static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args){

        boolean continueLoop = true;
        while(continueLoop){

            //menu as an array list
            String operator = getString("What function would you like to perform? (1)Add, (2)Subtract, (3)Multiply, (4)Divide");

            double num1 = getDouble();
            double num2 = getDouble();
            
            switch(operator){
            case "1": System.out.println("Sum = " + Calculator.add(num1, num2));
                    break;
            case "2": System.out.println("Difference = " + Calculator.subtract(num1, num2));
                    break;
            case "3": System.out.println("Product = " + Calculator.multiply(num1, num2));
                    break;
            case "4": if(num2 == 0){
                        System.out.println("Cannot divide by 0");
                        break;
                      } else {
                        System.out.println("Dividend = " + Calculator.divide(num1, num2));
                        break;
                        }
            default: System.out.println("Invalid Input");
                    continue;
            }
            String result = getString("Continue? 'Yes' or 'No'");
            
            continueLoop = result.toLowerCase().equals("yes"); 
        }
        System.out.println("Goodbye");
    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.next();
    }
    
    private static double getDouble() {
        System.out.println("Enter numbers");
        return inputScanner.nextDouble();
    }
} 