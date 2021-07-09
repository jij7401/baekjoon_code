jij74010 코인설정로그아웃
Toggle navigationLogo

 
1
import java.io.BufferedReader;
2
import java.io.BufferedWriter;
3
import java.io.IOException;
4
import java.io.InputStreamReader;
5
import java.io.OutputStreamWriter;
6
import java.util.*;
7
​
8
public class Main {
9
​
10
    
11
    public static void main(String[] args) throws NumberFormatException, IOException {
12
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
13
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
14
        Stack<Integer> stack = new Stack<Integer>();
15
        
16
        int testcase = Integer.parseInt(br.readLine());
17
        int i;
18
        for(i=0;i<testcase;i++) {
19
            String s = br.readLine();
20
            int value;
21
            String[] tmp;
22
            
23
            if(s.matches("push.*")) {
24
                tmp = s.split(" ");
25
                value = Integer.parseInt(tmp[1]);
26
                stack.push(value);
27
            }
28
            
29
            else if(s.contentEquals("pop")) {
30
                if(stack.empty()) {
31
                    bw.write("-1"+"\n");
32
                }
33
                else {
34
                    bw.write(stack.pop()+"\n");
35
                }
36
            }
37
            
38
            else if(s.contentEquals("empty")) {
39
                if(stack.empty()) {
40
                    bw.write("1"+"\n");
41
                }else {
42
                    bw.write("0"+"\n");
43
                }
44
            }
45
            
46
            else if(s.contentEquals("top")) {
47
                if(stack.empty()) {
48
                    bw.write("-1"+"\n");
49
                }else {
50
                    bw.write(stack.peek()+"\n");
51
                }
52
            }
53
            else if(s.contentEquals("size")) {
54
                bw.write(stack.size()+"\n");
55
            }
56
            else {}
57
        }
58
        bw.flush();
59
        bw.close();
60
        
61
        
62
    }
63
    
64
}
소스코드 공개공개비공개맞았을 때만 공개
제출 번호	아이디	문제	문제 제목	결과	메모리	시간	언어	코드 길이	제출한 시간
24711471	jij7401	10828	스택	맞았습니다!!	34356	412	Java 11	1341	6달 전
내 소스를 본 사람

 
Baekjoon Online Judge
소개
뉴스
생중계
설문조사
블로그
캘린더
기부하기
기능 추가 요청
스페셜 저지 제작
실험실
채점 현황
채점 현황
문제
문제
단계별로 풀어보기
알고리즘 분류
새로 추가된 문제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		
		int testcase = Integer.parseInt(br.readLine());
		int i;
		for(i=0;i<testcase;i++) {
			String s = br.readLine();
			int value;
			String[] tmp;
			
			if(s.matches("push.*")) {
				tmp = s.split(" ");
			    value = Integer.parseInt(tmp[1]);
			    stack.push(value);
			}
			
			else if(s.contentEquals("pop")) {
				if(stack.empty()) {
					bw.write("-1"+"\n");
				}
				else {
					bw.write(stack.pop()+"\n");
				}
			}
			
			else if(s.contentEquals("empty")) {
				if(stack.empty()) {
					bw.write("1"+"\n");
				}else {
				    bw.write("0"+"\n");
				}
			}
			
			else if(s.contentEquals("top")) {
				if(stack.empty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(stack.peek()+"\n");
				}
			}
			else if(s.contentEquals("size")) {
				bw.write(stack.size()+"\n");
			}
			else {}
		}
		bw.flush();
		bw.close();
		
		
	}
	
}

