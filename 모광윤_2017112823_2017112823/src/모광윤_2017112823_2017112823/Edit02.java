package 모광윤_2017112823_2017112823;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Edit02 extends JFrame{
	Edit02(int index, String name, String num1, String num2, Vector<String> phone, Vector<String> address,JTextArea ta2){
		
		setTitle("수정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cc = getContentPane();
		cc.setLayout(null);
		setLocation(500,400);
		
		JPanel p = new JPanel();
		p.setSize(420, 250);
		cc.add(p);
		p.setLayout(null);
		
		JLabel jl1 = new JLabel("이름:" + name);
		jl1.setSize(400,50);
		jl1.setLocation(30,10);
		p.add(jl1);
		
		JLabel jl2 = new JLabel("주민번호:" + num1 + " - " + num2);
		jl2.setSize(400,50);
		jl2.setLocation(10,70);
		p.add(jl2);
		
		
		JLabel jl3 = new JLabel("전화번호:");
		jl3.setSize(70,50);
		jl3.setLocation(10,130);
		p.add(jl3);
		
		JLabel jl4 = new JLabel("주소:");
		jl4.setSize(70,50);
		jl4.setLocation(30,190);
		p.add(jl4);
		
		String ph = phone.get(index);
		String addr = address.get(index);
		
		JTextField jtf1 = new JTextField();
		jtf1.setSize(310,50);
		jtf1.setLocation(70,130);
		jtf1.setText(ph);
		p.add(jtf1);
		
		JTextField jtf2 = new JTextField();
		jtf2.setSize(150,50);
		jtf2.setLocation(70,190);
		jtf2.setText(addr);
		p.add(jtf2);
		
		JPanel p2 = new JPanel();
		p2.setLocation(0, 250);
		p2.setSize(430,100);
		cc.add(p2);
		p2.setLayout(null);
		
		JButton jbt1 = new JButton("수정");
		jbt1.setSize(70,50);
		jbt1.setLocation(220, 20);
		jbt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pp = jtf1.getText();
				String ad = jtf2.getText();
				
				phone.set(index,pp);
				address.set(index, ad);
				ta2.setText("성공적으로 수정하였습니다.");
				dispose();
			}
		});
		p2.add(jbt1);
		
		
		JButton jbt2 = new JButton("취소");
		jbt2.setSize(70,50);
		jbt2.setLocation(300, 20);
		jbt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		p2.add(jbt2);
		
		setSize(430,400);
		setVisible(true);
		
	}
}
