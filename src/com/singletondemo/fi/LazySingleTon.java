package com.singletondemo.fi;
/**
 * ������
 * �̰߳�ȫ������Ч�ʲ��ߣ����ǿ�����ʱ���أ��������������ʹ�õ�ʱ���ȥ���أ�
 * ���⣺��Դ�����ʸ��ˣ�����ÿ�ε���getInstance()������Ҫͬ��,����Ч�ʵ͡�����ɵ���Ч�ʵͣ�����߳�ȥ���ã�����һ���ȴ���
 * �Ƚϣ��������ഴ����Ķ�����ۺܸߣ�����ʹ����ʱ��������ʽ���������ഴ���ĵ��÷ǳ�Ƶ���������ö���ʽ��
 * @author Administrator
 *
 */
public class LazySingleTon {
	//����˽�о�̬����
	private static LazySingleTon instance;
	//����˽�й��췽��
	private LazySingleTon(){};
	public static LazySingleTon getInstance(){
		if(instance==null){
			instance=new LazySingleTon();
		}
		//���ǵ�һ�ν��룬��ֱ�ӷ���֮ǰ�����Ķ��󣬱�֤����
		return instance;
	}
}
