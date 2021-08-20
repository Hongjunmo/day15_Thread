package day15_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class logsin {
	String id;
	String pw;
	boolean flag;
	Scanner scan = new Scanner(System.in);

	public void LLogin(String id, String pw) {
		gui g = new gui();
		if (this.id != null && this.pw != null) {
			System.out.print("id 입력 : ");
			id = scan.next();
			System.out.print("pw 입력 : ");
			pw = scan.next();
			if (this.id.equals(id) && this.pw.equals(pw)) {
				System.out.println("로그인 성공");
				flag = true;
				try {
					g.start();   //메서드를 통해 시간출력을 하면 스위치 문으로 안돌아옴 
					//스레드를 통해 실행하면 될듯?
					
				}catch(Exception e) {
					
				}
			} else {
				System.out.println("로그인 실패");
			}
		} else {
			System.out.println("회원가입 하세요");
		}

	}

	public void sign() {
		System.out.print("id 입력 : ");
		id = scan.next();
		System.out.print("pw 입력 : ");
		pw = scan.next();
		System.out.println("가입 성공");
	}
}

class win7 extends logsin {
	public void windows() {
		LLogin(id, pw);
		if (flag == true) {
			System.out.println("윈도우 켜짐");
		} else {

			System.out.println("윈도우 실행 안됨");
		}

	}

}

class Time123 extends win7 {
	public void sec() {
		for (int i = 0; i < 10; i++) {
			SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
			Date time = new Date();
			String time1 = format2.format(time);
			System.out.println(time1);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class Quiz01_Win7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Time123 w = new Time123();
		String id = null, pw = null;
//		w.sec();

		while (true) {
			System.out.println("1. 로그인 2. 회원가입");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				w.LLogin(id, pw);
				if (w.flag == true) {
					System.out.println("===== 환영합니다 =====");
					System.out.println("1.기능On 2.off");
					System.out.print(">>>");
					int ch = scan.nextInt();
					if (ch == 1) {
						System.out.println("윈도우 켜짐!!");
					} else if (ch == 2) {
						System.out.println("시스템 종료");
						System.exit(0);
					}
				}
				break;
			case 2:
				w.sign();
				break;
			}
		}
	}
}
