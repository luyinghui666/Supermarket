package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//����Ա������
public class Mainadmin extends JFrame{
	Container cp=getContentPane();//����
	public Mainadmin() {//����Ա������
		setLayout(null);//���
		JMenuBar bar=new JMenuBar();//�˵���
		setJMenuBar(bar);
		JMenu storeManage=new JMenu("�ֿ������");//�˵�
		JMenuItem input=new JMenuItem("�ɹ�����");//�˵���
		JMenuItem output=new JMenuItem("�������");//�˵���
		
		bar.add(storeManage);
		storeManage.add(input);
		storeManage.add(output);
		
		JMenu manManage=new JMenu("������Ϣ����");//�˵�
		JMenuItem manbrowse=new JMenuItem("�����Ϣ");//�˵���
		JMenuItem manadd=new JMenuItem("�����Ϣ");//�˵���
		JMenuItem manalter=new JMenuItem("�޸���Ϣ");//�˵���
		JMenuItem mandelete=new JMenuItem("ɾ����Ϣ");//�˵���
		
		bar.add(manManage);
		manManage.add(manbrowse);
		manManage.add(manadd);
		manManage.add(manalter);
		manManage.add(mandelete);
		
		JMenu set=new JMenu("����");//�˵�
		JMenuItem about=new JMenuItem("��������");//�˵���
		JMenuItem exit=new JMenuItem("�˳�ϵͳ");//�˵���
		
		bar.add(set);
		set.add(about);
		set.add(exit);
		
		//����ͼƬ
				ImageIcon icon=new ImageIcon("res/main1.jpg");
				//Image im=new Image(icon);
				//��ͼƬ����label��
				JLabel label=new JLabel(icon);
				//����label�Ĵ�С
				label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
				//��ȡ���ڵĵڶ��㣬��label����
				this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
				//��ȡframe�Ķ���������������Ϊ͸��
				((JPanel)cp).setOpaque(false);
				
				//�ɹ�ҳ������¼�
				input.addActionListener(new ActionListener(){
			            public void actionPerformed(ActionEvent e){
   			                Input intput = new Input();//��ת
   			            }          
   			        }
   			       );
				output.addActionListener(new ActionListener(){//����ҳ������¼�
		            public void actionPerformed(ActionEvent e){
			                Output output = new Output();//��ת
			            }          
			        }
			       );
				about.addActionListener(new ActionListener(){//��������ҳ������¼�
		            public void actionPerformed(ActionEvent arg0){
			                 new Author().setVisible(true);
			            }          
			        }
			       );
				
				manbrowse.addActionListener(new ActionListener(){//�鿴Ա����Ϣҳ������¼�
		            public void actionPerformed(ActionEvent arg0){
			                 Manbrowse manbrowse=new Manbrowse();//��ת
			            }          
			        }
			       );
				
				manadd.addActionListener(new ActionListener(){//���Ա����Ϣҳ������¼�
		            public void actionPerformed(ActionEvent arg0){
		                 Manadd manadd=new Manadd();//��ת
		            }          
		        }
		       );
				
				manalter.addActionListener(new ActionListener(){//�޸�Ա����Ϣҳ������¼�
		            public void actionPerformed(ActionEvent arg0){
		                 Manalter manalter=new Manalter();//��ת
		            }          
		        }
		       );
				
				mandelete.addActionListener(new ActionListener(){//ɾ��Ա��ҳ������¼�
		            public void actionPerformed(ActionEvent arg0){
		                 Mandelete mandelete=new Mandelete();//��ת
		            }          
		        }
		       );
				
				exit.addActionListener(new ActionListener(){//�˳�ϵͳ�˵�������¼�
		            public void actionPerformed(ActionEvent arg0){
		            	int respond=JOptionPane.showConfirmDialog(null, "�Ƿ��˳�ϵͳ��");
						if(respond==0){
							System.exit(0);
		            }
		            }
				}
		       );
		
		setSize(icon.getIconWidth(),icon.getIconHeight());//�����С
		setVisible(true);//���ô������ʾ
		setTitle("��Ư���������й���ϵͳ");
		setLocationRelativeTo(null);//���������ʾ
		setResizable(false);
		
		
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ����Maninadmin����
		Mainadmin mainadmin=new Mainadmin();

	}

}
