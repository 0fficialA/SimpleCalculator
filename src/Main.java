import java.util.Scanner;

public class Main {
    static Scanner sc =  new Scanner(System.in);
    enum operators{
        MULTIPLY,DIVIDE,ADD,SUBTRACT
    }

    public static Number operate(float num1, float num2, operators operator){

        float result;
        switch (operator){
            case DIVIDE:
                result = (num1/num2);
                break;
            case MULTIPLY:
                result = num1*num2;
                break;
            case ADD:
                result = num1+num2;
                break;
            case SUBTRACT:
                result = num1-num2;
                break;
            default:
                result = 0;
        }

        if (result/ Math.floor(result) == 1 && result != 0){
            return (int) (result);
        }
        else{
            return result;
        }
    }

    public static void main(String[] args) {
        float num1 = 0;
        float num2 = 0;
        operators operator;

        while (true){
            while (true){
                System.out.println("Enter a number to start calculate:");
                try{
                    num1 = Float.parseFloat(sc.nextLine());
                    break;
                }catch (NumberFormatException ex){
                    System.err.println("You must enter a number");
                }
            }
            System.out.println("type the operator = *,/,+,-:");

            switch (sc.nextLine()){
                case "/":
                    operator = operators.DIVIDE;
                    break;
                case "*":
                    operator = operators.MULTIPLY;
                    break;
                case "+":
                    operator = operators.ADD;
                    break;
                case "-":
                    operator = operators.SUBTRACT;
                    break;
                default:
                    System.out.println("You can only use \"/\",\"*\",\"+\",\"-\"");
                    operator = null;
            }
            System.out.println("Chosen operator: "+ operator);
            while (true){
                System.out.println("Enter a second number to operate on:");
                try{
                    num2 = Float.parseFloat(sc.nextLine());
                    break;
                }catch (NumberFormatException ex){
                    System.err.println("You must enter a number");
                }
            }
            System.out.println("The result is: " + operate(num1,num2,operator));
        }

    }
}