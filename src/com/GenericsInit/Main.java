package com.GenericsInit;

public class Main {
	public static void main(String[] args) {
		RugbyPlayer sasi = new RugbyPlayer("Sasi");
		BaseballPlayer john = new BaseballPlayer("John");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");

		Team<SoccerPlayer> keralaBlasters = new Team<>("KeralaBlasters");
//		keralaBlasters.addPlayer(sasi);
//		keralaBlasters.addPlayer(john);
		keralaBlasters.addPlayer(beckham);
		System.out.println("Team " + keralaBlasters.getName() + " has " + keralaBlasters.numPlayers() + " players");

		Team<BaseballPlayer> knicks = new Team<>("KochiKnicks");
		knicks.addPlayer(john);

		Team<RugbyPlayer> rugbears = new Team<>("RugBeaars");
		rugbears.addPlayer(sasi);
	}
}
