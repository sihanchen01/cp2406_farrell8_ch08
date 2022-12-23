import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistanceFromAverage {
    static final double EXIT_CODE = 9999;
    static double sum = 0;
    static double average;
    static int numCount = 0;
    static double inputNum;

    public static void main(String[] args) {
        getUserInputNumber();
        while(inputNum != EXIT_CODE){
            numCount += 1;
            sum += inputNum;
            average = sum / numCount;
            System.out.printf("%.2f added, distance to average %.2f is - %.2f\n",
                    inputNum, average, Math.abs(inputNum - average));
            getUserInputNumber();
        }
    }

    public static void getUserInputNumber(){
        System.out.print("Input a number (type 9999 to exit): ");
        try {
            Scanner userInput = new Scanner(System.in);
            String s = userInput.nextLine();
            Pattern pattern = Pattern.compile("\\D");
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                System.out.println("Invalid input, try again!");
                getUserInputNumber();
            }else {
                inputNum = Double.parseDouble(s);
            }
        }
        catch(NumberFormatException e){
            System.out.println("Empty input, try again!");
        }
    }
}
