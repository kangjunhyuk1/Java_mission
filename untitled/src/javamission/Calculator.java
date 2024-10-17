package javamission;

public class Calculator {

    AbstractOpreation opreation;

    double calculate(String operator, int firstNum, int scondNum) {
       if (operator.equals("+")) {
           opreation = new AddOperation();
        } else if (operator.equals("-")) {
           opreation = new SubstractOperation();
        } else if (operator.equals("*")) {
           opreation = new MultiplyOperation();
        } else if (operator.equals("/")) {
           opreation = new DivideOperation();
//        } else if (operator.equals("%")) {
//           result = firstNum % secondNum;
        } else {
            System.out.println(operator + "는 잘못된 연산자 입니다");
        }
        return opreation.opreation(firstNum,scondNum);
    }
}
