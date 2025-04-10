//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double MAX_REGULAR_HOURS = 40;
    static double OVERTIME_FACTOR =1.5;

    public static double calculatePay(double hours, double rate){
        double total = 0;
        double regularHours =0;
        double overtimeHours=0;
        double overtimeRate=OVERTIME_FACTOR*rate;
        if(hours>MAX_REGULAR_HOURS) {
            regularHours = MAX_REGULAR_HOURS;
            overtimeHours = hours - MAX_REGULAR_HOURS;
        }else{
            regularHours= hours;
        }
        total= (hours*rate)+(overtimeHours*overtimeRate); //simple formula hours time rate
        return total;
    }
    public static void main(String[] args){

        System.out.println("ENTER HOURS:");
        double hours = scanner.nextDouble();
        System.out.println("ENTER RATE");
        double rate = scanner.nextDouble();
        System.out.printf("Total: %.2f \n", calculatePay(hours, rate));
        }
    }
