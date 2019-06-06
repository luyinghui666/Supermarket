package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//员工信息浏览界面
public class Manbrowse extends JFrame{
	
	public Manbrowse() {
		setTitle("员工信息");
		//设置窗体的大小
		setSize(500,500);
		
		/*
		 * 
		 * 连接数据库
		 * 填充表
		 * 仙女们写
		 * 
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
		//实例化Manbrowse对象
		Manbrowse manbrowse=new Manbrowse();

	}

}
