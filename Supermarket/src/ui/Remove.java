package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//���ⶩ������
public class Remove extends JFrame{
	Container cp=getContentPane();//����
	public Remove() {
		setLayout(null);//��ܲ���
		
		JLabel l_trade=new JLabel("��Ʒ����");//��Ʒ������
		l_trade.setBounds(24,67,66,15);
		cp.add(l_trade);
		
		JLabel l_removeamount=new JLabel("��������");//����������
		l_removeamount.setBounds(230,67,66,15);
		cp.add(l_removeamount);
		
		JTextField t_trade=new JTextField();//��Ʒ���������
		t_trade.setBounds(88,64,112,21);
		cp.add(t_trade);
		
		JTextField t_removeamount=new JTextField();//�������������
		t_removeamount.setBounds(294,64,112,21);
		cp.add(t_removeamount);
		
		JButton j_remove=new JButton("ȷ��");//ȷ�ϰ�ť
		j_remove.setBounds(313,138,93,23);
		cp.add(j_remove);
		
		j_remove.addActionListener(new ActionListener(){//ȷ�ϰ�ť��������¼�
            public void actionPerformed(ActionEvent arg0){
                String trade=t_trade.getText();//��������л�ȡ�������Ʒ���ơ���������
                String removeamount=t_removeamount.getText();
                
                /*
                 * ���ݿ�����
                 * ��λ��Ů��д
                 * 
                 * 
                 */
            }          
        }
       );
		
		setSize(450,360);//�����С
		setTitle("��������");
		setVisible(true);//�������ʾ
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
		
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Remove����
		Remove remove=new Remove();

	}

}
