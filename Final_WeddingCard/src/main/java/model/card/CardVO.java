package model.card;

import model.member.MemberVO;
import model.photobook.PhotoBookVO;

/*
  card_no number(10) primary key, 
  template varchar2(50), 
  card_date date not null, 
  hall_name varchar2(50), 
  hall_location varchar2(100), 
  hall_tel varchar2(20), 
  groom_tel varchar2(30), 
  bride_tel varchar2(30),  
  member_id varchar2(50), 
  book_no number(10), 
  foreign key (member_id) references member(member_id) on delete cascade
  
  // foreign key (book_no) references photobook(book_no) on delete no action >> NOT WORKING!!
 */
public class CardVO {
	private int cardNo;		// card_no
	private String template;
	private String cardDate;	// card_date
	private String hallName;	// hall_name
	private String hallLocation;	// hall_location
	private String hallTel;		// hall_tel
	private String groomTel;	// groom_tel
	private String brideTel;	// bride_tel
	// reference
	private MemberVO memberVO;
	private PhotoBookVO photobookVO;

}
