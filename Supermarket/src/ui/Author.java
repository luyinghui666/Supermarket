package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//�������ǽ��棨������Ϣ������
public class Author extends JFrame{
	Container cp=getContentPane();//����
	public Author() {
		setLayout(null);//��ܲ���
		setSize(450,300);//�����С
		setTitle("������Ϣ");
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
		
		JLabel label = new JLabel("�㶫��ҵ��ѧ����ѧԺ");
		label.setFont(new Font("����", Font.BOLD, 18));
		label.setBounds(73, 10, 189, 49);
		cp.add(label);
		
		JLabel label2 = new JLabel("16�����4��");
		label2.setFont(new Font("����", Font.BOLD, 13));
		label2.setBounds(73, 114, 144, 15);
		cp.add(label2);
		
		JLabel label3 = new JLabel("��9��");
		label3.setFont(new Font("����", Font.BOLD, 13));
		label3.setBounds(73, 149, 94, 15);
		cp.add(label3);
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Author����
		Author author=new Author();

	}

}
