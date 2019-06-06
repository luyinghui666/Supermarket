package ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//出库订单界面
public class Remove extends JFrame{
	Container cp=getContentPane();//容器
	public Remove() {
		setLayout(null);//框架布局
		
		JLabel l_trade=new JLabel("商品名称");//商品名称项
		l_trade.setBounds(24,67,66,15);
		cp.add(l_trade);
		
		JLabel l_removeamount=new JLabel("出库数量");//出库数量项
		l_removeamount.setBounds(230,67,66,15);
		cp.add(l_removeamount);
		
		JTextField t_trade=new JTextField();//商品名称输入框
		t_trade.setBounds(88,64,112,21);
		cp.add(t_trade);
		
		JTextField t_removeamount=new JTextField();//出库数量输入框
		t_removeamount.setBounds(294,64,112,21);
		cp.add(t_removeamount);
		
		JButton j_remove=new JButton("确认");//确认按钮
		j_remove.setBounds(313,138,93,23);
		cp.add(j_remove);
		
		j_remove.addActionListener(new ActionListener(){//确认按钮点击监听事件
            public void actionPerformed(ActionEvent arg0){
                String trade=t_trade.getText();//从输入框中获取输入的商品名称、出库数量
                String removeamount=t_removeamount.getText();
                
                /*
                 * 数据库内容
                 * 各位仙女们写
                 * 
                 * 
                 */
            }          
        }
       );
		
		setSize(450,360);//窗体大小
		setTitle("订单界面");
		setVisible(true);//窗体可显示
		setLocationRelativeTo(null);//窗体居中显示
		setResizable(false);
		
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//实例化Remove对象
		Remove remove=new Remove();

	}

}
