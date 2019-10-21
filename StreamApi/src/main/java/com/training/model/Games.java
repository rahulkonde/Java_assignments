package com.training.model;

public class Games {

	private String games;

	public Games() {
		super();
	}

	public Games(String games) {
		super();
		this.games = games;
	}

	public String getGames() {
		return games;
	}

	public void setGames(String games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Games [games=" + games + "]";
	}

}
