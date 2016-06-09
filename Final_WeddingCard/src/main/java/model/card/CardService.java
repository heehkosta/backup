package model.card;

import java.sql.SQLException;
import java.util.List;

public interface CardService {

	CardDao cardDao;
	
	
	
	public void create(CardVO cvo) throws SQLException;
	
}
