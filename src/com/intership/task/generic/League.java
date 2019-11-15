package com.intership.task.generic;

import java.util.ArrayList;

public class League <TypeSport extends Sport> {
    private String name;
    private ArrayList<TypeSport> team = new ArrayList();

    public League(String name) {
        this.name = name;
    }

    public void addTeamToLeague(TypeSport namecandidate) {
        team.add(namecandidate);
    }

    public void displayLeague() {
        System.out.println("League: " + name);
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i).getName());
        }
    }
}