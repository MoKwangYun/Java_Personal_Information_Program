package 모광윤_2017112823_2017112823;


import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Delete extends JFrame{
	Delete(Vector<String> name, Vector<String> num1, Vector<String> num2, Vector<String> phone, Vector<String> address, JTextArea ta2){
		setTitle("삭제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		setLocation(500,400);
		
		JPanel p = new JPanel();
		p.setLocation(0, 0);
		p.setSize(430,140);
		c.add(p);
		p.setLayout(null);
		
		JLabel jl1 = new JLabel("이름:");
		jl1.setSize(70,50);
		jl1.setLocation(10,10);
		p.add(jl1);
		
		JLabel jl2 = new JLabel("주민번호:");
		jl2.setSize(70,50);
		jl2.setLocation(10,70);
		p.add(jl2);
		
		JTextField jtf1 = new JTextField();
		jtf1.setSize(310,50);
		jtf1.setLocation(70,10);
		p.add(jtf1);
		
		JTextField jtf2 = new JTextField();
		jtf2.setSize(150,50);
		jtf2.setLocation(70,70);
		p.add(jtf2);
		
		JTextField jtf3 = new JTextField();
		jtf3.setSize(150,50);
		jtf3.setLocation(230,70);
		p.add(jtf3);
		
		JPanel p2 = new JPanel();
		p2.setLocation(0, 140);
		p2.setSize(430,100);
		c.add(p2);
		p2.setLayout(null);
		
		JButton jbt1 = new JButton("삭제");
		jbt1.setSize(70,50);
		jbt1.setLocation(220, 20);
		jbt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = jtf1.getText();
				String numb1 = jtf2.getText();
				String numb2 = jtf3.getText();
				
				if(num2.contains(numb2) && num1.contains(numb1) && name.contains(n)) {
					int index = num2.indexOf(numb2);
					
					if(num1.get(index).equals(numb1) && name.get(index).equals(n)) {
						
						name.remove(index);
						num1.remove(index);
						num2.remove(index);
						phone.remove(index);
						address.remove(index);
						
						ta2.setText("");
						ta2.append("다음의 사용자를 데이터 저장소에서 삭제 하였습니다." +"\n");
						ta2.append("정보!!!\n");
						ta2.append("이름: " + n + "\n");
						ta2.append("주민번호: "+ numb1 + "-" + numb2 + "\n");
						ta2.append("현재 남은 데이터 개수: "+name.size()+"개\n"); 
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "정보가 일치하지 않습니다.");
						jtf1.setText("");
						jtf2.setText("");
						jtf3.setText("");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "정보가 일치하지 않습니다.");
					jtf1.setText("");
					jtf2.setText("");
					jtf3.setText("");
				}
				
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
		
		
		setVisible(true);
		setSize(430,270);
	}
}

