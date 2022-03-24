package com.AdminInfo;

import java.sql.SQLException;

public interface AdminFunctions {

	public void userDetails() throws SQLException;
	public void userDelete(int num) throws SQLException;
	public void assignBill(int num,float bill) throws SQLException;
}
