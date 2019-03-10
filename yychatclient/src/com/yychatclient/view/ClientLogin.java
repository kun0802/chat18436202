package com.yychatclient.view;//包名

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;//图片、图标的类
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;//Frame带有
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
//JFrame（）:是构建一个初始时不可见的新窗口
public class ClientLogin extends JFrame{//类名：ClientLogin  模板：对象的模板（一个类有很多个对象）
        //定义北部组键
	JLabel jlbl1; //定义标签       JLabel是标签含有文本字符串或图标，均水平对齐
	
	//定义中部组件
	JTabbedPane jtp1;//JTabbedPane选项卡
	JPanel jp2,jp3,jp4;//面板
	JLabel jlbl2,jlbl3,jlbl4,jlbl5;//添加到jp2选项卡中,指的是文字
	JTextField jtf1;//文本域指的是yy号码后的框
	JPasswordField jpf1;//密码框
	JButton jb4;
	JCheckBox jcb1,jcb2;//副选框   类的要求首字母大写
	
	//定义南部组件
	JButton jb1,jb2,jb3 ;
	JPanel jp1;//面板，容器，管理三个按钮
	
	public ClientLogin(){//构造方法省略（系统会默认生成一个方法）
		//创建北部组件
		jlbl1=new JLabel(new ImageIcon("images/tou.gif"));//创建一个图片的
		this.add(jlbl1,"North");//指的是ClientLogin的一个窗口 
		
		
		//创建中部组件
		jtp1=new JTabbedPane();
		jp2=new JPanel(new GridLayout(3,3));//布局问题  布局模式网格
		jp3=new JPanel();jp4=new JPanel();
		jlbl2=new JLabel("YY号码",JLabel.CENTER);jlbl3=new JLabel("YY密码",JLabel.CENTER);
		jlbl4=new JLabel("忘记密码",JLabel.CENTER);
		jlbl4.setForeground(Color.blue);
		jlbl5=new JLabel("申请密码保护",JLabel.CENTER);
		jtf1=new JTextField();
		jpf1=new JPasswordField();
		jb4=new JButton(new ImageIcon("images/clear.gif")) ;
		jcb1=new JCheckBox("隐身登陆");jcb2=new JCheckBox("记住密码");
		jp2.add(jlbl2);jp2.add(jtf1);jp2.add(jb4);
		jp2.add(jlbl3);jp2.add(jpf1);jp2.add(jlbl4);
		jp2.add(jcb1);jp2.add(jcb2);jp2.add(jlbl5);
		jtp1.add(jp2, "YY号码");jtp1.add(jp3, "手机号码");jtp1.add(jp4, "电子邮箱");//将三个面板添加到选项卡中
		this.add(jtp1);
		
		//创建南部组建件
				jb1=new JButton(new ImageIcon("images/denglu.gif"));
				jb2=new JButton(new ImageIcon("images/zhuce.gif"));
				jb3=new JButton(new ImageIcon("images/quxiao.gif"));
				jp1=new JPanel();//创建JPanel对象
				jp1.add(jb1);jp1.add(jb2);jp1.add(jb3);
				this.add(jp1,"South");
		this.setSize(350,240);//设置窗口大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口的关闭  JFrame可以用ClientLogin代替
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		ClientLogin ClientLogin = new ClientLogin();//创建对象，构造方法

	}

}
