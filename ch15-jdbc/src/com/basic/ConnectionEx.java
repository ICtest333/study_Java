/* JDBC �����׽�Ʈ
 * 
 */
package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
	
	public static void main(String[] args){
		//���� ���� ����
		//JDBC����ϸ鼭 OracleDB�� ����ϸ� thin����̹��� ����Ͽ� IP�� ��Ʈ�� ���� �� DB�� SID						//
		//"jdbc:oracle:thin:@	192.168.0.10:1521:orcl";
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		try{
			//JDBC ���� 1�ܰ�: ����̹� Ŭ���� �ε�
			//������ ����̹� Ŭ������ ã�Ƽ� �޸𸮿� �ε��Ŵ
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC ���� 2�ܰ�: Connection ��ü(URL, ID, PASSWORD)���� ���� ���� ����
			Connection con = DriverManager.getConnection(dbURL, id, passwd);
			System.out.println("Connection��ü�� �����Ǿ����ϴ�.");
			System.out.println(con);
		}catch(SQLException e) {
			e.printStackTrace();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();			
		}
	}
}
