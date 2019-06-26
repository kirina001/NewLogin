package com.testing.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMysql {
	public Connection conn;
	// 数据库连接的地址、用户名和密码
	// ?之前是数据库的地址端口和数据库名，？后面的是连接的参数。
	public static final String DBURL = "jdbc:mysql://localhost:3306/testframe?useUnicode=true&autoReconnect=true&characterEncoding=utf-8";
	public static final String DBUSER = "root";
	public static final String DBPWD = "";

	public ConnectMysql() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
			// 设置超时时间
			DriverManager.setLoginTimeout(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
