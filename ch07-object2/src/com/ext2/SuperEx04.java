/* super() ���� - ó�� �� 
 * 
 * */

package com.ext2;

//�θ� Ŭ����
class Point{
	
	public Point(){		
	}	
	
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation(){
		return "x : " + x + ", y" + y;
	}
}

//�ڽ� Ŭ����
class Point3D extends Point{
	
	Point3D(){		
	}
			
	Point3D(int x, int y, int z){		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	int z;
	
	@Override	//�޼ҵ� ������
	public String getLocation(){
		return "x: " + x + ", y: " + y + ", z: " + z;
	}	
}

public class SuperEx04 {

	public static void main(String[] args) {
		//��ü ����
		Point3D p3d = new Point3D(1, 2, 3);
		//�������� �޼ҵ� ȣ��
		System.out.println(p3d.getLocation());

	}
}
