package ����_2017112823_2017112823;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
import java.util.Vector;
import javax.swing.filechooser.*;
import java.io.*;

public class ManageEx extends JFrame{
	JTextArea ta1, ta2;
	Vector<String> name = new Vector<String>();
	Vector<String> num1 = new Vector<String>();
	Vector<String> num2 = new Vector<String>();
	Vector<String> phone = new Vector<String>();
	Vector<String> address = new Vector<String>();
	
	ManageEx(){
		JFrame f = new JFrame();
		setTitle("����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		
		
		contentPane.setLayout(null);
		
		JLabel j1 = new JLabel("��������");
		j1.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,20));
		j1.setLocation(10,0);
		j1.setSize(90,30);
		contentPane.add(j1);
		
		JPanel p1 = new JPanel();
		p1.setLocation(10,10);
		p1.setSize(430,400);
		p1.setLayout(null);
		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		p1.setBorder(border);
		contentPane.add(p1);
		
		JLabel j4 = new JLabel("�̸�:");
		j4.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,17));
		j4.setLocation(50,50);
		j4.setSize(70,30);
		p1.add(j4);
		JLabel j5 = new JLabel("�ֹι�ȣ:");
		j5.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,17));
		j5.setLocation(15,130);
		j5.setSize(100,30);
		p1.add(j5);
		JLabel j6 = new JLabel("��ȭ��ȣ:");
		j6.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,17));
		j6.setLocation(15,220);
		j6.setSize(100,30);
		p1.add(j6);
		JLabel j7 = new JLabel("�ּ�:");
		j7.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,17));
		j7.setLocation(50,280);
		j7.setSize(100,70);
		p1.add(j7);
		
		JTextField jf1 = new JTextField();
		jf1.setLocation(100,30);
		jf1.setSize(310,70);
		p1.add(jf1);
		JTextField jf2 = new JTextField();
		jf2.setLocation(100,110);
		jf2.setSize(150,70);
		p1.add(jf2);
		JTextField jf3 = new JTextField();
		jf3.setLocation(260,110);
		jf3.setSize(150,70);
		p1.add(jf3);
		JTextField jf4 = new JTextField();
		jf4.setLocation(100,200);
		jf4.setSize(310,70);
		p1.add(jf4);
		JTextField jf5 = new JTextField();
		jf5.setLocation(100,280);
		jf5.setSize(310,70);
		p1.add(jf5);
		
		
		JLabel j2 = new JLabel("�����˻�");
		j2.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,20));
		j2.setLocation(15,440);
		j2.setSize(90,30);
		contentPane.add(j2);
		
		JPanel p2 = new JPanel();
		p2.setLocation(10, 450);
		p2.setSize(430,400);
		p2.setBorder(border);
		contentPane.add(p2);
		p2.setLayout(null);
		
		JLabel j8 = new JLabel("�˻�:");
		j8.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,15));
		j8.setLocation(10,60);
		j8.setSize(40,30);
		p2.add(j8);
		JTextField jf6 = new JTextField();
		jf6.setLocation(75,50);
		jf6.setSize(130,70);
		p2.add(jf6);
		JTextField jf7 = new JTextField();
		jf7.setLocation(210,50);
		jf7.setSize(130,70);
		p2.add(jf7);
		JButton jb1 = new JButton("�˻�");
		jb1.setLocation(350,50);
		jb1.setSize(60,70);
		jb1.setBackground(new Color(204,204,204));
		p2.add(jb1);
		
		JPanel p5 = new JPanel();
		p5.setLocation(10, 130);
		p5.setSize(400,200);
		p2.add(p5);
		p5.setLayout(new FlowLayout());
		
		ta1 = new JTextArea(10,25);
		JScrollPane scroll = new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		p5.add(scroll);
		
		JButton jb2 = new JButton("<<");
		jb2.setLocation(150,340);
		jb2.setSize(50,50);
		jb2.setBackground(new Color(204,204,204));
		p2.add(jb2);
		JButton jb3 = new JButton(">>");
		jb3.setLocation(210,340);
		jb3.setSize(50,50);
		jb3.setBackground(new Color(204,204,204));
		p2.add(jb3);
		
		JLabel j3 = new JLabel("��������Ȯ��");
		j3.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,20));
		j3.setLocation(500,0);
		j3.setSize(150,30);
		contentPane.add(j3);
				
		JPanel p3 = new JPanel();
		p3.setLocation(480,10);
		p3.setSize(600,840);
		p3.setBorder(border);
		contentPane.add(p3);
		p3.setLayout(null);
		
		JPanel p4 = new JPanel();
		p4.setLocation(20,110);
		p4.setSize(560,650);
		p3.add(p4);
		p4.setLayout(new FlowLayout());
		
		ta2 = new JTextArea(35,50);
		JScrollPane scrollPane = new JScrollPane(ta2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		p4.add(scrollPane);
				
		JButton jb4 = new JButton("��ü����");
		jb4.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,17));
		jb4.setLocation(20, 50);
		jb4.setSize(110,50);
		jb4.setBackground(new Color(204,204,204));
		
		p3.add(jb4);
		JLabel j9 = new JLabel("<--�̰��� ��������ü���Ⱑ �˴ϴ�.");
		j9.setFont(new Font("�����ٶ󸶹ٻ�", Font.BOLD,15));
		j9.setLocation(150,50);
		j9.setSize(300,50);
		p3.add(j9);
		
		JPanel jp4 = new JPanel();
		jp4.setLocation(20,780);
		jp4.setSize(560,50);
		p3.add(jp4);
		jp4.setLayout(new FlowLayout());
		JButton jb5 = new JButton("���");
		jb5.setSize(100,50);
		jb5.setBackground(new Color(204,204,204));
		jp4.add(jb5);
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(jf1.getText().equals("")) && !(jf2.getText().equals("")) && !(jf3.getText().equals("")) && !(jf4.getText().equals("")) && !(jf5.getText().equals(""))) {
					if(num2.contains(jf3.getText()) == true) {
						JOptionPane.showMessageDialog(null, "�ֹε�� ��ȣ ���ڸ��� ��ġ�ϴ� ���������� �����մϴ�.");
					}
					else if(phone.contains(jf4.getText()) == true) {
						JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� ��ġ�ϴ� ���������� �����մϴ�.");

					}
					else {
						name.add(jf1.getText());
						num1.add(jf2.getText());
						num2.add(jf3.getText());
						phone.add(jf4.getText());
						address.add(jf5.getText());
						ta2.setText("");
						ta2.append("������ �� �Ǿ����ϴ�.\n");
						ta2.append("���� "+ name.size() +"���� �����Ͱ� �����մϴ�.");
					}
				}
			}	
		});
		
		JButton jb6 = new JButton("����");
		jb6.setSize(100,50);
		jb6.setBackground(new Color(204,204,204));
		jp4.add(jb6);
		JButton jb7 = new JButton("����");
		jb7.setSize(100,50);
		jb7.setBackground(new Color(204,204,204));
		jp4.add(jb7);
		JButton jb8 = new JButton("Clear");
		jb8.setSize(100,50);
		jb8.setBackground(new Color(204,204,204));
		jp4.add(jb8);
		JButton jb9 = new JButton("����");
		jb9.setSize(100,50);
		jb9.setBackground(new Color(204,204,204));
		jp4.add(jb9);
		JButton jb10 = new JButton("�ε�");
		jb10.setSize(100,50);
		jb10.setBackground(new Color(204,204,204));
		jp4.add(jb10);
		JButton jb11 = new JButton("����");
		jb11.setSize(100,50);
		jb11.setBackground(new Color(204,204,204));
		jp4.add(jb11);
		jb11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb5.setEnabled(false);
				jb8.setEnabled(false);
				ta2.setText("");
				if(name.size() == 0) {
					ta2.append("��ϵ� ���������� �����ϴ�.");
				}
				else {
				ta2.append("��ü �ο��� �������� �Դϴ�.\n");
				ta2.append("�̸�\t�ֹι�ȣ\t\t��ȭ��ȣ\t�ּ�\n");
				ta2.append("====================================================================================\n");
				for(int i = 0; i< name.size();i++) {
					ta2.append(name.elementAt(i)+"\t");
					ta2.append(num1.elementAt(i));
					ta2.append(num2.elementAt(i));
					ta2.append("\t"+phone.elementAt(i)+"\t");
					ta2.append(address.elementAt(i));
					ta2.append("\n");
				}
				ta2.append("====================================================================================\n");
				ta2.append("��"+name.size()+"��");
				}
			}
		});
		
		jb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog = new FileDialog(f,"����",FileDialog.SAVE);
				dialog.setVisible(true);
				String fName = dialog.getDirectory() + dialog.getFile();
				
				try{
					FileWriter fout = new FileWriter(fName);
					
					for(int i = 0; i< name.size();i++) {
						fout.write(name.elementAt(i)+"\t");
						fout.write(num1.elementAt(i));
						fout.write(num2.elementAt(i));
						fout.write("\t"+phone.elementAt(i)+"\t");
						fout.write(address.elementAt(i));
						fout.write("\n");
					}
					ta2.setText("");
					ta2.append("����Ϸ�!\n");
					ta2.append(fName + "�� �̸����� ����Ǿ����ϴ�.");
					fout.close();
				}catch(IOException e2) {
					ta2.setText("");
					ta2.append("���� ����");
				}
				
			}
		});
		
		jb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog = new FileDialog(f,"����",FileDialog.LOAD);
				dialog.setVisible(true);
				String fName = dialog.getDirectory() + dialog.getFile();
				
				try{
					BufferedReader in = new BufferedReader(new FileReader(fName));
					String temp;
					String t;
					int i = 0;
					while((temp = in.readLine())!= null) {
						if((name.size() -1) >= i && name.size() != 0) {
							name.remove(i);
							num1.remove(i);
							num2.remove(i);
							phone.remove(i);
							address.remove(i);
						}
						StringTokenizer st = new StringTokenizer(temp,"\t");
						String T = st.nextToken();
						
						t= st.nextToken();
						String t1=(t).substring(6);
						String t2 =t.substring(0,6);
						
						if(num2.contains(t1)) {
							ta2.setText("�ε� �� ������ �ֹι�ȣ ���ڸ� ���� ���� (�̸�: "+T+") (��)�� �߰ߵǾ� �ش� ������ �����ϰ� �ε� �մϴ�.\n");
						}
						else {
							name.add(i,T);
							num2.add(i,t1);
							num1.add(i,t2);
							phone.add(i,st.nextToken());
							address.add(i,st.nextToken());
						
						i++;
						}
					}
					
					
					ta2.append("�����б�Ϸ�!\n");
					ta2.append(fName + "�� ���Ϸκ��� �б⸦ �Ϸ��Ͽ����ϴ�.");
					in.close();
				}catch(IOException e2) {
					ta2.setText("");
					ta2.append("���� ����");
				}
			}
		});
		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf1.setText("");
				jf2.setText("");
				jf3.setText("");
				jf4.setText("");
				jf5.setText("");
			}
		});
		
		jf1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				jb8.setEnabled(true);
			}		
		});
		
		jf5.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if(!(jf1.getText().equals("")) && !(jf2.getText().equals("")) && !(jf3.getText().equals("")) && !(jf4.getText().equals("")) && !(jf5.getText().equals(""))) {} 
				else 
					jb5.setEnabled(true);
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta1.setText("");
				jb5.setEnabled(false);
				jb8.setEnabled(false);
				if(!(jf6.getText().equals("")) && !(jf7.getText().equals(""))) {
					
					if(num1.indexOf(jf6.getText()) == -1 || num2.indexOf(jf7.getText()) == -1) {
						ta1.setText("��ġ�ϴ� ������ �����ϴ�.");
					}
					else {
					int m = num1.indexOf(jf6.getText());
					int n = num2.indexOf(jf7.getText());
						if( m == n ) {
							ta1.append("\n");
							ta1.append("  �̸� :  " + name.elementAt(m)+"\n");
							ta1.append("  �ֹι�ȣ :  " + num1.elementAt(m) + "-" + num2.elementAt(m)+"\n");
							ta1.append("  ��ȭ��ȣ :  " + phone.elementAt(m)+"\n");
							ta1.append("  �ּ� :  " + address.elementAt(m)+"\n");
							String year = num1.elementAt(m).substring(0,2);
							String month = num1.elementAt(m).substring(2,4);
							String date = num1.elementAt(m).substring(4,6);
						
							int century = Integer.parseInt(num2.elementAt(n).substring(0,1));
							if( century ==1 || century == 2) {
								ta1.append("  ������� :  19"+ year+"�� "+ month+"�� "+date+"��");
							}
							else if(century == 3 || century == 4) {
								ta1.append("  ������� :  20"+ year+"�� "+ month+"�� "+date+"��");
							}	
						}
						else if((num1.elementAt(m)).equals(num1.elementAt(n))){
							ta1.append("\n");
							ta1.append("  �̸� :  " + name.elementAt(n)+"\n");
							ta1.append("  �ֹι�ȣ :  " + num1.elementAt(n) + "-" + num2.elementAt(n)+"\n");
							ta1.append("  ��ȭ��ȣ :  " + phone.elementAt(n)+"\n");
							ta1.append("  �ּ� :  " + address.elementAt(n)+"\n");
							String year = num1.elementAt(n).substring(0,2);
							String month = num1.elementAt(n).substring(2,4);
							String date = num1.elementAt(n).substring(4,6);
						
							int century = Integer.parseInt(num2.elementAt(n).substring(0,1));
								if( century ==1 || century == 2) {
									ta1.append("  ������� :  19"+ year+"�� "+ month+"�� "+date+"��");
								}
								else if(century == 3 || century == 4) {
									ta1.append("  ������� :  20"+ year+"�� "+ month+"�� "+date+"��");
								}	
						}
						else {
							ta1.setText("�ǹٸ� �Է��� �ƴմϴ�.");
						}
					}
				jf6.setText("");
				jf7.setText("");
				}
			}	
					
		});
		
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Edit01(name, num1, num2, phone, address,ta2);
				
			}
		});
		
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Delete(name, num1, num2, phone, address, ta2);
			}
		});
		
		setVisible(true);
		setSize(1100,900);
		
	}
	public static void main(String[] args) {
		new ManageEx();
	}
}