package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Ա����Ϣɾ������
public class Mandelete extends JFrame{
	Container cp=getContentPane();//����
	public Mandelete() {
		setLayout(null);//��ܲ���
		JLabel l_id=new JLabel("���ţ�");//������
		l_id.setBounds(50,60,100,30);
		cp.add(l_id);
		
		JLabel l_name=new JLabel("������");//������
		l_name.setBounds(50,120,100,30);
		cp.add(l_name);
		
		JTextField t_id=new JTextField();//���������
		t_id.setBounds(100,60,150,30);
		cp.add(t_id);
		
		JTextField t_name=new JTextField();//���������
		t_name.setBounds(100,120,150,30);
		cp.add(t_name);
		
		JButton j_delete=new JButton("ɾ��");//ɾ����ť
		j_delete.setBounds(90,180,100,30);
		cp.add(j_delete);
		
		//ɾ����ť��������¼�
		j_delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
            	String id=t_id.getText();//���ı����л�ȡ����Ĺ��š�����
            	String name=t_name.getText();
            	
            	/*
            	 * ���ݿ����
            	 * ��Ů��д
            	 * 
            	 * 
            	 */
            	
           }          
       }
      );
		
		setSize(350,300);//�����С
		setVisible(true);//�������ʾ
		setTitle("ɾ��Ա����Ϣ");
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
	}
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Mandelete����
		Mandelete mandelete=new Mandelete();

	}

}
