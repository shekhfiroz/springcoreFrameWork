package com.main.cldi.beans;

import java.util.List;
import java.util.Set;
public class Games {
	List<String> players;
	Set<String> rules;
	public Games(List<String> players, Set<String> rules) {
		super();
		this.players = players;
		this.rules = rules;
	}
	@Override
	public String toString() {
		return "Games [players=" + players + ", rules=" + rules + "]";
	}
	
	
}
