package com.xiaozhejun.innerclass;

import com.xiaozhejun.innerclass.OuterClass2.InnerClass2;

//外部类
class OuterClass2{
	private int privateInstanceMember = 7;                       // 外部类的private实例变量
	private static int privateStaticMember  =  23;           // 外部类的private静态变量（类变量）
	// 普通的内部类
	class InnerClass2{
		public void sayHello(){
			System.out.println("你好，我是内部类InnerClass2的对象innerObject2。\n"
					+ "我能看到外部类OuterClass2的私有实例变量 privateInstanceMember = " + privateInstanceMember +
					"\n私有静态变量 privateStaticMember  = " + privateStaticMember);
		}
	}
}

public class AccessPrivateMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2 outerObject2 = new OuterClass2();                              
		InnerClass2 innerObject2 = outerObject2.new InnerClass2();       
		innerObject2.sayHello();
	}

}
