/* �θ� Ŭ���� ����
 * 
 * �ڽ�Ŭ����(Protoss, Terran, Zerg)���� 
��ӹ��� �θ� Ŭ������ �����մϴ�.*/

package com.abs2;

//�߻� Ŭ����: �θ� ���Ҹ�
public abstract class Unit {
	protected String name;
	protected int energy;
	
	//�߻� �޼ҵ�: ������ �ʼ�
	abstract public void decEnergy();
	
	//�Ϲ� �޼ҵ�: ������ ������
	public int getEnergy(){
		return energy;
	}
}
