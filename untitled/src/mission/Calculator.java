package mission;
import java.util.ArrayList;

public class Calculator {
    // main에서 계산한 값을 넣을 배열선언
    private ArrayList<Integer> list = new ArrayList<>();

    public int calculate(int firstNum, int secondNum, String operator) {
        if (operator.equals("+")) {
            return firstNum + secondNum;
        } else if (operator.equals("-")) {
            return firstNum - secondNum;
        } else if (operator.equals("*")) {
            return firstNum * secondNum;
        } else if (operator.equals("/") && secondNum != 0) {
            // 주의 : 리턴값은 항상 마지막에 있어야함 만약 리턴값 아래에 if문이 존재할 경우 if문에 오류발생
            if (secondNum == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            return firstNum / secondNum;
        } else {
            System.out.println(operator + "는 잘못된 연산자입니다");
        }
        // 예외처리를 해야하지만 아직 못배웠기에 리턴값으로 둠
        return 0;
    }
    // private으로 캡슐화된 배열에 접근하기 위해 Getter,Setter사용
    // Setter를 사용할 때는 반환값이 없기에 void사용 (보통 배열값을 수정하는건 add로 충분함)
    public void setList (int num1) {
        list.add(num1);
    }
    // Getter는 반환값이 필요함 이때 배열을 반환한다면 반환하는 배열의 타입과 같은 배열이 들어가야함
    public ArrayList<Integer> getList() {
        return list;
    }
    public void setDeleteList() {
        list.remove(0);
    }
}
