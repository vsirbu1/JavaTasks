package com.intership.task.generic;

public class Main {
    public static void main(String[] args) {
//        Create a generic class to implement a league table for any type of sport.
//        The class should allow teams to be added to the list, and store a list of teams that belong to this particular league.
//
//        Your class should have a method to print out the teams by name alphabetical.
//        Only teams of the same type should be added to any particular instance of the league class - the program should fail to compile if an attempt is made to add an incompatible team.
        Sport Football = new Sport("Football"); //Creating instance of Sport class (Creating football sport)
        Football RM = new Football("RealMadrid"); //Creating instance of Football class (Creating football team)
        Football Monaco = new Football("Monaco");//Creating instance of Football class (Creating football team)
        Football Barca = new Football("Barca");//Creating instance of Football class (Creating football team)
        Football Liverpool = new Football("Liverpool");//Creating instance of Football class (Creating football team)

        League<Football> footballLeague = new League<>("Football"); //Creating arraylist with objects from Football class (Creating league)
        footballLeague.addTeamToLeague(RM); //adding team to league
        footballLeague.addTeamToLeague(Monaco);
        footballLeague.addTeamToLeague(Barca);
        footballLeague.addTeamToLeague(Liverpool);
        footballLeague.displayLeague(); //display all teams from football league

        System.out.println();

        Sport Hockey = new Sport("Hockey"); //The same for hockey
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
