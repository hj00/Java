package com.watson.pilot.nlu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NLUServiceImpl implements NLUService {
	
	@Autowired
	private NLUDAO nluDAO;

	@Override
	public void insertEmotion(EmotionVO vo) throws Exception {
		nluDAO.insertEmotion(vo);
		
	}

}
