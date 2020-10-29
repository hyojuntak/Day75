package JC.Day75;
import java.util.Arrays;
import java.util.Scanner;

public class Algorism {
    


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);	//Scanner 객체 생성

        String s = sc.next();			//String s로 입력 받기
        int [] ss = new int [s.length()];		//String 값 -> int 값으로 변경하여 담을 객체 ss 생성
        for (int i = 0; i < ss.length; i++) {		//ss배열 길이만큼 돌면서
            int ee = s.charAt(i)-'0';		//int ee 에 String 값 int형으로 변형하여 담음
            ss[i] =ee;				//int 형 배열 ss[i]에 담음
        }              

        int [] zero = new int [ss.length];		//ss의 길이만큼 0인 배열만들기
        int [] one = new int [ss.length];		//ss의 길이만큼 1인 배열만들기
        
        for (int i = 0; i < zero.length; i++) {	//0인 배열만큼 돌면서
            zero[i] =0;				//0넣기
        }		
        for (int i = 0; i < one.length; i++) {	//1인 배열만큼 돌면서
            one[i] =1;				//1넣기 
        }
        // System.out.println(Arrays.equals(ss,zero));
        int z_count = 0;			//z_count 변수 생성 후 초기화
        int o_count = 0;			//o_count 변수 생성 후 초기화
        int count = 0;				//진짜 count 할 거 생성 후 초기화
        			
        while (true) {				//정해지 있지 않음 (몇번만에 끝날지 모름)
            
            for (int i = 0; i < ss.length-1; i++) {	//for문 돌면서 ss길이-1 만큼
                
                if(ss[i]!=ss[i+1]){			// 앞과 뒤가 다르면
                    if(i+1==ss.length-1){		// ex) 0001 일 경우 1 을 0으로 바꿈
                        if(ss[i+1]==0){ss[i+1]=1;}
                        else{ss[i+1]=0;}
                        count++;			//count 출력하고
                        System.out.println(count);	
                        System.exit(0);		//정상종료

                    }

                    if(ss[i+1]==0){			//i+1이 0이라면
                        ss[i+1]=1;			//1로 바꿔라
                        o_count++;			
                    }
                    else if(ss[i+1]==1){		//i+1이 1이라면
                        ss[i+1]=0;			//0로 바꿔라
                        z_count++;
                    }

                    if((o_count>=1 && ss[i+1]==ss[i+2])|| (z_count>=1 && ss[i+1]==ss[i+2])){	//o_count가 1이상이고 앞에 값과 앞앞값이 같으면
                        count++;
                        //System.out.println(Arrays.toString(ss));	
                    }
                    
                }
                
             }
            //System.out.println(Arrays.toString(ss));
            if(Arrays.equals(ss, zero) || Arrays.equals(ss, one)){break;}		//ss가 전부 0이거나 1이면 나가라
            
        }
        System.out.println(count);		//count 출력하고 끝
        
    }
}
