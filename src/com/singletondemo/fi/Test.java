package com.singletondemo.fi;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1();
		test2();
	}
	/**
	 * ��������ʽ
	 */
	private static void test2() {
		LazySingleTon lst1=LazySingleTon.getInstance();
		LazySingleTon lst2=LazySingleTon.getInstance();
		System.out.println(lst1);
		System.out.println(lst2);
	}

	/**
	 * ���Զ���ʽ,���������Ƿ���ͬһ������
	 */
	private static void test1() {
		HungleSingleTon hst1 = HungleSingleTon.getInstance();
		HungleSingleTon hst2 = HungleSingleTon.getInstance();
		System.out.println(hst1);
		System.out.println(hst2);
	}

}
