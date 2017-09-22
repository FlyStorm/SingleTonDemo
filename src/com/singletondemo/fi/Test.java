package com.singletondemo.fi;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	/**
	 * ����˫�ؼ����ģʽ
	 */
	private static void test3() {
		DoubleTestLockSingleTon dtlst1=DoubleTestLockSingleTon.getInstance();
		DoubleTestLockSingleTon dtlst2=DoubleTestLockSingleTon.getInstance();
		System.out.println(dtlst1);
		System.out.println(dtlst2);
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
