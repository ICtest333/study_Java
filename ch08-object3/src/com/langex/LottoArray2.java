/* �ζ� ���α׷� ����� - �迭�̿� - ���2
 * 
 * 
 * */

package com.langex;

public class LottoArray2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		// 2) ���� �߻� (1~45)
		//(int)(Math.random()*45) + 1;	//0~44���� �߻�		
		
		// 3) �ߺ��� Ȯ���ϸ鼭 �ߺ����� ���� �����͸� �迭�� ����
	
		for(int i = 0; i < lotto.length; i++){	
			lotto[i] = (int)(Math.random()*45) + 1;	//�迭�� ���� ����(6��)
					
	
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
	
		//���		
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
		
		/*System.out.print("\nlott ��÷��ȣ: ");
		for(int i =0; i < lotto.length; i++){
			System.out.print(lotto[i] + "  " );
		}*/
	}
}
