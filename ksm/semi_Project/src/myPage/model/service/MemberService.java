package myPage.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import myPage.model.dao.MemberDao;
import myPage.model.vo.Member;


public class MemberService {
	
	public int updateMember(Member mem) {
		
		Connection conn = getConnection();
		
		int result = new MemberDao().updateMember(conn, mem);
		
		if(result > 0 ) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	public int deleteMember(String userId) {
		
		Connection conn = getConnection();
		
		int result = new MemberDao().deleteMember(conn, userId);
		
		if(result > 0 ) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

}
