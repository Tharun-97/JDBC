package org.connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class SqlConnection {

	public static void main(String[] args)throws Exception {
		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:sqlserver://192.168.168.12;databaseName=New_joinee_2022", "NewJoinee2022", "P@ssw0rd");
			
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM THARUN_EMPLOYEES");
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
