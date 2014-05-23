/* �������� TRANSACTION ���� - ����Ŀ�� ������ �ذ�
 * 
 * 
 * ���� Ŀ�Ը� ���� Ŀ��ó���� �����Ͽ� �����ϱ� 
 * �����߻��� ��� Ʈ������ ROLLBACK��Ű�� 
 * -----------------------------------------------------------------------------------------------
 * 
 * �������� ������ ����� �����Ϳܰ��� �����ϱ� ���� ����Ŀ�� ���(Ʈ������ ó��)
 * ���ܰ� �߻��� ��쿡�� ROLLBACK�����ϱ� ������
 * SQL���� ö���ϰ� �����ؾ� �մϴ�. (�������� SQL���� ���� rollback�Ҽ� �����ϴ�)
 */

package com.transaction;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class TransactionEx2 {

	public static void main(String[] args) {
		//���� ���� ����
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		Connection con = null;
		Statement stmt = null;
		String sql ="";
		
		//SQL���� ���� ���� ����Ȯ�� ����
		boolean success = false;
		
		try{
			//JDBC 1�ܰ�: DRIVER �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2�ܰ�: Connection ��ü ����
			con = DriverManager.getConnection(dbURL, id, passwd);
			//AUTOĿ���� Connection���� �⺻�����Ǿ� ����
			//AUTOĿ�� ����
			con.setAutoCommit(false);
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
			sql = "INSERT INTO test1 values('sys04', 40";	//ERROR: java.sql.SQLException: ORA-00917: ������ �޸�
			stmt.executeUpdate(sql);					
			
			//SQL���� ���������� ���ϴ� ��� catch(SQLException e)������ �̵��ϰ� �˴ϴ�.
			//SQL���� ���������� ����Ǿ��� ���
			success = true;
			
			System.out.println("SQL�� ����Ϸ�");
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();			
		}finally{	
			try{
				if(success){	//���������� ������ ó��
					con.commit();

				}else{			//������������ ������ ó��
					con.rollback();
				}
			}catch(SQLException e){ e.printStackTrace(); }			
			
			//�ڿ�����
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace();} }
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }			
		}
	}
}
