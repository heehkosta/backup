package model.card;

import java.sql.SQLException;

import model.member.MemberDao;
import model.member.MemberVO;

import org.apache.ibatis.session.SqlSession;

public class CardDaoImpl implements CardDao{
	
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void registerMember(MemberVO mvo) throws SQLException {
		sqlSession.insert("memberSql.registerMember", mvo);
	}

	public Object idCheck(String memberId) throws SQLException {
		return sqlSession.selectOne("memberSql.idCheck", memberId);
	}

	public MemberVO login(MemberVO mvo) throws SQLException {
		return sqlSession.selectOne("memberSql.login", mvo);
	}

	public String findId(MemberVO mvo) throws SQLException {
		return sqlSession.selectOne("memberSql.findId", mvo);
	}

	public String findPassword(MemberVO mvo) throws SQLException {
		return sqlSession.selectOne("memberSql.findPassword", mvo);
	}

}
