import java.util.ArrayList;

public class Team {
private String name;
private int rank;
private ArrayList<String> players;

public Team(String name, int rank) {
this.name = name;
this.rank = rank;
this.players = new ArrayList<>();
}

public void setName() {
this.name = name;
}
public String getName() {
return name;
}

public int getRank() {
return rank;
}

public void setRank() {
this.rank = rank;
}

public void addPlayer(String playerName) {
	players.add(playerName);
}

public ArrayList<String> getPlayers() {
	return players;
}

public String toString() {
	return "Team "+ name + ", Rank "+ rank + ", Players "+ players;
}
}
