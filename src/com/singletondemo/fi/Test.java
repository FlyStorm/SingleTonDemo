package com.singletondemo.fi;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	/**
	 * ����ö��ʵ�ַ�ʽ
	 */
	private static void test5() {
		EnumSingleTon est1=EnumSingleTon.INSTANCE;
		EnumSingleTon est2=EnumSingleTon.INSTANCE;
		System.out.println(est1);
		System.out.println(est2);
	}
	/**
	 * ���Ծ�̬�ڲ��෽ʽ
	 */
	private static void test4() {
		StaticInnerSingleTon sist1=StaticInnerSingleTon.getInstance();
		StaticInnerSingleTon sist2=StaticInnerSingleTon.getInstance();
		System.out.println(sist1);
		System.out.println(sist2);
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
