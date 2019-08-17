package sell.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import sell.model.dao.MySellDao;
import sell.model.vo.Product;

public class MySellService {
	
	public int pageCount() {
		
		Connection conn = getConnection();
		
		int result = new MySellDao().pageCount(conn);
		
		return result;
		
		
	}
	

	public ArrayList<Product> selectList(int pNo, String userId) {

		Connection conn = getConnection();
		
		ArrayList<Product> list = new MySellDao().selectList(conn, pNo, userId);
		
		close(conn);
		
		return list;
		
		
	}
	
	public Product detailSelect(int pNo) {
		
		Connection conn = getConnection();
		
		Product p = new MySellDao().detailSelect(conn, pNo);
		
		close(conn);
		
		return p;
		
	}

}
