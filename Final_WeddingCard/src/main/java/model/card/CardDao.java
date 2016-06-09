package model.card;

import java.sql.SQLException;

import model.member.MemberVO;

public interface CardDao {
	void registerMember(MemberVO mvo) throws SQLException;
	Object idCheck(String memberId) throws SQLException;
	MemberVO login(MemberVO mvo) throws SQLException;
	String findId(MemberVO mvo) throws SQLException;
	String findPassword(MemberVO mvo) throws SQLException;
}
