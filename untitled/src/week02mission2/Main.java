package week02mission2;

import java.util.Scanner;
import java.util.List;
public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = Integer.parseInt(sc.nextLine());
            System.out.println(firstNum);


            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = Integer.parseInt(sc.nextLine());
            System.out.println(secondNum);

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.nextLine();
            System.out.println(operator);

//            double answer =  calculator.calculator(firstNum, secondNum, operator);
            System.out.println(calculator.calculator(firstNum, secondNum, operator));

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                break;
            }
        }

        calculator.DeleteList();


        List<Double> resultList = calculator.getResult();

        for (Double result : resultList){
            System.out.println(result);
        }
    }
}