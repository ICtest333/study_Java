
public class Ex02_07 {

	public static void main(String[] args) {
		/*��ǻ�� ����, ����, �Ϲݼ���, �ڹ� ���� ���� ������ �Է��ϰ� 
		�� ������ ������ ����, ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		(�� ������ ������ �迭�� �����ϰ� �迭�� ����)*/
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"��ǻ�� ����","����","�Ϲݼ���","�ڹ�"};
		int[] score = new int[subname.length];
		int total =0;
		float average =0.0F;
		
		for(int i=0; i < score.length; i++){
		
			System.out.print( subname[i] + " �� ������ > ");
			do{
				score[i] = input.nextInt();
				
			}while(i <0 || i>100);
			
			total += score[i];
		}
		
		average = total/score.length ;		
		
		for(int j=0; j < subname.length; j++){
			System.out.print( subname[j] + "\t");
		}
		System.out.print("����\t");
		System.out.println("���");
		
		for(int k=0; k < score.length; k++){
			System.out.print( score[k] + "\t");
			
		}
		System.out.print(total + "\t");
		System.out.println(average);
	}
}
