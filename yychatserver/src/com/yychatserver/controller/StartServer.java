package com.yychatserver.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.yychat.model.User;

public class StartServer {
	private static final String User = null;
	ServerSocket ss;
	public StartServer(){
	    try {//捕获异常  这里捕获的异常必须要处理
			ss=new ServerSocket(3456);
			System.out.println("服务器已经启动，监听3456端口");//端口必须要在1024以上
			Socket s= ss.accept();	
			System.out.println("连接成功："+s);
			
			
			//接收对象
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			User user=(User)ois.readObject();
			System.out.println(user.getUserName());
			System.out.println(user.getPassWord());
			
			
	    } catch (IOException | ClassNotFoundException e) {//这个代码不一定会使用
			e.printStackTrace();//处理异常printStackTrace打印出你的异常的地址信息
		}
	}
	}