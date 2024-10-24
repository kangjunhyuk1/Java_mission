package mission;

import java.util.Scanner;

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


            // calculator의 값을 returnNum에 넣어주기
            int returnNum = calculator.calculate(firstNum, secondNum, operator);
            // 계산한 값을 출력함과 동시에 setList로 list에 저장
            System.out.println(returnNum);
            calculator.setList(returnNum);
            // 반복문이 끝나고 그동안 리스트에 들어간 값들을 가져옴
            System.out.println(calculator.getList());

            System.out.println("결과를 삭제하시겠습니까?(yes/no)");
            String yes = sc.nextLine();
                if (yes.equals("yes")) {
                    calculator.setDeleteList();
                    System.out.println(calculator.getList());
                }
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}
