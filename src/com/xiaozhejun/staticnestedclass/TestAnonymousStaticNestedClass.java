package com.xiaozhejun.staticnestedclass;

/**
 * 匿名Static嵌套类实现了该接口 
 * */
interface TestAnonymousStaticNestedClassInterface{
	public void sayHello();
}

class OuterClass6{
	/**
	 * 实现了TestInterface接口的static匿名类
	 * */
	static TestAnonymousStaticNestedClassInterface testAnonymousStaticNestedClassInterface = new TestAnonymousStaticNestedClassInterface() {

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("你好，我是实现了TestInterface接口的匿名static嵌套类，我的外部类是OuterClass6。");
		}
	};

	static void sayHello(){
		testAnonymousStaticNestedClassInterface.sayHello();
	}
}

public class TestAnonymousStaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass6.sayHello();
	}

}
