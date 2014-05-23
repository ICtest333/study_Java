/* ����ó�� - ���� ���� �߻�
 * 
 * ���α׷� ����� ���ڿ� �迭�� �޾Ƽ� 
 * �����ϰ� 
 * ����ϴ� ���α׷� �ۼ�
 * 
 * 
 * ���ܸ� ������ �߻����� ����ڿ��� �� ���ܰ� �߻��ߴ��� �ȳ��ϴ� ����
 * ����ڰ� �߸��� �����͸� �Է��ϴ� ��� �ַ� ���
 */


package com.basic;

public class ExceptionEx05 {
	// ���ܸ� ������ �߻���Ŵ
	
	public void methodA(String[] n) throws Exception{
		if(n.length > 0){
			for(int i=0; i<n.length; i++){
				System.out.println("n[" + i + "]: " + n[i]);
			}			
		}else{
			//���ܸ� ������ �߻���Ŵ, ����ڿ��� �� ���ܰ� �߻��ߴ��� �ȳ��ϴ� ����
			throw new Exception("�Է��� �����Ͱ� �����ϴ�");
			//�̰��� ������ ����ϵ��� ��
			//System.out.println("�Է��� �����Ͱ� �����ϴ�");
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionEx05 ex = new ExceptionEx05();
		try{
			ex.methodA(args);
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
	}
}
