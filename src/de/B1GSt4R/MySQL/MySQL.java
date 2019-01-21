package de.B1GSt4R.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQL {
	public static String host;
	public static String port;
	public static String dbname;
	public static String username;
	public static String pw;
	public static Connection con;
	
	public static void connect(){
		if(!isConnected()){
			try {
				con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname, username, pw);
				System.out.println("[MySQL] Connection Open!");
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void disconnect(){
		if(isConnected()){
			try {
				con.close();
				System.out.println("[MySQL] Connection Closed!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static boolean isConnected(){
		return (con == null ? false : true);
	}
	
	public static Connection getConnection(){
		return con;
	}
}
