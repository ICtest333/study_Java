/* SQL - Update
 * 
 */

package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEx {

	public static void main(String[] args) {
		//���� ���� ����
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try{
			//JDBC 1�ܰ�: ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2�ܰ�: Connection ��ü ����
			con = DriverManager.getConnection(dbURL, id, passwd);
			//JDBC 3�ܰ�: Statement ��ü ����
			stmt = con.createStatement();
			
			
			//DB ������Ʈ(����)
			sql = "UPDATE test1 SET age=10 WHERE id='bluebird'";
			//sql = "UPDATE test1 SET age=10";	//WHERE�� �����
			//sql = "UPDATE test1 SET age=20 WHERE id='dragon'";	//���� ID ���� �õ�
			//JDBC 4�ܰ�: SQL ����
			int count = stmt.executeUpdate(sql);			
			System.out.println(count + "�� ���� ������ �����߽��ϴ�.");
			
			
			//DB ��ü ������ �б�
			sql ="SELECT * FROM test1";
			//JDBC 4�ܰ�: SQL ����
			//JDBC 5�ܰ�: ResultSet�� ��� ����
			rs = stmt.executeQuery(sql);
			System.out.println("ID\tAge");
			while(rs.next()){
				System.out.print(rs.getString("id")+ "\t");
				System.out.print(rs.getInt("age")+ "\n");				
			}			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}finally{
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace();} }
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace(); } }			
		}
	}
}
