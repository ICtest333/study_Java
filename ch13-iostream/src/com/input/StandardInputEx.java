/* ǥ�� �����
 * 
 * �����Է�
 * �ѱ��Է�
 * ----------------------------------------------------
 * �����ؽ�Ʈ(1byte)�� ó�������ϰ� 
 * 2byte(�ѱ�)�� ó���Ǿ���ϴ� ���ڴ� ����,
 * ���� �̹���� �������� �Է��� ó���ϴ� ����Դϴ�.
 * 
 */

package com.input;

import java.io.IOException;

public class StandardInputEx {
	
	public static void main(String[] args){
		//
		try{
			int input = 0;
			//ǥ���Է�			
			//System.in�� �̿��� InputStream�� ��� �ٷ� read()�� ����Ͽ� �Է��� ������ ��
			//1byte���� �о ó��
			while( (input=System.in.read()) != -1){
				// byte�� ó���Ǳ� ������ ����� ���ؼ��� (char)�� ����ȯ���־�� �մϴ�.
				//abcd�츮�����ڸ� �Է��ϸ� 1byte���� �б⶧���� a���ڸ� �ƽ�Ű �ڵ尪�� 97���� ����ϰ�
				//(char)����ȯ�Ͽ��� �������� ���ڸ� Ȯ���� �� �ֽ��ϴ�.
				System.out.println("input: " + input + ",(char)input: " + (char)input);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
