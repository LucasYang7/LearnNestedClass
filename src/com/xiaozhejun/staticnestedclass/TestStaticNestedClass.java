package com.xiaozhejun.staticnestedclass;

/**
 * 静态嵌套类对应的外部类
 * */
class OuterClass5{
	/**
	 * 静态嵌套类
	 * */
	static class StaticNestedClass{
		public void sayHello(){
			System.out.println("你好，我是静态嵌套类OuterClass5.StaticNestedClass的实例staticNestedClass，我的外部类是OuterClass5。");
		}
	}
}

public class TestStaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass5.StaticNestedClass  staticNestedClass = new OuterClass5.StaticNestedClass();
		staticNestedClass.sayHello();
	}

}
