/* super() ���� - ó�� ��
 * 
 * 
 * */

package com.ext2;

//�θ� Ŭ����
class Point_{
	int x;
	int y;
	
	public Point_(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation(){
		return "x : " + x + ", y" + y;
	}
}


//�ڽ� Ŭ����
class Point3D_ extends Point_{		

	
Point3D_(int x, int y, int z){		
		//�ʱ�ȭ ������ �����Ƿ� ������ ��Ȯ�� ����� �Ѵ�.
		/*this.z = z;
		super(x, y);*/	
	
		super(x, y);	
		this.z = z;
		
	}
	
	int z;
	
	@Override	//�޼ҵ� ������
	public String getLocation(){
		return "x: " + x + ", y: " + y + ", z: " + z;
	}	
}

public class SuperEx04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point3D_ p3d = new Point3D_(7, 8, 9);
		System.out.println(p3d.getLocation());

	}
}
