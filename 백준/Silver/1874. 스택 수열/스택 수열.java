import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {

        // 초기설정
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack= new Stack<>();

        // 1. n 입력
        int n = sc.nextInt();
        int[] inputList = new int[n];
        String[] result = new String[2*n];

        // 2. inputList 입력받기

        for(int i=0;i<n;i++){
            inputList[i] = sc.nextInt();
        }

        // 3. stack 연산
        int stackFlag = 0;
        int listFlag = 0;
        int resultFlag = 0;
        while(true){

            // push
            stackFlag++;
            stack.push(stackFlag);


            result[resultFlag] = "+";
            resultFlag++;

            // 같은 수면 pop
            while(stack.peek()==inputList[listFlag]) {
                stack.pop();
                listFlag++;

                result[resultFlag] = "-";
                resultFlag++;

                //완료
                if(stack.isEmpty())break;
            }

            // 완료
            if(stackFlag == n && stack.isEmpty())break;

            // push를 다 한 상태에서 pop했을때 숫자가 다를시 NO 출력
            if(stackFlag == n && stack.peek() != inputList[listFlag]){
                System.out.println("NO");
                sc.close();
               System.exit(0);
            }

        }

        // stack 순서 출력
        for(int i=0;i<resultFlag;i++){
            System.out.println(result[i]);
        }


        sc.close();
    }
}