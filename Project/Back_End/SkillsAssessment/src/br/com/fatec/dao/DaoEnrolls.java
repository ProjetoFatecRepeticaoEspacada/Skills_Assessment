package br.com.fatec.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import br.com.fatec.connection.ConnectionMySql;
import br.com.fatec.entity.Enrolls;
import br.com.fatec.entity.User;

public class DaoEnrolls {
	
	//ESPERANDO METODO DO MARCELO
	@SuppressWarnings("finally")
	public static boolean insertEnrolls(Enrolls enrolls) throws SQLException{
		ConnectionMySql connection = new ConnectionMySql();
		String sql = "INSERT INTO ENROLLS (ern_year, ern_period, crs_code, usr_code) VALUES (?,?,?,?);";
		boolean insert = false;
		try{
			connection.conect();
			connection.setStatement(connection.getConnection().prepareStatement(sql));
			connection.getStatement().setInt(1,enrolls.getYear());
			connection.getStatement().setInt(2,enrolls.getPeriod());
			connection.getStatement().setLong(3,enrolls.getCodeCourse());
			connection.getStatement().setLong(4,enrolls.getCodeUser());
			if(connection.executeSql()){
				insert = true;
			}
		}catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}finally{
			connection.close();
			return insert;
		}
	}
	
	@SuppressWarnings("finally")
	public static boolean deleteEnrolls(Long codeEnrolls) throws SQLException {
		ConnectionMySql connection = new ConnectionMySql();
		String sql = "DELETE FROM ENROLLS WHERE ERN_CODE = ?;";
		boolean delete = false;
		try {
			connection.conect();
			connection.setStatement(connection.getConnection().prepareStatement(sql));
			connection.getStatement().setLong(1,codeEnrolls);
			if (connection.executeSql()) {
				delete = true;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
			return delete;
		}
	}
	
	@SuppressWarnings("finally")
	public static boolean updateEnrolls(Enrolls enrolls) throws SQLException{
		ConnectionMySql connection =  new ConnectionMySql();
		String sql = "UPDATE ENROLLS SET ERN_YEAR = ?, ERN_PERIOD = ?, CRS_CODE = ?, USR_CODE = ? where ERN_CODE = ?;";
		boolean update = false;
		try {
			connection.conect();
			connection.setStatement(connection.getConnection().prepareStatement(sql));
			connection.getStatement().setInt(1, enrolls.getYear());
			connection.getStatement().setInt(2, enrolls.getPeriod());
			connection.getStatement().setLong(3, enrolls.getCodeCourse());
			connection.getStatement().setLong(4, enrolls.getCodeUser());
			connection.getStatement().setLong(5, enrolls.getCodeEnrolls());
			if(connection.executeSql()){
				update = true;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
			return update;
		}
	}	

	@SuppressWarnings("finally")
	public static List<Enrolls> searchAllEnrolls() {
		List<Enrolls> listEnrolls = new ArrayList<>();
		ConnectionMySql connection = new ConnectionMySql();
		String query = "SELECT * FROM ENROLLS;";
		try {
			connection.conect();
			connection.setStatement(connection.getConnection().prepareStatement(query));
			if (connection.executeQuery()) {
				do {
					Enrolls enrolls = new Enrolls();
					enrolls.setCodeEnrolls(Long.parseLong(connection.returnField("ERN_CODE")));
					enrolls.setYear(Integer.parseInt(connection.returnField("ERN_YEAR")));
					enrolls.setPeriod(Integer.parseInt(connection.returnField("ERN_PERIOD")));
					enrolls.setCodeCourse(Long.parseLong(connection.returnField("CRS_CODE")));
					enrolls.setCodeUser(Long.parseLong(connection.returnField("USR_CODE")));
					listEnrolls.add(enrolls);
				} while (connection.nextRegister());
			} else {
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
			return listEnrolls;
		}
	}
	
	@SuppressWarnings("finally")
	public static Enrolls searchEnrollsById(Long codeEnrolls){
		ConnectionMySql connection = new ConnectionMySql();
		String query = "SELECT * FROM ENROLLS WHERE ERN_CODE = ?;";
		Enrolls enrolls = new Enrolls();
		try {
			connection.conect();
			connection.setStatement(connection.getConnection().prepareStatement(query));
			connection.getStatement().setLong(1, codeEnrolls);
			if(connection.executeQuery()){
				do{					
					enrolls.setCodeEnrolls(Long.parseLong(connection.returnField("ERN_CODE")));
					enrolls.setYear(Integer.parseInt(connection.returnField("ERN_YEAR")));
					enrolls.setPeriod(Integer.parseInt(connection.returnField("ERN_PERIOD")));
					enrolls.setCodeCourse(Long.parseLong(connection.returnField("CRS_CODE")));
					enrolls.setCodeUser(Long.parseLong(connection.returnField("USR_CODE")));
				}while(connection.nextRegister());
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
			return enrolls;
		}
	}
	
	@SuppressWarnings("finally")
	public static Long searchEnrollsByUserId(Long idUser){
		ConnectionMySql connection = new ConnectionMySql();
		String query = "SELECT ERN_CODE FROM ENROLLS WHERE USR_CODE = ?";
		Long idEnrolls = null;
		try{
			connection.conect();
			connection.setStatement(connection.getConnection().prepareStatement(query));
			connection.getStatement().setLong(1, idUser);
			if(connection.executeQuery()){
				do{
					idEnrolls = Long.parseLong(connection.returnField("ERN_CODE"));
				}while(connection.nextRegister());
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
			return idEnrolls;
		}
		
	}
	
}

