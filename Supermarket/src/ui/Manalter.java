package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Ա����Ϣ�޸Ľ���
public class Manalter extends JFrame{
	Container cp=getContentPane();//����
	public Manalter() {
setLayout(null);//��ܲ���
		
		JLabel l_id=new JLabel("����:");//������
		l_id.setBounds(21,59,54,15);
		cp.add(l_id);
		
		JTextField t_id=new JTextField();//���������
		t_id.setBounds(61,59,139,21);
		cp.add(t_id);
		
		JLabel l_name=new JLabel("����:");//������
		l_name.setBounds(210,59,64,15);
		cp.add(l_name);
		
		JTextField t_name=new JTextField();//���������
		t_name.setBounds(258,59,166,21);
		cp.add(t_name);
		
		JLabel l_pro=new JLabel("ְλ:");//ְλ��
		l_pro.setBounds(21,159,54,15);
		cp.add(l_pro);
		
		JTextField t_pro=new JTextField();//ְλ�����
		t_pro.setBounds(61,159,139,21);
		cp.add(t_pro);
		
		JLabel l_sex=new JLabel("�Ա�:");//�Ա���
		l_sex.setBounds(210,159,54,15);
		cp.add(l_sex);
		
		JTextField t_sex=new JTextField();//�Ա������
		t_sex.setBounds(258,159,166,21);
		cp.add(t_sex);
		
		JLabel l_tel=new JLabel("��ϵ:");//��ϵ��ʽ��
		l_tel.setBounds(21,259,54,15);
		cp.add(l_tel);
		
		JTextField t_tel=new JTextField();//��ϵ��ʽ�����
		t_tel.setBounds(61,259,139,21);
		cp.add(t_tel);
		
		JLabel l_password=new JLabel("����:");//������
		l_password.setBounds(210,259,54,15);
		cp.add(l_password);
		
		JTextField t_password=new JTextField();//���������
		t_password.setBounds(258,259,166,21);
		cp.add(t_password);
		
		JButton j_alter=new JButton("����");//�޸İ�ť
		j_alter.setBounds(61,366,93,23);
		cp.add(j_alter);
		
		JButton j_reset=new JButton("����");//���ð�ť
		j_reset.setBounds(257,366,93,23);
		cp.add(j_reset);
		
		//�޸İ�ť��������¼�
		j_alter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                String id=t_id.getText();//���ı����л�ȡ����Ĺ��š�������ְλ���Ա���ϵ��ʽ������
                String name=t_name.getText();
                String pro=t_pro.getText();
                String sex=t_sex.getText();
                String tel=t_tel.getText();
                String password=t_password.getText();
                /*
                 * 
                 * ���ݿ����
                 * ��Ů��д
                 * 
                 */
                
           }          
       }
      );
		
		//���ð�ť��������¼�
		j_reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
            	t_id.setText("");
				t_name.setText("");
				t_pro.setText("");
				t_sex.setText("");
				t_tel.setText("");
				t_password.setText("");
				
           }          
       }
      );
		
		setSize(450,463);//�����С
		setTitle("����Ա����Ϣ");
		setVisible(true);//�������ʾ
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Manalter����
		Manalter manalter=new Manalter();

	}

}
