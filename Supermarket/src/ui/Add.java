package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//�����Ʒ�ɹ�����
public class Add extends JFrame{
	Container cp=getContentPane();//����
	public Add() {
		setLayout(null);//��ܲ���
		
		JLabel l_trade=new JLabel("��Ʒ����");//��Ʒ������
		l_trade.setBounds(75,88,54,15);
		cp.add(l_trade);
		
		JLabel l_addamount = new JLabel("�������");//���������
		l_addamount.setBounds(75,124,54,15);
		cp.add(l_addamount);
		
		JLabel l_suppy = new JLabel("��Ӧ��");//��Ӧ����
		l_suppy.setBounds(75,163,54,15);
		cp.add(l_suppy);
		
		JTextField t_trade=new JTextField();//��Ʒ���������ı���
		t_trade.setBounds(160,85,201,21);
		cp.add(t_trade);
		
		JTextField t_addamount=new JTextField();//������������ı���
		t_addamount.setBounds(160,121,201,21);
		cp.add(t_addamount);
		
		JTextField t_suppy=new JTextField();//��Ӧ�������ı���
		t_suppy.setBounds(160,160,201,21);
		cp.add(t_suppy);
		
		JButton j_goodsadd=new JButton("ȷ��");//ȷ�ϰ�ť
		j_goodsadd.setBounds(75,243,93,23);
		cp.add(j_goodsadd);
		
		JButton j_reset=new JButton("����");//���ð�ť
		j_reset.setBounds(263,243,93,23);
		cp.add(j_reset);
		
		j_goodsadd.addActionListener(new ActionListener() {//ȷ����ӵ��������ť
			public void actionPerformed(ActionEvent e) {
				String  trade=t_trade.getText();		//���ı����л�ȡ������Ʒ���ơ������������Ӧ����Ϣ
				String  addamount=t_addamount.getText();
				String  suppy=t_suppy.getText();
				
				/*
				 * ���ݿ�����
				 * ��Ů��д
				 * 
				 * 
				 */
			}
		}
		);
		
		j_reset.addActionListener(new ActionListener() {//���ð�ť���������ť
			public void actionPerformed(ActionEvent e) {
				t_trade.setText("");
				t_addamount.setText("");
				t_suppy.setText("");		
				}
		});

		
		setTitle("��������");
		setSize(455,375);//�����С
		setVisible(true);//�������ʾ
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);

	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Add����
		Add add=new Add();

	}

}
