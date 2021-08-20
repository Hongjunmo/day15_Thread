package day15_Thread;

import java.util.Scanner;

class A03 extends Thread {
	public void run() {
		for (;;) {
			try {
				System.out.println("답글이 날아옵니다");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Ex03 {
	public static void main(String[] args) {
		A03 a = new A03();
		Scanner scan = new Scanner(System.in);
		String message = null;
		a.setDaemon(true);
		a.start();
		for( ;; ) {
			System.out.print("전송 메세지 :");
			message = scan.next();
			System.out.println(message);
			if(message.equals("exit"))
				break;
		}
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
	}
}
