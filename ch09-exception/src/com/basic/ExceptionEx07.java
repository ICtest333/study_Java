/* ����ó�� - ����� ���� ���� ó��
 * 
 * 
 * ����� �Էµǰ� �ϰ�
 * ���� �Է½� ����ó���ϱ�
 * 
 * 
 * ����� ���� ���� Ŭ���� �ۼ�: ���ܹ����� �޾Ƽ� ó���ϱ� ���� ���
 */

package com.basic;

//����� ���� ���� Ŭ����
class UserException extends Exception{
	public UserException(String str){
		super(str);
	}
}

public class ExceptionEx07 {

	public static void main(String[] args) {
		
//		UserException ux = new UserException(str);
		
		try{
			int a = -11;
			if( a <=0 ){
				//����ڰ� ������ ���ܸ� ���������� �߻���Ŵ
				//���� �߻��� UserException��ü�� �����ǰ� �ش� �޽����� ���޵�
				throw new UserException("����� �ƴմϴ�");				
			}			
		}catch(UserException e){
			System.out.println(e.getMessage());
		}
	}
}
