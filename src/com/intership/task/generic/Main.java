package com.intership.task.generic;

public class Main {
    public static void main(String[] args) {
        Sport Football = new Sport("Football");
        Football RM = new Football("RealMadrid");
        Football Monaco = new Football("Monaco");
        Football Barca = new Football("Barca");
        Football Liverpool = new Football("Liverpool");

        League<Football> footballLeague = new League<>("Football");
        footballLeague.addTeamToLeague(RM);
        footballLeague.addTeamToLeague(Monaco);
        footballLeague.addTeamToLeague(Barca);
        footballLeague.addTeamToLeague(Liverpool);
        footballLeague.displayLeague();
        Sport Hockey = new Sport("Hockey");
        Hockey CB =new Hockey("Chicago Bulls");
        Hockey CSKA =new Hockey("CSKA");
        Hockey Sparta =new Hockey("Sparta");
        Hockey RB =new Hockey("Red Bull");
        Hockey GK =new Hockey("German Knights");
        League<Hockey> hockeyLeague = new League<>("Hockey");
        hockeyLeague.addTeamToLeague(CB);
        hockeyLeague.addTeamToLeague(CSKA);
        hockeyLeague.addTeamToLeague(Sparta);
        hockeyLeague.addTeamToLeague(RB);
        hockeyLeague.addTeamToLeague(GK);
        hockeyLeague.displayLeague();
    }
}
