package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//Ա��������
public class Mainstaff extends JFrame{
	Container cp=getContentPane();//����
	public Mainstaff() {
		setLayout(null);//���
		JMenuBar bar=new JMenuBar();//�˵���
		setJMenuBar(bar);
		JMenu storeManage=new JMenu("�ֿ������");//�˵�
		JMenuItem input=new JMenuItem("�ɹ�����");//�˵���
		JMenuItem output=new JMenuItem("�������");//�˵���
		
		bar.add(storeManage);
		storeManage.add(input);
		storeManage.add(output);
		
		JMenu set=new JMenu("����");//�˵�
		JMenuItem about=new JMenuItem("��������");//�˵���
		JMenuItem exit=new JMenuItem("�˳�ϵͳ");//�˵���
		
		bar.add(set);
		set.add(about);
		set.add(exit);
		
		//����ͼƬ
		ImageIcon icon=new ImageIcon("res/main2.jpg");
		//Image im=new Image(icon);
		//��ͼƬ����label��
		JLabel label=new JLabel(icon);
		//����label�Ĵ�С
		label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
		//��ȡ���ڵĵڶ��㣬��label����
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//��ȡframe�Ķ�������,����Ϊ͸��
		((JPanel)cp).setOpaque(false);
		
		//�ɹ�ҳ����ת�����¼�
		input.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
	                Input intput = new Input();
	            }          
	        }
	       );
		//����ҳ����ת�����¼�
	output.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                Output output = new Output();
            }          
        }
       );
	//�������ǲ˵�������¼�
	about.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
                 new Author().setVisible(true);
            }          
        }
       );
	//�˳�ϵͳ�˵�������¼�
	exit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
        	int respond=JOptionPane.showConfirmDialog(null, "�Ƿ��˳�ϵͳ��");
			if(respond==0){
				System.exit(0);
        }
        }
	}
   );
		
		setSize(icon.getIconWidth(),icon.getIconHeight());//�����С
		setVisible(true);//�������ʾ
		setTitle("��Ư���������й���ϵͳ");
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
	}


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Mainstaff����
		Mainstaff mainstaff=new Mainstaff();

	}

}
