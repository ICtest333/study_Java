
public class ArrayEx07 {

	public static void main(String[] args) {
		// 2���� �迭
		
		//�迭 ����
		int test[][];
		
		//�迭 ����
		test = new int[2][3];
		
		//�迭 �ʱ�ȭ
		test[0][0] =100;
		test[0][1] =200;
		test[0][2] =300;

		test[1][0] =400;
		test[1][1] =500;
		test[1][2] =600;		
		
		//2���� �迭 ���
		for( int i=0; i<test.length; i++){
			
			for(int j=0; j<test[i].length; j++){
				System.out.println("test[" + i + "][" + j +"] = "+ test[i][j]);				
			}
		}
		
		//================== �迭 ���� ���
		//�迬 ����� ���ÿ� ����
		int[][] exam1 = new int[2][3];
		
		//�迭 ���� �� ����, �ʱ�ȭ ���� ����(����� �迭 ����)
		int[][] exam2 = new int[][]{{100,200,300}, {400,500,600}};
		
		//�迭 ���� �� ����, �ʱ�ȭ ���� ���� (�Ͻ��� �迭 ����)
		int[][] exam3 = { {100,200,300},{400,500,600} };
		
		int[][] exam4 = { 
							{100,200,300},
							{400,500,600} 
						};
		
	}
}
