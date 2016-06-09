package model.card;

import java.sql.SQLException;

public class CardServiceImpl implements CardService{

	CardDao cardDao;
	
	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

	public void create(CardVO cvo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
