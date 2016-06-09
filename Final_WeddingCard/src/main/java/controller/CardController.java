package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.card.CardService;
import model.card.CardVO;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CardController extends MultiActionController{

	private CardService cardService;

	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}
	
	public ModelAndView create(HttpServletRequest request,
			HttpServletResponse response,  HttpSession session, CardVO cvo) throws Exception{

		cardService.create(cvo);
	
		return new ModelAndView("url/" + cvo.getUrl());
	}
	
	
}
