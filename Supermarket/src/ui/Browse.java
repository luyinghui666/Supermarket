package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//浏览库存信息表
public class Browse extends JFrame{
	public Browse() {
		setTitle("仓库商品信息");
		//设置窗体的大小
		setSize(500,500);
		
		/*
		 * 
		 * 这是一个连接数据库填充表，小仙女们写
		 * 
		 * 
		 */
		
		
		//设置可以显示窗口
		setVisible(true);
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);
	}
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Browse对象
		Browse browse=new Browse();

	}

}
