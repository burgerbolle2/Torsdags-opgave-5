public class Mainto {
public static void main(String[] args) {
Team team1 = new Team("BigChungus", 1);
team1.addPlayer("Marcus");
team1.addPlayer("Kreiner");
team1.addPlayer("Mads");

Team team2 = new Team("Floppa Warriors", 2);
team2.addPlayer("Floppa");
team2.addPlayer("Scrucky");
team2.addPlayer("Slizzy");

Team team3 = new Team("Gul'dans Getters", 5);
team3.addPlayer("Gul'dan");
team3.addPlayer("Achimonde");
team3.addPlayer("Kil'jaeden");

Team team4 = new Team("Wukong's monkies", 6);
team4.addPlayer("Ching");
team4.addPlayer("Chong");
team4.addPlayer("Wukong");

Team team5 = new Team("Muscle Mommies", 3);
team5.addPlayer("Emma");
team5.addPlayer("Mathilde");
team5.addPlayer("Sofie");

Team team6 = new Team("Sicko Modes", 4);
team6.addPlayer("XXXTentacion");
team6.addPlayer("Drake");
team6.addPlayer("Diddy");

System.out.println(team1);
System.out.println(team2);
System.out.println(team3);
System.out.println(team4);
System.out.println(team5);
System.out.println(team6);
}
}