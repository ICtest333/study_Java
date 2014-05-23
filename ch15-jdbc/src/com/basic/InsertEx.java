/* SQL - INSERT
 * 
 * ������ �ֱ�  
 */

package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEx {
	public static void main(String[] args){
		//���� ���� ����
		//JDBC����ϸ鼭 OracleDB�� ����ϸ� thin����̹��� ����Ͽ� IP�� ��Ʈ�� ���� �� DB�� SID						//
		//"jdbc:oracle:thin:@	192.168.0.10:1521:orcl";
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		Connection con = null;
		Statement stmt = null;
		
		try{
			//JDBC ���� 1�ܰ�: ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC ���� 2�ܰ�: Connection ��ü(URL, ID, PASSWORD)���� ���� ���� ����
			con = DriverManager.getConnection(dbURL, id, passwd);
			
			//SQL������ String ������ ����
			String sql = "INSERT INTO test1(id, age) VALUES('prettybird', 70)";
			//JDBC ���� 3�ܰ�: Statement ��ü ����
			//Table�� �����ؼ� SQL�� ����
			stmt = con.createStatement();
			//JDBC ���� 4�ܰ�: SQL�� ����
			//executeUpdate() ������ �Էµ� ���� ������ ��ȯ��
			int count = stmt.executeUpdate(sql);			
			System.out.println(count + "���� ���� �߰��Ͽ����ϴ�.");
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{	//�ڿ� ����
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace();} }
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }			
		}		
	}
}
