package model.dao;

import java.sql.SQLException;

import db.Connect;
import db.DbException;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao(){
		try {
			return new SellerDaoJDBC(Connect.criarConexao());
		} catch (ClassNotFoundException e) {
			throw new DbException(e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static DepartmentDao createDepartmentDao(){
		try {
			return new DepartmentDaoJDBC(Connect.criarConexao());
		} catch (ClassNotFoundException e) {
			throw new DbException(e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
