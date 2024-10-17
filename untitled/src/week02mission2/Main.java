package week02mission2;

import java.util.Scanner;

public class Main {

    public int firstNum;

    public int secondNum;

    public String operator;
    double result = 0.0;

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


            if (operator.equals ("+")) {
                int result =  calculator.calculator(firstNum, secondNum,"+" );
                System.out.println(result);
            } else if (operator.equals("-")) {
                int result =  calculator.calculator(firstNum, secondNum,"-");
                System.out.println(result);
            } else if (operator.equals("*")) {
                int result =  calculator.calculator(firstNum, secondNum,"*");
                System.out.println(result);
            } else if (operator.equals("/") && secondNum != 0) {
                int result =  calculator.calculator(firstNum, secondNum,"/");
                System.out.println(result);
                if (secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            } else {
                System.out.println(operator + "는 잘못된 연산자입니다");
            }
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}