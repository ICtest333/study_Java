
public class BreakEx02 {
	public static void main(String[] args){
		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				
				if(j==3)
					//break�� ���Ե� 
					break;
					
				System.out.println(i + " , " + j);
			}
				
		}
		
		
		System.out.println("=======================");
//		���� �ݺ������� break�� �� ��� �ݺ����� ������ ���������� �Ϸ��� break label���� �����.
		
		exit_for:	//break label����
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				
				if(j==3)
					//break�� ���Ե� 
					break exit_for;	// break labelȣ�� 
				
					
				System.out.println(i + " , " + j);
			}
				
		}
	}

}
