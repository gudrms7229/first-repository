package hyeoung.test.eclipse;

import java.util.Scanner;

public class test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("가위 바위 보 게임입니다 가위,바위,보 중 하나를 입력하시오 ");
		
		String user = scan.nextLine();
		System.out.printf("사용자 : %s\n", user);
		
		int random = (int)(Math.random() * 3);
		String computer;
		if (random == 0)
			computer = "가위";
		else if (random == 1)
			computer = "바위";
		else
			computer = "보";
		
		System.out.printf("컴퓨터 : %s\n", computer);
		
		if (user.equals("가위")) {
			if(computer.equals("보")) {
				System.out.println("당신은 이겼습니다.");
				return;
			}else if (computer.equals("바위")) {
			System.out.println("당신은 졌습니다.");
				return;
			}else { 
				System.out.println("당신은 비겼습니다");
				return;
			}	
		}
		if (user.equals("바위")) {
			if(computer.equals("가위")) {
				System.out.println("당신은 이겼습니다.");
				return;
			}else if (computer.equals("보")) {
			System.out.println("당신은 졌습니다.");
				return;
			}else { 
				System.out.println("당신은 비겼습니다");
				return;
			}	
		}
		if (user.equals("보")) {
			if(computer.equals("바위")) {
				System.out.println("당신은 이겼습니다.");
				return;
			}else if (computer.equals("가위")) {
			System.out.println("당신은 졌습니다.");
				return;
			}else { 
				System.out.println("당신은 비겼습니다");
				return;
			}	
		}
		
		scan.close();
		}

}
