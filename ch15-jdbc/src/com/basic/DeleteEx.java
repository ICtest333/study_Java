/* SQL - DELETE 
 * 
 * -----------------------------------
 * �ڹٴ� AUTO COMMIT�̴�.
 * �׷���, �ѹ�(ROLLBACK)�� ���� �ʽ��ϴ�.
 */


package com.basic;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteEx {

	public static void main(String[] args) {
		//���� ���� ����
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql="";		
		
		try{
			//JDBC 1�ܰ�: Driver �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2�ܰ�: Connection ��ü ����
			con = DriverManager.getConnection(dbURL, id, passwd);
			//JDBC 3�ܰ�: Statement��ü ����
			stmt = con.createStatement();			
			
			//DELETE�� WHERE���� �ʰ� ������ ��� ���� �Ұ����մϴ�.
			//�ڹٴ� �ڵ�Ŀ�ԵǱ� ������ �ѹ��� ���� �ʽ��ϴ�.
			sql="DELETE FROM test1 WHERE id='bigbird'";
			//JDBC 4�ܰ�: SQL�� ����
			//����� int������ ��ȯ
			int count = stmt.executeUpdate(sql);
			//��ȯ�� �������� ����ؼ� SQL���� ����� �� ����� ���ڵ��� ������ Ȯ���� �� �ֽ��ϴ�.
			System.out.println(count +"���� ���� �����Ǿ����ϴ�");
			
			sql="SELECT * FROM test1";
			//JDBC 5�ܰ�: ��� ResultSet�� ����
			rs = stmt.executeQuery(sql);
			System.out.println("ID\tAGE");
			//����� ���
			while(rs.next()){
				System.out.print(rs.getString("id") + "\t" + rs.getInt("age") + "\n");				
			}			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}finally{	//�ڿ�����
			if( stmt!=null){ try{stmt.clearBatch();}catch(SQLException e){e.printStackTrace(); } };
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }			
		}
	}
}