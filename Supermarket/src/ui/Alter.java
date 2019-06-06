package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//修改库存信息界面
public class Alter extends JFrame{
	Container cp=getContentPane();//容器
	public Alter() {
		setLayout(null);//框架布局
		JLabel l_trade=new JLabel("商品名称");//商品名称项
		l_trade.setBounds(75,88,54,15);
		cp.add(l_trade);
		
		JLabel l_rnumber = new JLabel("库存数量");//库存数量项
		l_rnumber.setBounds(75,124,54,15);
		cp.add(l_rnumber);
		
		JLabel l_suppy = new JLabel("供应商");//供应商项
		l_suppy.setBounds(75,163,54,15);
		cp.add(l_suppy);
		
		JTextField t_trade=new JTextField();//商品名称输入框
		t_trade.setBounds(160,85,201,21);
		cp.add(t_trade);
		
		JTextField t_rnumber=new JTextField();//库存数量输入框
		t_rnumber.setBounds(160,121,201,21);
		cp.add(t_rnumber);
		
		JTextField t_suppy=new JTextField();//供应商输入框
		t_suppy.setBounds(160,160,201,21);
		cp.add(t_suppy);
		
		JButton j_alter=new JButton("修改");//修改按钮
		j_alter.setBounds(75,243,93,23);
		cp.add(j_alter);
		
		JButton j_reset=new JButton("重置");//重置按钮
		j_reset.setBounds(263,243,93,23);
		cp.add(j_reset);
		
		//修改按钮点击监听事件
		j_alter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  trade=t_trade.getText();//从文本框中获取输入的商品名称、库存数量、供应商
				String  rnumber=t_rnumber.getText();
				String  suppy=t_suppy.getText();
				
				/*
				 * 数据库内容
				 * 
				 * 仙女们写
				 * 
				 */
			}
		}
		);
		
		j_reset.addActionListener(new ActionListener() {//重置按钮点击监听事件
			public void actionPerformed(ActionEvent e) {
				t_trade.setText("");
				t_rnumber.setText("");
				t_suppy.setText("");		
				}
		});

		
		setTitle("修改商品信息");
		setSize(455,375);//窗体大小
		setVisible(true);//窗体可显示
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Alter对象
		Alter alter=new Alter();

	}

}
