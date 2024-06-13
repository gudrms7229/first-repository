package hyeoung.test.eclipse;

import java.util.Scanner;

public class test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("값 1 :");
		int a = input.nextInt();
		
		System.out.print("부호 (+,-,*,/)중에 입력하시오");
		String b = input.next();
		
		System.out.print("값 2 :");
		int c = input.nextInt();
		
		input.close();
		
		int result=0;
		
		if(b.equals("+")) {
			result = a+c;
		}else if (b.equals("-")) {
			result = a-c;
		}else if (b.equals("*")) {
			result = a*c;
		}else if (b.equals("/")) {
			result = a/c;
		}else {
			System.out.println("등록되지 않은 부호입니다.");
			return;
		}
		
		System.out.printf("=> %d %s %d = %d\n",a,b,c,result);
	} 
			
	}

