package com.xiaozhejun.localclass;

/**
 * 这是局部类所对应的外部类
 * */
class OuterClass3{
	private int privateInstanceMember = 7;                       // 外部类的private实例变量
	private static int privateStaticMember  =  8;              // 外部类的private静态变量（类变量）

	/**
	 * 在非static方法内部定义和实例化局部类
	 * */
	public void createLocalClass(){
		int localVariableInMethod = 9;
		final int finalLocalVariableInMethod = 9;
		/**
		 * 定义在非static方法内的局部类
		 * */
		class LocalClassInNonStaticMethod{
			//static int staticInt  = 0;                                                             // 局部内部类是无法定义static变量的
			int valInLocalClass = 10;
			public void sayHello(){
				System.out.println("你好，我是局部类LocalClassInNonStaticMethod的对象localClassInNonStaticMethod.");
				System.out.println( "我能看到外部类OuterClass3的私有实例变量 privateInstanceMember = " + privateInstanceMember +
						"\t私有静态变量 privateStaticMember  = " + privateStaticMember);
				System.out.println("在jdk8以前的版本中，我无法看到方法createLocalClass()的局部变量localVariableInMethod");
				System.out.println("我能看到方法createLocalClass()中的局部常量finalLocalVariableInMethod = " + finalLocalVariableInMethod);
				System.out.println("这是我自己的变量inti = " + valInLocalClass);            // test
				System.out.println("\n");
			}
		}//LocalClassInNonStaticMethod
		// 实例化局部类LocalClassInNonStaticMethod
		LocalClassInNonStaticMethod localClassInNonStaticMethod = new LocalClassInNonStaticMethod();
		localClassInNonStaticMethod.sayHello();
	}

	/**
	 * 在static方法内部定义局部类，这种情况下的局部类蜕变成了static嵌套类。
	 * 我们认为局部类是属于非static嵌套类的，因此一般不推荐在static方法定义局部类，
	 * 因为这会使局部类失去对外部类对象的引用，无法再访问外部类的实例变量，从而丧失了其应有的属性。
	 * 在static方法内定义的局部类最好直接转换为static嵌套类 
	 * */
	public static void staticCreateLocalClass(){
		int localVariableInMethod = 9;
		final int finalLocalVariableInMethod = 9;
		/**
		 * 定义在static方法内的局部类
		 * */
		class LocalClassInStaticMethod{
			//static int staticInt  = 0;                                                             // 局部内部类是无法定义static变量的
			int valInLocalClass = 10;
			public void sayHello(){
				System.out.println("你好，我是局部类LocalClassInStaticMethod的对象localClassInStaticMethod.");
				System.out.println( "我无法看到外部类OuterClass3的私有实例变量 privateInstanceMember " +
						"\t私有静态变量 privateStaticMember  = " + privateStaticMember);
				System.out.println("在jdk8以前的版本中，我无法看到方法staticCreateLocalClass()的局部变量localVariableInMethod");
				System.out.println("我能看到方法staticCreateLocalClass()中的局部常量finalLocalVariableInMethod = " + finalLocalVariableInMethod);
				System.out.println("这是我自己的变量inti = " + valInLocalClass);            // test
				System.out.println("\n");
			}
		}//LocalClassInStaticMethod
		// 实例化局部类LocalClassInStaticMethod
		LocalClassInStaticMethod localClassInStaticMethod = new LocalClassInStaticMethod();
		localClassInStaticMethod.sayHello();
	}
}//OuterClass3

public class CreateLocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass3 outerClass3 = new OuterClass3();
		outerClass3.createLocalClass();
		OuterClass3.staticCreateLocalClass();                              // 强烈不推荐在static方法中定义局部类
	}

}
