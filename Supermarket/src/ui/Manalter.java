package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//员工信息修改界面
public class Manalter extends JFrame{
	Container cp=getContentPane();//容器
	public Manalter() {
setLayout(null);//框架布局
		
		JLabel l_id=new JLabel("工号:");//工号项
		l_id.setBounds(21,59,54,15);
		cp.add(l_id);
		
		JTextField t_id=new JTextField();//工号输入框
		t_id.setBounds(61,59,139,21);
		cp.add(t_id);
		
		JLabel l_name=new JLabel("姓名:");//姓名项
		l_name.setBounds(210,59,64,15);
		cp.add(l_name);
		
		JTextField t_name=new JTextField();//姓名输入框
		t_name.setBounds(258,59,166,21);
		cp.add(t_name);
		
		JLabel l_pro=new JLabel("职位:");//职位项
		l_pro.setBounds(21,159,54,15);
		cp.add(l_pro);
		
		JTextField t_pro=new JTextField();//职位输入框
		t_pro.setBounds(61,159,139,21);
		cp.add(t_pro);
		
		JLabel l_sex=new JLabel("性别:");//性别项
		l_sex.setBounds(210,159,54,15);
		cp.add(l_sex);
		
		JTextField t_sex=new JTextField();//性别输入框
		t_sex.setBounds(258,159,166,21);
		cp.add(t_sex);
		
		JLabel l_tel=new JLabel("联系:");//联系方式项
		l_tel.setBounds(21,259,54,15);
		cp.add(l_tel);
		
		JTextField t_tel=new JTextField();//联系方式输入框
		t_tel.setBounds(61,259,139,21);
		cp.add(t_tel);
		
		JLabel l_password=new JLabel("密码:");//密码项
		l_password.setBounds(210,259,54,15);
		cp.add(l_password);
		
		JTextField t_password=new JTextField();//密码输入框
		t_password.setBounds(258,259,166,21);
		cp.add(t_password);
		
		JButton j_alter=new JButton("更改");//修改按钮
		j_alter.setBounds(61,366,93,23);
		cp.add(j_alter);
		
		JButton j_reset=new JButton("重置");//重置按钮
		j_reset.setBounds(257,366,93,23);
		cp.add(j_reset);
		
		//修改按钮点击监听事件
		j_alter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                String id=t_id.getText();//从文本框中获取输入的工号、姓名、职位、性别、联系方式、密码
                String name=t_name.getText();
                String pro=t_pro.getText();
                String sex=t_sex.getText();
                String tel=t_tel.getText();
                String password=t_password.getText();
                /*
                 * 
                 * 数据库操作
                 * 仙女们写
                 * 
                 */
                
           }          
       }
      );
		
		//重置按钮点击监听事件
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
		
		setSize(450,463);//窗体大小
		setTitle("更改员工信息");
		setVisible(true);//窗体可显示
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Manalter对象
		Manalter manalter=new Manalter();

	}

}
