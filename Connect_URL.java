package aui;
/*=====================================================================
File: 	 ConnectURL.java


Summary: This Microsoft JDBC Driver for SQL Server sample application
         demonstrates how to connect to a SQL Server database by using 
		 a connection URL. It also demonstrates how to retrieve data 
		 from a SQL Server database by using an SQL statement.
---------------------------------------------------------------------
This file is part of the Microsoft JDBC Driver for SQL Server Code Samples.
Copyright (C) Microsoft Corporation.  All rights reserved.

This source code is intended only as a supplement to Microsoft
Development Tools and/or on-line documentation.  See these other
materials for detailed information regarding Microsoft code samples.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF
ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
PARTICULAR PURPOSE.
=====================================================================*/
import java.sql.*;
import java.io.*;
/**
 *
 * @author sqlitetutorial.net
 */
public class Connect_URL  {

	/**
	 * Connect to the test.db database
	 * @return the Connection object
	 */
	Connect_URL(){}	

	private Connection connect() {
		// SQLite connection string
		String url = "jdbc:sqlite:C:\\cworld\\Database C programming\\Requestjava";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	/**
	 * select all rows in the warehouses table
	 * @throws CloneNotSupportedException 
	 * @throws SQLException 
	 * @throws IOException 
	 */


	public void selectAll(Queue_of_Requests ReQ) throws CloneNotSupportedException{
		String sql = "SELECT * From Requests "
				+ "where Request_Status = 'Submitted';";
				//+ "where Request_Status ='Submitted';";
		Request REQ = new Request();
		String REQUEST_ID ,REQUEST_STATUS,REQUEST_DATE,REQUEST_BRANCH;
		
		try (Connection conn = this.connect();
				Statement stmt  = conn.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)){
			while (rs.next()) 
			{
				REQUEST_ID=rs.getString("RequestID");
				REQUEST_STATUS=rs.getString("Request_Status");
				REQUEST_DATE=rs.getString("Request_Date");
				REQUEST_BRANCH=rs.getString("RequestBranch");

				REQ.set_branch(REQUEST_BRANCH);
				REQ.set_Request_Status_String(REQUEST_STATUS);
				REQ.Set_Date(REQUEST_DATE);
				REQ.set_Req_number(REQUEST_ID);
				/*Debug*/
				REQ.setFrom_Date("Sunday, December 13, 2022 11:22:45 AM");
				REQ.setTO_Date("Thrusday, March 17, 2022 11:22:45 AM");
				REQ.Req_email.CC = "Mohamed";
				REQ.Req_email.From = "DigitalBanking";
				ReQ.inQueue(REQ);
				ReQ.debug();
			}

			System.out.println(REQ.get_Req_number()+REQ.get_Request_status_String()+REQ.get_Date()+REQ.get_branch()+ "this is RS loop ");
		} catch (SQLException e) {System.out.println(e.getMessage());}
	}    
		
	public void Select_Branch(Queue Branch,Queue_of_Requests ReQ) throws CloneNotSupportedException{
			String sql = "SELECT DATA FROM PDF;";
			Request REQ = new Request();
			
			try (Connection conn = this.connect();
					Statement stmt  = conn.createStatement();
					ResultSet rs    = stmt.executeQuery(sql)){

				// loop through the result set
				while (rs.next()) {
					/*
         	REQ.set_Req_number(rs.getString("RequestID")) ; 
            REQ.set_Request_Status_String(rs.getString("Request_Status"));
            REQ.Set_Date(rs.getString("Request_Date"));
            REQ.set_branch(rs.getString("RequestBranch"));
            REQ.set_MajorReqType(0);
     	   REQ.set_MinorReqType(1111);
     	   REQ.set_rim_number(rs.getInt("Rim_Number"));
					 */
					rs.getBlob("PDF");

             		REQ.setFrom_Date("Sunday, December 13, 2022 11:22:45 AM");
					REQ.setTO_Date("Thrusday, March 17, 2022 11:22:45 AM");
					REQ.Req_email.CC = "Mohamed";
					REQ.Req_email.From = "DigitalBanking";

					ReQ.inQueue(REQ);
					ReQ.debug();
					System.out.println(REQ.get_Req_number()+REQ.get_Request_status_String()+REQ.get_Date()+REQ.get_branch()+ "this is RS loop ");
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}



		}    

	}


