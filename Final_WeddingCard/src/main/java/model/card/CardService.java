package model.card;

import java.sql.SQLException;
import java.util.List;

public interface CardService {

	public void create(CardVO cvo) throws SQLException;
	
}
