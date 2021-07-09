import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/11866
// 요세푸스 문제 0
public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] setting = br.readLine().split(" ");
        int people = Integer.parseInt(setting[0]);   // 전체 인원
        int turn = Integer.parseInt(setting[1]); // 순번
        Queue<Integer> order = new ArrayDeque<>();
        List<String> killedOrder = new ArrayList<>();

        killedOrder.add("<");
        for(int person = 1; person <= people; person++) {  // 순번 부여 실제 작업 (1, 2, 3, ... n)
            order.add(person);
        }
        while(order.size() > 0) {  // 실제 로직. 더 이상 남아있는 순번이 없을 때까지 리스트에 담으며 반복한다.
            for(int i = 1; i < turn; i++) {
                order.offer(order.poll());
            }
            killedOrder.add(order.poll() + ", ");
        }
          
        // 마지막 순번 콤마 및 공백 제거
        String removeLastComma = killedOrder.get(killedOrder.size() - 1); 
        killedOrder.remove(killedOrder.get(killedOrder.size() - 1));
        removeLastComma = String.valueOf(removeLastComma.split(",")[0]); // 제거 종료 
        // 마지막 순번 콤마 및 공백 제거 종료

        // 콤마 제거된 순번을 다시 리스트에 추가
        killedOrder.add(removeLastComma); 
        killedOrder.add(">");

        // 결과 출력  
        //출력때문에 틀린 것인지 확실하지 않으나 주석처리하고 아래 코드로 변경
        // killedOrder.forEach(System.out::print); 
        String result = String.join("", killedOrder);
        System.out.println(result);
    }
}
