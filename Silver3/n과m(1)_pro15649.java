import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Main {
	
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 숫자의 범위 입력
        int size = Integer.parseInt(st.nextToken()); // 크기 입력
        
        Boolean[] visit = new Boolean[n]; // 방문 여부 배열
        int[] arr = new int[size]; // 수열 저장 배열
        Arrays.fill(visit, false); // 방문 여부 false 초기화
        
        DFS(visit, arr, n, size, 0); // DFS 실행
        
    }
    
    public static void DFS(Boolean[] v, int[] arr, int n, int s, int depth) {
    	if(s == depth) { // 끝까지 내려갔다면 출력
    		for(int i = 0; i < s; i++)
    			System.out.print(arr[i] + " ");
    		System.out.println();
    	}
    	else {
	    	for(int i = 0 ; i < n; i++) {
	    		if(!v[i]) { // 방문 여부 체크
	    			v[i] = true; 
	    			arr[depth] = i + 1;
	    			DFS(v, arr, n, s, depth + 1); // 재귀적 호출
	    			
	    			v[i] = false; // 방문 후 다시 false로 지정
	    			
	    		}
    	}
    	}
    }

}
