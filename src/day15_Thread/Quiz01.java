package day15_Thread;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

class gui extends Thread {
	JLabel label = new JLabel();

	public void run() {

		JFrame frame = new JFrame();
		Container c = frame.getContentPane();
		c.add(label);
		frame.setLocation(500, 200);// gui 위치 가로,세로
		// 프레임 크기
		frame.setPreferredSize(new Dimension(500, 200)); // gui 사이즈 매개변수 디멘션
		frame.pack(); // 설정값 적용
		Font font = new Font(null, 0, 32);
		// 글꼴 , 스타일, 사이즈
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (;;) {
			SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
			Date time = new Date();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String time1 = format2.format(time);
			label.setText(time1);
		}
	}
}

//class timer extends Thread  {
//	public void run() {
//		setDaemon(true);
//		for (int i = 0;; i++) {
//			SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
//			Date time = new Date();
//			String time1 = format2.format(time);
//			System.out.println(time1);
//			try {
//				TimeUnit.SECONDS.sleep(1);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		}
//
//	}
//}
public class Quiz01 {
	public static void main(String[] args) {

	}
}
