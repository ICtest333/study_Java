
public class Ex01_06 {

	public static void main(String[] args) {
		
		int money_give = 10000;
		int money_moca = 3500;
		int su = 2;
		
		int prise;
		prise = money_moca * su;
		int tax = (int)(prise * 0.1);
		int prise_total=prise + tax;
		int money_back= money_give - prise_total;
		
		System.out.printf("������ �� : %,d \n" , money_give );
		System.out.printf("ī�� ��ī �ܰ� : %,d \n" , money_moca);
		System.out.printf("���� : %,d \n" , su);
		System.out.printf("�ΰ��� : %,d \n" , tax);
		System.out.printf("��ǰ �Ѿ� : %,d \n" ,  prise_total );
		System.out.printf("�Ž����� : %,d \n" , money_back);
		
		
		/*System.out.println("������ �� : " + money_give);
		System.out.println("ī�� ��ī �ܰ� : " + money_moca);
		System.out.println("���� : " + su);
		System.out.println("�ΰ��� : " + tax );
		System.out.println("��ǰ �Ѿ� : " +  prise_total);
		System.out.println("�Ž����� : " + money_back);*/
	}
}
