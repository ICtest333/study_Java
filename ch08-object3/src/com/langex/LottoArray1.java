/* �ζ� ���α׷� ����� - �迭�̿� - ���1
 * 
 * 1) 6���� ����(�迭) ����
 * 2) ���� �߻� (1~45)
 * 3) �ߺ��� Ȯ���ϸ鼭 �ߺ����� ���� �����͸� �迭�� ����
 *  
 */

package com.langex;

public class LottoArray1 {

	public static void main(String[] args) {
		// 1) 6���� ����(�迭) ����
		// 0 1 2 3 4 5 
		int[] lotto = new int[6];
		
		// 2) ���� �߻� (1~45)
		//(int)(Math.random()*45) + 1;	//0~44���� �߻�		
		
		// 3) �ߺ��� Ȯ���ϸ鼭 �ߺ����� ���� �����͸� �迭�� ����
	
		for(int i = 0; i < lotto.length; i++){	//�迭�� ���� ���� (6��)
			//lotto[i] = (int)(Math.random()*45) + 1;
			
			int tmp = (int)(Math.random()*10) + 1;
			
			if(i == 0){
			   lotto[i] = tmp;			   
			}
			else{
			   for(int j=0; j< i; j++){				   	
				   	
					if( lotto[j] != tmp){
						lotto[i] = tmp;	
						//System.out.println("lotto[" +j +"]:"+lotto[j]+ "\t"+ "tmp:" +  tmp);
					}				
					else{
						//System.out.println("lotto[" +j +"]:"+lotto[j]+ "\t"+ "tmp:" +  tmp + "�����ϴ�.");
						i--; break;
					}
				}						   
			}
			System.out.println("----------------------------");
		}
		
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
		
		System.out.print("\nlott ��÷��ȣ: ");
		for(int i =0; i < lotto.length; i++){
			System.out.print(lotto[i] + "  " );
		}		
	}
}
