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
	    try {//�����쳣  ���ﲶ����쳣����Ҫ����
			ss=new ServerSocket(3456);
			System.out.println("�������Ѿ�����������3456�˿�");//�˿ڱ���Ҫ��1024����
			Socket s= ss.accept();	
			System.out.println("���ӳɹ���"+s);
			
			
			//���ն���
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			User user=(User)ois.readObject();
			System.out.println(user.getUserName());
			System.out.println(user.getPassWord());
			
			
	    } catch (IOException | ClassNotFoundException e) {//������벻һ����ʹ��
			e.printStackTrace();//�����쳣printStackTrace��ӡ������쳣�ĵ�ַ��Ϣ
		}
	}
	}