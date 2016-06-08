package test;

import java.io.IOException;
import java.io.Reader;

import model.card.CardVO;
import model.member.MemberVO;
import model.photobook.PhotoBookVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class JUnitCardTest {
	
	//mybatis Test
	@Test
	public void jUnitTest() throws IOException{
		
		System.out.println("card test~~!");
		
		Reader reader  = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory facotry =
				new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = facotry.openSession();
		
		MemberVO mvo = new MemberVO("pcp8282", "8282", "박찬영", "113123123");
		PhotoBookVO pvo = new PhotoBookVO(1, "111", "123123", mvo);
		
		CardVO cvo = new CardVO(1, "무료", "", "예식장", "강남",
				"37-222", "11-222", "444-444",mvo,pvo);
		CardVO cvo2 = new CardVO(0, "무료2", "", "예식장", "강남",
				"37-222", "11-222", "444-444",mvo, pvo);
		CardVO cvo3 = new CardVO(0, "공짜", "", "ㅋㅋㅋ예식장", "강남",
				"37-222", "11-222", "444-444",mvo, pvo);
		
		/// ============== insert ============================
		System.out.println("card 추가");
		
		//System.out.println("insert::"+session.insert("cardSql.createCard", cvo3));
		//session.commit();
		
		System.out.println("card 상세정보");
		System.out.println(session.selectOne("cardSql.getCard", 0));
		
		System.out.println("card update");
		
		System.out.println("update::"+session.update("cardSql.modifyCard", cvo2));
		session.commit();
		
		System.out.println("card 상세정보");
		System.out.println(session.selectOne("cardSql.getCard", 5));
		
		
		
		//System.out.println("card 삭제::"+session.delete("cardSql.deleteCard", 4));
		//session.commit();
		
		System.out.println("card List\n"+session.selectList("cardSql.getAllCards", "pcp8282"));
		
	}
}
