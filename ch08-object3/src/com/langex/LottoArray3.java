/* �����ϱ�
 * 
 * java.util.Arrays.sort()
 * 
 * */


package com.langex;

import java.util.Arrays;

public class LottoArray3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
	
		for(int i = 0; i < lotto.length; i++){	
			lotto[i] = (int)(Math.random()*45) + 1;	
					
	
		   for(int j=0; j< i; j++){			   	
				if( lotto[i] == lotto[j]){
					System.out.println("�ߺ��� �߻�:\t lott["+i+"]: " + lotto[i]);
					i--; 	//�ߺ��Ǹ� i�� ������ ���´�
					break;	//�̹� �ߺ����� Ȯ���߱� ������ �ݺ��� Ż��					
				}				
				else{
				}
			}				   
		}		
		
		//���� ��	
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
	
		System.out.println("\n -----------------------");
		//����
		Arrays.sort(lotto);
		
		//���� ��
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
	}
}
