package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//��¼����
public class Login extends JFrame{
	Container cp=getContentPane();//����
	public Login() {//��ʼ����¼����
		setLayout(null);//��ܲ���
		
		JLabel l_company=new JLabel("��Ư�����й���ϵͳ");  //��¼���洰��
		l_company.setFont(new Font("��������", Font.PLAIN, 25));
		l_company.setBounds(150, 0, 258, 55);
		cp.add(l_company);
		
		JLabel l_name=new JLabel("�û���",JLabel.CENTER);//�û���
		l_name.setFont(new Font("����",Font.BOLD,14));
		l_name.setBounds(38,139,88,18);
		cp.add(l_name);
		
		JLabel l_password=new JLabel("����",JLabel.CENTER);//����
		l_password.setFont(new Font("����",Font.BOLD,14));
		l_password.setBounds(38,195,92,29);
		cp.add(l_password);
		
		JTextField t_name=new JTextField();//�û��������
		t_name.setBounds(136,136,250,29);
		cp.add(t_name);
		
		JTextField t_password=new JTextField();//���������
		t_password.setBounds(136,197,250,29);
		cp.add(t_password);
		
		JButton j_login=new JButton("��¼");//��¼��ť
		j_login.setBounds(76, 321, 93, 23);
		cp.add(j_login);
		
		JButton j_rest=new JButton("����");//���ð�ť
		j_rest.setBounds(271, 321, 93, 23);
		cp.add(j_rest);
		
				//����¼������ӱ���ͼƬ
				ImageIcon icon=new ImageIcon("res/first.jpg");//����ͼƬ
				//Image im=new Image(icon);
				//��ͼƬ����label��
				JLabel label=new JLabel(icon);
				//����label�Ĵ�С
				label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
				//��ȡ���ڵĵڶ��㣬��label����
				this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
				//��ȡframe�Ķ���������������Ϊ͸��
				((JPanel)cp).setOpaque(false);
				
				
				//��¼��ť��������¼�
				j_login.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String name=t_name.getText();//��ȡ�û����ı�����������
						String password=t_password.getText();//��ȡ�������������
						
						/*
						 * ����sql server����
						 * ��Ů��д
						 * 
						 */
						
						
						//���Ǿ�̬���ӵ�¼�ж��������ԣ��������ݿ�ʵ�ж�̬��¼ʱ����ע�͵�
						if(name.contentEquals("root")&&password.contentEquals("admin"))
						{
							Mainadmin main=new Mainadmin();
							JOptionPane.showMessageDialog(null,"��¼�ɹ�");
							dispose();
							
						}
						else if(name.contentEquals("root")&&password.equals("staff"))
						{
							Mainstaff main=new Mainstaff();
							JOptionPane.showMessageDialog(null,"��¼�ɹ�");
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null,"�û����������������");
						}
						//��̬����
						
						
						//��̬���ӵ�¼�ж����������ݿ���ͷ�
						
						/*
						 * name_D=rs.getString("name");//�������ݿ����ְԱ��õ��û��������롢ְλȨ�ޣ�����ԱΪ1����ͨԱ��Ϊ2
						 * password_D=rs.getString("password");
						 * pro_D=rs.getString("pro");
						 * 
						  if(name.contentEquals(name_D)&&password.contentEquals(password_D)&&pro.equals("1"))
						{
							Mainadmin main=new Mainadmin();
							JOptionPane.showMessageDialog(null,"��¼�ɹ�");
							dispose();
						}
						else if(name.contentEquals(name_D)&&password.equals(pssword_D)&&pro_equals("2"))
						{
							Mainstaff main=new Mainstaff();
							JOptionPane.showMessageDialog(null,"��¼�ɹ�");
							dispose();
						}
						else{
						JOptionPane.showMessageDialog(null,"�û����������������");
						}
						 
						 */
						//��̬����
						
						
					}
					
				});
				
				j_rest.addActionListener(new ActionListener() {//���ð�ť�����¼�
					public void actionPerformed(ActionEvent e) {
						t_name.setText("");
						t_password.setText("");

					}
				});
		
		setSize(450,431);//���ô����С
		setTitle("�û���¼");
		setVisible(true);//���ÿ�����ʾ����
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Login����
		Login login =new Login();

	}

}
