package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//出库界面
public class Output {
	public Output() {
		JFrame frame=new JFrame();//框架窗体
		
		//加载图片
		ImageIcon icon=new ImageIcon("res/output.jpg");
		//Image im=new Image(icon);
		//将图片放入label中
		JLabel label=new JLabel(icon);
		//设置label的大小
		label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
		//获取窗口的第二层，将label放入
		frame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//获取frame的顶层容器，并设置为透明
		JPanel panel=(JPanel)frame.getContentPane();
		panel.setOpaque(false);
		
		JPanel panel2=new JPanel();//组件
		JButton j_browse=new JButton("浏览");//浏览按钮
		JButton j_remove=new JButton("出库");//出库按钮
		JButton j_alter=new JButton("修改");//修改按钮
		
		panel2.add(j_browse);	
		panel2.add(j_remove);
		panel2.add(j_alter);
		
		//浏览库存信息页面跳转监听事件
		j_browse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Browse browse = new Browse();
            }          
        }
       );
		
		//出库订单页面跳转监听事件
		j_remove.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Remove remove = new Remove();
            }          
        }
       );
		
		//修改库存信息跳转页面监听事件
		j_alter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Alter alter = new Alter();
            }          
        }
       );
		
		//必须设置为透明的。否则看不到图片
		panel2.setOpaque(false);
		frame.add(panel2);
		
		frame.setSize(icon.getIconWidth(),icon.getIconHeight());//窗体大小
		frame.setVisible(true);//窗体可显示
		frame.setTitle("出库界面");
		frame.setLocationRelativeTo(null);//窗体居中显示
		frame.setResizable(false);
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Output对象
		Output output=new Output();

	}

}
