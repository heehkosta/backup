package model.card;

import java.sql.SQLException;
import java.util.List;

public interface CardService {
	void createCard(CardVO cvo) throws SQLException;
	void modifyCard(CardVO cvo) throws SQLException;
	void deleteCard(int cardNO) throws SQLException;
	CardVO getCard(int cardNO) throws SQLException;
	List<CardVO>  getAllCards(String memberId) throws SQLException;
	
}
