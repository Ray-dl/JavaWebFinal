package com.cabinetMed.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.*;

public class BaseDao {
    static String URL= "jdbc:mysql://localhost:3306/serveurjava";
    static String USER= "root";
    static String PASSWORD= "";
    static Connection conn=null;
    public static final String DRIVER="com.mysql.jdbc.Driver";
    
    public static Connection getconn() {
    	Connection conn=null;
    	try {
    		Class.forName(DRIVER);
    		conn=(Connection) DriverManager.getConnection(URL,USER,PASSWORD);
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    		
    	}
    	
    	return conn;
    }

	public static int exectPatientBD(String sql, Object[] params) {
		// TODO Auto-generated method stub
		
		int count=0;
		Connection conn=BaseDao.getconn();
		PreparedStatement ps=null;
		
		//insert into Patient les donnees
		
		try {
		    
			//preparer le sql
			ps=(PreparedStatement) conn.prepareStatement(sql);
			
			for(int i=0;i<params.length;i++) {
				ps.setObject(i+1, params[i]);
			}
			
			count=ps.executeUpdate();	
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}finally {
			
			BaseDao.closeall(null,ps,conn);
			
		}
	
		return count;
	}

	private static void closeall(ResultSet rs, PreparedStatement ps, Connection conn2) {
		// TODO Auto-generated method stub
		try {
			if(rs!=null)
			    rs.close();
			if(ps!=null)
				ps.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
   
    
    
    
	
	}

