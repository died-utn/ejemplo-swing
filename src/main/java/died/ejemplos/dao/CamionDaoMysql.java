package died.ejemplos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import died.ejemplos.dao.utils.DB;
import died.ejemplos.dominio.Camion;

public class CamionDaoMysql implements CamionDao{

	private static final String TABLA_CREATE = 
	"CREATE TABLE  IF NOT EXISTS `died`.`camion` ( "+
	"		  `ID` INT NOT NULL AUTO_INCREMENT, "+
	"		  `PATENTE` VARCHAR(14) NULL, "+
	"		  `MARCA` VARCHAR(45) NULL, "+
	"		  `MODELO` VARCHAR(45) NULL, "+
	"		  `KM` VARCHAR(45) NULL, "+
	"		  `CAMIONcol` INT NULL, "+
	"		  PRIMARY KEY (`ID`)) ";

	private static final String INSERT_CAMION =
			"INSERT INTO CAMION (PATENTE,MARCA,MODELO,KM) VALUES (?,?,?,?)";
	private static final String UPDATE_CAMION =
			" UPDATE CAMION SET PATENTE = ?, MARCA =? ,MODELO = ? , KM =? "
			+ " WHERE ID = ?";
	
//	private void verificarTablas() {
//		TABLA_CREATE
//	}
	
	@Override
	public Camion saveOrUpdate(Camion c) {
		Connection conn = DB.get();
		PreparedStatement pstmt = null;
		try {
			if(c.getId()!=null && c.getId()>0) {
				pstmt= conn.prepareStatement(UPDATE_CAMION);
				pstmt.setString(1, c.getPatente());
				pstmt.setString(2, c.getMarca());
				pstmt.setString(3, c.getModelo());
				pstmt.setInt(4, c.getKm());
				pstmt.setInt(5, c.getId());
			}else {
				pstmt= conn.prepareStatement(INSERT_CAMION);
				pstmt.setString(1, c.getPatente());
				pstmt.setString(2, c.getMarca());
				pstmt.setString(3, c.getModelo());
				pstmt.setInt(4, c.getKm());
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return c;
	}

}
