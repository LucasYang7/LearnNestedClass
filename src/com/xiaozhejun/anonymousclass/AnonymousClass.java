package com.xiaozhejun.anonymousclass;

/**
 * 匿名内部类可以实现该接口
 * */
interface BaseInterface{
	public void sayHello();
}

/**
 * 匿名内部类可以继承该抽象类
 * */
abstract class BaseAbstractClass{
	public abstract void sayHello();
}

/**
 * 这是匿名内部类所对应的外部类
 * */
class OuterClass4{
	/**
	 * 下面的语句不是new BaseInterface这个接口，很明显接口是不能被实例化的
	 * 而是先定义了一个实现了BaseInterface接口的匿名内部类，
	 * 然后向上转型为BaseInterface接口类型
	 * */
	BaseInterface baseInterface = new BaseInterface(){

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("你好，我是位于外部类OuterClass4中的一个匿名内部类，我实现了BaseInterface接口。");
		}
		
	};
	
	/**
	* 下面的语句不是实例化BaseAbstractClass这个抽象类，很明显抽象类是不能被实例化的
	 * 而是先定义了一个继承了BaseAbstractClass抽象类的匿名内部类，
	 * 然后向上转型为BaseAbstractClass抽象类
	 * */
	BaseAbstractClass baseAbstractClass = new BaseAbstractClass() {
		
		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("你好，我是位于外部类OuterClass4中的一个匿名内部类，我继承了BaseAbstractClass抽象类。");
		}
	};
	
	/**
	 * 在该方法中定义一个匿名内部类
	 * */
	public void defineAnonymousClassInMethod(){
		BaseInterface baseInterfaceInMethod = new BaseInterface() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("你好，我是位于外部类OuterClass4中的一个匿名内部类，我实现了BaseInterface接口,"
						+ "并且定义在了defineAnonymousClassInMethod()方法中。");
			}
		};
		baseInterfaceInMethod.sayHello();
	}
	
	/**
	 * 执行各个匿名类的实例化操作并且调用对应的sayHello()方法
	 * */
	public void sayHello(){
		baseInterface.sayHello();
		baseAbstractClass.sayHello();
		defineAnonymousClassInMethod();
	}
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass4 outerClass4 = new OuterClass4();
		outerClass4.sayHello();
	}

}
