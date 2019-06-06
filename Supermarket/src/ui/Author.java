package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//关于我们界面（作者信息）界面
public class Author extends JFrame{
	Container cp=getContentPane();//容器
	public Author() {
		setLayout(null);//框架布局
		setSize(450,300);//窗体大小
		setTitle("作者信息");
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);
		
		JLabel label = new JLabel("广东工业大学华立学院");
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(73, 10, 189, 49);
		cp.add(label);
		
		JLabel label2 = new JLabel("16计算机4班");
		label2.setFont(new Font("宋体", Font.BOLD, 13));
		label2.setBounds(73, 114, 144, 15);
		cp.add(label2);
		
		JLabel label3 = new JLabel("第9组");
		label3.setFont(new Font("宋体", Font.BOLD, 13));
		label3.setBounds(73, 149, 94, 15);
		cp.add(label3);
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Author对象
		Author author=new Author();

	}

}
