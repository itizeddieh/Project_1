package com.revature.dao;

public interface RequestsDao {
	
	public abstract void insertRequest(int userID, String name, String location, String date, String description, int type, int gradingScale, String passingGrade, String justification, double cost, double reimbursement, String links); 
	public abstract int getApplicationStatus(int id);
	public abstract String getPendingSuper(int userid);
	public abstract String getPendingDeptHead(int userid);
	public abstract String getPendingBenCo();
	public abstract void updateStatus(int authority, int recid);
	public abstract void updateReimbursement(int id, double bal);
	public abstract double getPendingBalance(int userId);
}
