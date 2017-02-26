package bean;

import javax.faces.event.ActionEvent;

import game.Match;

public class GameBean {
	private Match match;

	public GameBean() {

		this.match = new Match();
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public void play(ActionEvent actionEvent) {

		this.match.Play();

	}
}
