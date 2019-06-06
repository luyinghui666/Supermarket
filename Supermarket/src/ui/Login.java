package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//登录界面
public class Login extends JFrame{
	Container cp=getContentPane();//容器
	public Login() {//初始化登录界面
		setLayout(null);//框架布局
		
		JLabel l_company=new JLabel("甄漂亮超市管理系统");  //登录界面窗体
		l_company.setFont(new Font("方正舒体", Font.PLAIN, 25));
		l_company.setBounds(150, 0, 258, 55);
		cp.add(l_company);
		
		JLabel l_name=new JLabel("用户名",JLabel.CENTER);//用户名
		l_name.setFont(new Font("宋体",Font.BOLD,14));
		l_name.setBounds(38,139,88,18);
		cp.add(l_name);
		
		JLabel l_password=new JLabel("密码",JLabel.CENTER);//密码
		l_password.setFont(new Font("宋体",Font.BOLD,14));
		l_password.setBounds(38,195,92,29);
		cp.add(l_password);
		
		JTextField t_name=new JTextField();//用户名输入框
		t_name.setBounds(136,136,250,29);
		cp.add(t_name);
		
		JTextField t_password=new JTextField();//密码输入框
		t_password.setBounds(136,197,250,29);
		cp.add(t_password);
		
		JButton j_login=new JButton("登录");//登录按钮
		j_login.setBounds(76, 321, 93, 23);
		cp.add(j_login);
		
		JButton j_rest=new JButton("重置");//重置按钮
		j_rest.setBounds(271, 321, 93, 23);
		cp.add(j_rest);
		
				//给登录界面添加背景图片
				ImageIcon icon=new ImageIcon("res/first.jpg");//加载图片
				//Image im=new Image(icon);
				//将图片放入label中
				JLabel label=new JLabel(icon);
				//设置label的大小
				label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
				//获取窗口的第二层，将label放入
				this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
				//获取frame的顶层容器，并设置为透明
				((JPanel)cp).setOpaque(false);
				
				
				//登录按钮点击监听事件
				j_login.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String name=t_name.getText();//获取用户名文本框输入内容
						String password=t_password.getText();//获取密码框输入内容
						
						/*
						 * 链接sql server代码
						 * 仙女们写
						 * 
						 */
						
						
						//这是静态连接登录判定，供测试，连接数据库实行动态登录时将它注释掉
						if(name.contentEquals("root")&&password.contentEquals("admin"))
						{
							Mainadmin main=new Mainadmin();
							JOptionPane.showMessageDialog(null,"登录成功");
							dispose();
							
						}
						else if(name.contentEquals("root")&&password.equals("staff"))
						{
							Mainstaff main=new Mainstaff();
							JOptionPane.showMessageDialog(null,"登录成功");
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null,"用户名或密码输入错误！");
						}
						//静态连接
						
						
						//动态连接登录判定，连接数据库后将释放
						
						/*
						 * name_D=rs.getString("name");//连接数据库遍历职员表得到用户名、密码、职位权限，管理员为1，普通员工为2
						 * password_D=rs.getString("password");
						 * pro_D=rs.getString("pro");
						 * 
						  if(name.contentEquals(name_D)&&password.contentEquals(password_D)&&pro.equals("1"))
						{
							Mainadmin main=new Mainadmin();
							JOptionPane.showMessageDialog(null,"登录成功");
							dispose();
						}
						else if(name.contentEquals(name_D)&&password.equals(pssword_D)&&pro_equals("2"))
						{
							Mainstaff main=new Mainstaff();
							JOptionPane.showMessageDialog(null,"登录成功");
							dispose();
						}
						else{
						JOptionPane.showMessageDialog(null,"用户名或密码输入错误！");
						}
						 
						 */
						//动态链接
						
						
					}
					
				});
				
				j_rest.addActionListener(new ActionListener() {//重置按钮监听事件
					public void actionPerformed(ActionEvent e) {
						t_name.setText("");
						t_password.setText("");

					}
				});
		
		setSize(450,431);//设置窗体大小
		setTitle("用户登录");
		setVisible(true);//设置可以显示窗口
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Login对象
		Login login =new Login();

	}

}
