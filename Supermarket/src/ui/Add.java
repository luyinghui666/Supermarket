package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//添加商品采购界面
public class Add extends JFrame{
	Container cp=getContentPane();//容器
	public Add() {
		setLayout(null);//框架布局
		
		JLabel l_trade=new JLabel("商品名称");//商品名称项
		l_trade.setBounds(75,88,54,15);
		cp.add(l_trade);
		
		JLabel l_addamount = new JLabel("入库数量");//入库数量项
		l_addamount.setBounds(75,124,54,15);
		cp.add(l_addamount);
		
		JLabel l_suppy = new JLabel("供应商");//供应商项
		l_suppy.setBounds(75,163,54,15);
		cp.add(l_suppy);
		
		JTextField t_trade=new JTextField();//商品名称输入文本框
		t_trade.setBounds(160,85,201,21);
		cp.add(t_trade);
		
		JTextField t_addamount=new JTextField();//入库数量输入文本框
		t_addamount.setBounds(160,121,201,21);
		cp.add(t_addamount);
		
		JTextField t_suppy=new JTextField();//供应商输入文本框
		t_suppy.setBounds(160,160,201,21);
		cp.add(t_suppy);
		
		JButton j_goodsadd=new JButton("确认");//确认按钮
		j_goodsadd.setBounds(75,243,93,23);
		cp.add(j_goodsadd);
		
		JButton j_reset=new JButton("重置");//重置按钮
		j_reset.setBounds(263,243,93,23);
		cp.add(j_reset);
		
		j_goodsadd.addActionListener(new ActionListener() {//确认添加点击监听按钮
			public void actionPerformed(ActionEvent e) {
				String  trade=t_trade.getText();		//从文本框中获取输入商品名称、入库数量、供应商信息
				String  addamount=t_addamount.getText();
				String  suppy=t_suppy.getText();
				
				/*
				 * 数据库内容
				 * 仙女们写
				 * 
				 * 
				 */
			}
		}
		);
		
		j_reset.addActionListener(new ActionListener() {//重置按钮点击监听按钮
			public void actionPerformed(ActionEvent e) {
				t_trade.setText("");
				t_addamount.setText("");
				t_suppy.setText("");		
				}
		});

		
		setTitle("订单界面");
		setSize(455,375);//窗体大小
		setVisible(true);//窗体可显示
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);

	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Add对象
		Add add=new Add();

	}

}
