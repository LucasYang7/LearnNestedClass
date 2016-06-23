package com.xiaozhejun.innerclass;

import com.xiaozhejun.innerclass.OuterClass.InnerClass;

// 外部类
class OuterClass{
	// 普通的内部类
	class InnerClass{
		public void sayHello(){
			System.out.println("你好，我是内部类InnerClass的对象innerObject,我的外部类是OuterClass。");
		}
	}
}

public class CreateInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerObject = new OuterClass();                              // 第一步：实例化外部类OuterClass，得到外部类对象outerObject
		InnerClass innerObject = outerObject.new InnerClass();       // 第二步：使用外部类对象创建内部类对象
		innerObject.sayHello();
	}

}
