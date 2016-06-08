package model.card;

/*
  content varchar2(500) not null, 
  guest varchar2(20), 
  write_date date not null, 
  card_no number(10) not null, 
  foreign key (card_no) references card(card_no) on delete cascade  
 */
public class CardcommentVO {
	private String content;
	private String guest;
	private String writeDate;	// write_date
	// reference
	private CardVO cardVO;

}
