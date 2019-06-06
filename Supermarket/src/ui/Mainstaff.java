package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//员工主界面
public class Mainstaff extends JFrame{
	Container cp=getContentPane();//容器
	public Mainstaff() {
		setLayout(null);//框架
		JMenuBar bar=new JMenuBar();//菜单栏
		setJMenuBar(bar);
		JMenu storeManage=new JMenu("仓库库存管理");//菜单
		JMenuItem input=new JMenuItem("采购管理");//菜单项
		JMenuItem output=new JMenuItem("出库管理");//菜单项
		
		bar.add(storeManage);
		storeManage.add(input);
		storeManage.add(output);
		
		JMenu set=new JMenu("设置");//菜单
		JMenuItem about=new JMenuItem("关于我们");//菜单项
		JMenuItem exit=new JMenuItem("退出系统");//菜单项
		
		bar.add(set);
		set.add(about);
		set.add(exit);
		
		//加载图片
		ImageIcon icon=new ImageIcon("res/main2.jpg");
		//Image im=new Image(icon);
		//将图片放入label中
		JLabel label=new JLabel(icon);
		//设置label的大小
		label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
		//获取窗口的第二层，将label放入
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//获取frame的顶层容器,设置为透明
		((JPanel)cp).setOpaque(false);
		
		//采购页面跳转监听事件
		input.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
	                Input intput = new Input();
	            }          
	        }
	       );
		//出库页面跳转监听事件
	output.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                Output output = new Output();
            }          
        }
       );
	//关于我们菜单项监听事件
	about.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
                 new Author().setVisible(true);
            }          
        }
       );
	//退出系统菜单项监听事件
	exit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
        	int respond=JOptionPane.showConfirmDialog(null, "是否退出系统？");
			if(respond==0){
				System.exit(0);
        }
        }
	}
   );
		
		setSize(icon.getIconWidth(),icon.getIconHeight());//窗体大小
		setVisible(true);//窗体可显示
		setTitle("甄漂亮连锁超市管理系统");
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);
	}


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Mainstaff对象
		Mainstaff mainstaff=new Mainstaff();

	}

}
