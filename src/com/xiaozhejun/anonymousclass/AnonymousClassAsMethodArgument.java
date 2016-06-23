package com.xiaozhejun.anonymousclass;

/**
 * 定义的消息接口
 * */
interface Message{
	public void sayHello();
}

/**
 * 接受Message对象，并对其进行处理
 * */
class HandlerMessage{
	/**
	 * 方法displayMessage将接收一个实现了Message接口的匿名内部类对象作为参数
	 * */
	public void displayMessage(Message m){
		m.sayHello();
	}
}

public class AnonymousClassAsMethodArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlerMessage handlerMessage = new HandlerMessage();
	     handlerMessage.displayMessage(new Message(){

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("你好，我是一个实现了Message接口的匿名内部类对象，我的外部类是AnonymousClassAsMethodArgument\n"
						+ "我将作为参数传递给HandlerMessage类中的displayMessage方法。");
			}
	    	 
	     });
	}

}
