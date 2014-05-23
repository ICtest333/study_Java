/* SQL - SELECT
 * 
 * 
 * rs.next()
 * next()�� ResulSet�ۿ� �ִ� Ŀ���� ResulSet�� ��������� �ı��
 * next( )�� �̿��ؼ� ���� �����մϴ�.
 */

package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement; 

public class SelectEx {
	public static void main(String[] args){
		//���� ���� ����
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			//JDBC ���� 1�ܰ�: ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//JDBC ���� 2�ܰ�: Connection ��ü ����
			con = DriverManager.getConnection(dbURL, id, passwd);
			
			//���� SQL�� ����
			//String sql ="SELECT * FROM test1";	//�÷��� �ε����� ������� ����
			//String sql ="SELECT id, age FROM test1";
			String sql ="SELECT age, id FROM test1";	
			//�ε����� ��½� �÷��� ������ �°� ��¿� ����� �ε����� ������ �־�� �մϴ�. �׷��� ������ ERROR
			//DB�� �ε����� �ƴ϶� 
			//SELECT�� �� �ε����� ��µǹǷ� �� ���߾��־�� �մϴ�. �ε������ٴ� �÷����� ����ϸ� ERROR�� ���� �� �ִ�. 
			
			//JDBC ���� 3�ܰ�: Statement��ü ����
			stmt = con.createStatement();
			
			//JDBC ���� 4�ܰ�: SQL�� ����
			//JDBC ���� 5�ܰ�: ResultSet ��ü ����
			//������� ResultSet�� ����
			rs = stmt.executeQuery(sql);
			System.out.println("�̸�\t����");
			
			//ResultSet�� ����� ����� ���
			while(rs.next()){	//
				//����� ������ ������ �Ǹ� Ŀ���� 
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getInt("age")+ "\n");
				//DB �ε����� ���
//				System.out.print(rs.getString(1)+"\t");
//				System.out.print(rs.getInt(2)+ "\n");
				
			}	
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{	//�ڿ�����
			//�ڿ��� �����ߴ� �������� �ڿ��ݳ��� �����մϴ�.
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace(); } }
			if( con!=null){ try{con.close();}catch(SQLException e){ e.printStackTrace(); } }		
		}		
	}
}
