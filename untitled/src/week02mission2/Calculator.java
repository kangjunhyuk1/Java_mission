package week02mission2;

public class Calculator {

    int calculator(int firstNum, int secondNum, String operator) {
        int result = 0;
        if (operator == "+") {
            result = firstNum + secondNum;
        } else if (operator == "-") {
            result = firstNum - secondNum;
        } else if (operator == "*") {
            result = firstNum * secondNum;
        } else if (operator == "/") {
            result = firstNum / secondNum;
        }
        return result;
    }
}