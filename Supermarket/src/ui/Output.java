package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//�������
public class Output {
	public Output() {
		JFrame frame=new JFrame();//��ܴ���
		
		//����ͼƬ
		ImageIcon icon=new ImageIcon("res/output.jpg");
		//Image im=new Image(icon);
		//��ͼƬ����label��
		JLabel label=new JLabel(icon);
		//����label�Ĵ�С
		label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
		//��ȡ���ڵĵڶ��㣬��label����
		frame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//��ȡframe�Ķ���������������Ϊ͸��
		JPanel panel=(JPanel)frame.getContentPane();
		panel.setOpaque(false);
		
		JPanel panel2=new JPanel();//���
		JButton j_browse=new JButton("���");//�����ť
		JButton j_remove=new JButton("����");//���ⰴť
		JButton j_alter=new JButton("�޸�");//�޸İ�ť
		
		panel2.add(j_browse);	
		panel2.add(j_remove);
		panel2.add(j_alter);
		
		//��������Ϣҳ����ת�����¼�
		j_browse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Browse browse = new Browse();
            }          
        }
       );
		
		//���ⶩ��ҳ����ת�����¼�
		j_remove.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Remove remove = new Remove();
            }          
        }
       );
		
		//�޸Ŀ����Ϣ��תҳ������¼�
		j_alter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Alter alter = new Alter();
            }          
        }
       );
		
		//��������Ϊ͸���ġ����򿴲���ͼƬ
		panel2.setOpaque(false);
		frame.add(panel2);
		
		frame.setSize(icon.getIconWidth(),icon.getIconHeight());//�����С
		frame.setVisible(true);//�������ʾ
		frame.setTitle("�������");
		frame.setLocationRelativeTo(null);//���������ʾ
		frame.setResizable(false);
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Output����
		Output output=new Output();

	}

}
