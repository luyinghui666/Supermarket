package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//�ɹ�����
public class Input extends JFrame{
	public Input() {
		
		JFrame frame=new JFrame();//��ܴ���
		
		//����ͼƬ
		ImageIcon icon=new ImageIcon("res/input.jpg");
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
		JButton j__add=new JButton("�ɹ�");//�ɹ���ť
		JButton j_alter=new JButton("�޸�");//�޸İ�ť
		
		panel2.add(j_browse);	
		panel2.add(j__add);
		panel2.add(j_alter);
		
		//���ҳ����ת���������ť
		j_browse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Browse browse = new Browse();
            }          
        }
       );
		
		//��Ӷ���ҳ����ת��������¼�
		j__add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Add add = new Add();
            }          
        }
       );
		
		//�޸Ŀ����Ϣҳ������ת�����¼�
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
		frame.setTitle("�ɹ�����");
		frame.setLocationRelativeTo(null);//�����������
		frame.setResizable(false);
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Input����
		Input input=new Input();

	}

}
