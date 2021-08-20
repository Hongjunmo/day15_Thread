package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {

		JFrame frame = new JFrame("TEST");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		
		c.add(label);
		
		frame.setLocation(500,200);//gui 위치 가로,세로
		// 프레임 크기
		frame.setPreferredSize(new Dimension(500,200)); // gui 사이즈 매개변수 디멘션
		frame.pack(); //설정값 적용
		
		Font font = new Font(null ,0, 32);
		// 글꼴 , 스타일, 사이즈
		
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i =0; ; i++) {
			label.setText(i+"ㅎㅇㅎㅇㅎㅇ");
		}
		
		
		
		
		
		
	}
}
