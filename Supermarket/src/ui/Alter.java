package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//�޸Ŀ����Ϣ����
public class Alter extends JFrame{
	Container cp=getContentPane();//����
	public Alter() {
		setLayout(null);//��ܲ���
		JLabel l_trade=new JLabel("��Ʒ����");//��Ʒ������
		l_trade.setBounds(75,88,54,15);
		cp.add(l_trade);
		
		JLabel l_rnumber = new JLabel("�������");//���������
		l_rnumber.setBounds(75,124,54,15);
		cp.add(l_rnumber);
		
		JLabel l_suppy = new JLabel("��Ӧ��");//��Ӧ����
		l_suppy.setBounds(75,163,54,15);
		cp.add(l_suppy);
		
		JTextField t_trade=new JTextField();//��Ʒ���������
		t_trade.setBounds(160,85,201,21);
		cp.add(t_trade);
		
		JTextField t_rnumber=new JTextField();//������������
		t_rnumber.setBounds(160,121,201,21);
		cp.add(t_rnumber);
		
		JTextField t_suppy=new JTextField();//��Ӧ�������
		t_suppy.setBounds(160,160,201,21);
		cp.add(t_suppy);
		
		JButton j_alter=new JButton("�޸�");//�޸İ�ť
		j_alter.setBounds(75,243,93,23);
		cp.add(j_alter);
		
		JButton j_reset=new JButton("����");//���ð�ť
		j_reset.setBounds(263,243,93,23);
		cp.add(j_reset);
		
		//�޸İ�ť��������¼�
		j_alter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  trade=t_trade.getText();//���ı����л�ȡ�������Ʒ���ơ������������Ӧ��
				String  rnumber=t_rnumber.getText();
				String  suppy=t_suppy.getText();
				
				/*
				 * ���ݿ�����
				 * 
				 * ��Ů��д
				 * 
				 */
			}
		}
		);
		
		j_reset.addActionListener(new ActionListener() {//���ð�ť��������¼�
			public void actionPerformed(ActionEvent e) {
				t_trade.setText("");
				t_rnumber.setText("");
				t_suppy.setText("");		
				}
		});

		
		setTitle("�޸���Ʒ��Ϣ");
		setSize(455,375);//�����С
		setVisible(true);//�������ʾ
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Alter����
		Alter alter=new Alter();

	}

}
