package com.singletondemo.fi;
/**
 * �����ֵ���ģʽ����̬�ڲ���ʵ�ַ�ʽ
 * �ŵ㣺�̰߳�ȫ������Ч�ʸߣ����������أ�ʹ�õ�ʱ�򣬵������ľ�̬��������������
 * �����ǵ�һ�γ�ʼ��������ʱ�򣬲�����������ʼ�����ľ�̬�ڲ��ֻ࣬���������������ľ�̬������ʱ��
 * �Ż���س�ʼ����̬�ڲ��࣬�Ӷ�ʵ��������ʵ������ʱ���ء�
 * �����ʵ����Ȼ���̰߳�ȫ��Ҳ������ͬ��������Ч�ʸߡ��ܶ࿪Դ����õ�������ʱ�򣬾ͻ�ʹ�������ʽ��
 * @author Administrator
 *
 */
public class StaticInnerSingleTon {
	//˽�й��췽��
	private StaticInnerSingleTon(){}
	//������̬�ڲ���
	private static class Single{
		//ʵ��������static final���ͣ���֤���ڴ���ֻ��һ��ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ��Ӷ���֤���̵߳İ�ȫ
		private static final StaticInnerSingleTon instance=new StaticInnerSingleTon();
	}
	//�����Ķ�����ʷ���
	public static StaticInnerSingleTon getInstance(){
		return StaticInnerSingleTon.Single.instance;
	}
}
