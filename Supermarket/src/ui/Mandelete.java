package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//员工信息删除界面
public class Mandelete extends JFrame{
	Container cp=getContentPane();//容器
	public Mandelete() {
		setLayout(null);//框架布局
		JLabel l_id=new JLabel("工号：");//工号项
		l_id.setBounds(50,60,100,30);
		cp.add(l_id);
		
		JLabel l_name=new JLabel("姓名：");//姓名项
		l_name.setBounds(50,120,100,30);
		cp.add(l_name);
		
		JTextField t_id=new JTextField();//工号输入框
		t_id.setBounds(100,60,150,30);
		cp.add(t_id);
		
		JTextField t_name=new JTextField();//姓名输入框
		t_name.setBounds(100,120,150,30);
		cp.add(t_name);
		
		JButton j_delete=new JButton("删除");//删除按钮
		j_delete.setBounds(90,180,100,30);
		cp.add(j_delete);
		
		//删除按钮点击监听事件
		j_delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
            	String id=t_id.getText();//从文本框中获取输入的工号、姓名
            	String name=t_name.getText();
            	
            	/*
            	 * 数据库操作
            	 * 仙女们写
            	 * 
            	 * 
            	 */
            	
           }          
       }
      );
		
		setSize(350,300);//窗体大小
		setVisible(true);//窗体可显示
		setTitle("删除员工信息");
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);
	}
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Mandelete对象
		Mandelete mandelete=new Mandelete();

	}

}
