package com.singletondemo.fi;
/**
 * ��һ�֣�����ʽ
 * ������ص�ʱ����������������󣬶����ṩһ������������ȡ�������������̰߳�ȫ������Ч�ʸߡ�
 * �����������û���õ�������󣬻������Դ�˷ѣ�һ������ϣ����ʱ���أ��������õ���ʱ��ȥ���أ�Ҳ��������ʽ��
 * ����ʽʵ���ˣ���ʱ���ء�
 * @author Administrator
 *
 */
public class HungleSingleTon {
	//�ṩһ����̬static��˽�����ԡ�
	private static HungleSingleTon instance=new HungleSingleTon();
	//����˽�й��췽�����������˾Ͳ��ܷ���
	private HungleSingleTon(){}
	//�ṩһ�����ŵķ�����ֻ�ܴӷ�������ȡ����
	public static HungleSingleTon getInstance(){
		//����û��ͬ��������Ч�ʸ�
		return instance;
	}
}
