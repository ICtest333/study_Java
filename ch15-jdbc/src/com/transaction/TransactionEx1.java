/* �������� TRANSACTION ���� - ����Ŀ�� ������ Ȯ��
 * 
 * 
 * ���� Ŀ�� ó��
 * ���� Ŀ�� ó��
 * -------------------------------------------------------------------
 * ���� Ŀ�� �Ǳ� ������ 
 * SQL�� 1~3�� ����ǰ� 4�� ����ȵǾ
 * �������� �ܰ��� �Ͼ�� �ִ� ������ �߻��մϴ�.
 * 
 * ���� Ŀ�ԵǾ� ������ ROLLBACK�� ������ �� �����ϴ�. 
 * 
 */

package com.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class TransactionEx1 {

	public static void main(String[] args) {
		//���� ���� ����
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql ="";
		
		
		try{
			//JDBC 1�ܰ� ����: DRIVER�ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2�ܰ�: Connection ��ü ����
			con = DriverManager.getConnection(dbURL, id, passwd);
			//JDBC 3�ܰ�: Statement��ü ����
			stmt = con.createStatement();
			
			//SQL�� ����1: INSERT
			sql = "INSERT INTO test1 values('sys01', 10)";
			stmt.executeUpdate(sql);	//JDBC 4�ܰ�: SQL ����
			//SQL�� ����2: INSERT
			sql = "INSERT INTO test1 values('sys02', 20)";
			stmt.executeUpdate(sql);			
			//SQL�� ����3: INSERT
			sql = "INSERT INTO test1 values('sys03', 30)";
			stmt.executeUpdate(sql);
			//SQL�� ����4: INSERT
			//���Ƿ� ���� �߻���Ŵ
			sql = "INSERT INTO test1 values('sys04', 40";	//ERROR:	java.sql.SQLException: ORA-00917: ������ �޸�
			stmt.executeUpdate(sql);		
			
			System.out.println("SQL�� ����Ϸ�");
			
			
//			int count = stmt.executeUpdate(sql);
//			rs = stmt.executeQuery(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			if( stmt!=null){ try{stmt.clearBatch();}catch(SQLException e){e.printStackTrace(); } };
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }	
			
		}

	}

}
