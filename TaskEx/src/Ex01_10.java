
public class Ex01_10 {

	public static void main(String[] args) {
		
		System.out.println("=== for�� 1(����)===");
		for(int i = 1; i < 10; i++)
			System.out.printf("%5d", i);
		System.out.println();		
		
		System.out.println();	
		System.out.println("=== while�� 1(��)===");
		int j = 1;
		while(j < 10){
			System.out.printf("%5d", j);
			j ++;
		}
		System.out.println();		
		
		
		System.out.println();
		System.out.println("=== for�� 2(����)===");
		for(int k = 10; k >= 0; k -= 3)
			System.out.printf("%5d", k);
		System.out.println();
		
		System.out.println();	
		System.out.println("=== while�� 2(��)===");
		int l = 10;
		while(l >= 0){
			System.out.printf("%5d", l);
			l -= 3;
		}
		System.out.println();
	}
}
