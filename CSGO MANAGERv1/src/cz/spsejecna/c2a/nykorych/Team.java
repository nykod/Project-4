package cz.spsejecna.c2a.nykorych;

public class Team {
	public String name;
	public Player player;
	public Player player2;
	public Player player3;
	public Player player4;
	public Player player5;
	public int tier;
	public int rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Team(String name, Player player, Player player2, Player player3, Player player4, Player player5, int tier,
			int rank) {
		super();
		this.name = name;
		this.player = player;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		this.player5 = player5;
		this.tier = tier;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "\r\nName of the team: " + name + "\r\nPlayers: " + player + "\r\n" + player2 + "\r\n" + player3
				+ "\r\n" + player4 + "\r\n" + player5 + "\r\nHLTV Rank: " + rank + "\r\nTier: " + tier+"\r\n";
	}
	
	

}
