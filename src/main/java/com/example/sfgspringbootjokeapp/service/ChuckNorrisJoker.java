package com.example.sfgspringbootjokeapp.service;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJoker implements Joker {
	
	private ChuckNorrisQuotes quoter;
	
	public ChuckNorrisJoker() {
		quoter = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return quoter.getRandomQuote();
	}
	
	

}
