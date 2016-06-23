package com.xiaozhejun.anonymousclass;

/**
 * 可以被匿名内部类继承的接口
 * */
interface BaseInterface{
	public void sayHello();
}

/**
 * 可以被匿名内部类继承的抽象类
 * */
abstract class BaseAbstractClass{
	public abstract void sayHello();
}

/**
 * 可以被匿名内部类继承的普通类
 * */
class BaseClass{
	public void sayHello(){
		System.out.println("你好，我是基类Base。");
	}
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
		System.out.print("baseInterfaceInMethod is " + baseInterfaceInMethod + "\t");
		baseInterfaceInMethod.sayHello();
	}
	
	//类名后面跟了{}就表示这是一个类的定义，如果没有{}就表示这是一个类的实例化操作
	BaseClass baseClass1 = new BaseClass();                  // baseClass1是一个BaseClass对象。（准确来说，baseClass1是一个指向BaseClass对象的引用）
	BaseClass baseClass2 = new BaseClass(){                  // baseClass2是一个匿名类对象，而匿名类继承了BaseClass。 
		public void sayHello(){
			System.out.println("你好，我是位于外部类OuterClass4中的一个匿名内部类，我继承了普通的BaseClass类。");
		}
	}; 
	
	/**
	 * 执行各个匿名类的实例化操作并且调用对应的sayHello()方法
	 * */
	public void sayHello(){
		System.out.print("baseInterface is " + baseInterface + "\t");
		baseInterface.sayHello();
		
		System.out.print("baseAbstractClass is " + baseAbstractClass + "\t");
		baseAbstractClass.sayHello();
		
		// 类先对实例变量进行初始化，再对方法进行初始化，因此匿名类实例baseClass2的编号是3,
		// 而方法defineAnonymousClassInMethod内部定义的匿名类实例baseInterfaceInMethod的编号是4。
		defineAnonymousClassInMethod();
		
		System.out.print("baseClass1 is " + baseClass1 + "\t");
		baseClass1.sayHello();
		
		System.out.print("baseClass2 is " + baseClass2 + "\t");
		baseClass2.sayHello();
	}
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass4 outerClass4 = new OuterClass4();
		outerClass4.sayHello();
	}

}
