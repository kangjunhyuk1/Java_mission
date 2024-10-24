package week02mission2;
import java.util.ArrayList;
import java.util.List;
public class Calculator {

    private final List<Double> result = new ArrayList<>();



    public double calculator(int firstNum, int secondNum, String operator) {
        if (operator.equals ("+")) {
            result.add((double) (firstNum + secondNum));
            return firstNum + secondNum;
        } else if (operator.equals ("-")) {
            result.add((double) (firstNum - secondNum));
            return firstNum - secondNum;
        } else if (operator.equals ("*")) {
            result.add((double) (firstNum * secondNum));
            return firstNum * secondNum;
        } else if (operator.equals ("/")) {
            if (secondNum == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }else {
                result.add((double) (firstNum / secondNum));
                return firstNum / secondNum;
            }
        }else {
            System.out.println("추가되지 않은 연산자입니다");
        }
        return 0.0;
    }
    public List<Double> getResult(){
        return result;
    }
    void setResult(Double result){
        this.result.add(result);
    }
    public void DeleteList(){
        result.remove(0);
    }
}