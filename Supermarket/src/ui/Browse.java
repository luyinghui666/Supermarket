package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//��������Ϣ��
public class Browse extends JFrame{
	public Browse() {
		setTitle("�ֿ���Ʒ��Ϣ");
		//���ô���Ĵ�С
		setSize(500,500);
		
		/*
		 * 
		 * ����һ���������ݿ�����С��Ů��д
		 * 
		 * 
		 */
		
		
		//���ÿ�����ʾ����
		setVisible(true);
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
	}
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Browse����
		Browse browse=new Browse();

	}

}
