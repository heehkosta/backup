package test;

import java.io.IOException;
import java.io.Reader;

import model.member.MemberVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class JUnitTEst {
	
	//mybatis Test
	@Test
	public void jUnitTest() throws IOException{
		
		System.out.println("test~~!");
		
		Reader reader  = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory facotry =
				new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = facotry.openSession();
		
		System.out.println("zzzz");
		System.out.println(session.selectList("memberSql.getAllMembers"));
		
		System.out.println("=========== register member=============");
		MemberVO vo = new MemberVO("pcp8282", "8282", "박찬영", "01082828282");
		/*session.insert("memberSql.registerMember", vo);
		session.commit();*/
		System.out.println("###################################\n");
		
		System.out.println("================== idCheck ====================");
		MemberVO member = session.selectOne("memberSql.idCheck", "8282");
		System.out.println("member = "+ member+ "\n");
		
		System.out.println("================= findId ===================");
		member = session.selectOne("memberSql.findId", vo);
		System.out.println(member+ "\n");
		
		System.out.println("================= findPwd ===================");
		member = session.selectOne("memberSql.findPassword", vo);
		System.out.println(member+ "\n");
	}
}
