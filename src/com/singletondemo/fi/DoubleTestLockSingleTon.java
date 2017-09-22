package com.singletondemo.fi;
/**
 * ˫�ؼ����ģʽ
 * ���ģʽ�ǽ�ͬ�����ݷŵ�if�ڲ��������ִ��Ч�ʣ�����ÿ�λ�ȡ���󶼽���ͬ����ֻ�е�һ�β�ͬ����������֮���û��Ҫ�����ģʽ�������Ч�ʣ�
 * ��������ʱ���أ����ǣ�����JVM�ײ��ڲ�ģ��ԭ��ż��������⣬һ�㲻����ʹ��
 * @author Administrator
 *
 */
public class DoubleTestLockSingleTon {
	//˽�о�̬���ԣ�����ʼ��Ϊ��
	private static DoubleTestLockSingleTon instance=null;
	//˽�й��췽��
	private DoubleTestLockSingleTon(){}
	//����һ������Ĺ�������
	public static DoubleTestLockSingleTon getInstance(){
		if(instance==null){
			DoubleTestLockSingleTon dtst;
			synchronized (DoubleTestLockSingleTon.class) {
				dtst=instance;
				synchronized (DoubleTestLockSingleTon.class) {
					if(dtst==null){
						dtst=new DoubleTestLockSingleTon();
					}
					instance=dtst;
				}
			}
			
		}
		return instance;
	}
}
