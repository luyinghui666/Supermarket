package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Ա����Ϣ�������
public class Manbrowse extends JFrame{
	
	public Manbrowse() {
		setTitle("Ա����Ϣ");
		//���ô���Ĵ�С
		setSize(500,500);
		
		/*
		 * 
		 * �������ݿ�
		 * ����
		 * ��Ů��д
		 * 
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
		//ʵ����Manbrowse����
		Manbrowse manbrowse=new Manbrowse();

	}

}
