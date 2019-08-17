package sell.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import sell.model.vo.Product;

public class MySellDao {
	
	private Properties prop = new Properties();
	
	public MySellDao() {
		String fileName = MySellDao.class.getResource("/sql/sell/sell-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int pageCount(Connection conn) {
		
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String sql = prop.getProperty("pageCount");
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		result=(int)(result/10)+1;
		
		return result;
		
	}
	
	public ArrayList<Product> selectList(Connection conn, int pNo, String userId) {
		
		PreparedStatement pstmt = null;
		
		ArrayList<Product> list = new ArrayList<>();
		
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "");
			pstmt.setString(2, "");
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Product(
						
						
						)
					);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
		

	}
	
	public Product detailSelect(Connection conn, int pNo) {
		
		PreparedStatement pstmt = null;
		
		Product p = null;
		
		ResultSet rset = null;
		
		String sql = prop.getProperty("detailSelect");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, pNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				p = new Product();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return p;
		
		
	}
	
	
}
