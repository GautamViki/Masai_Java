package com.java111.day11.Question3;

import java.util.Scanner;

public class IPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stadium name  : ");
        String std = sc.next();
        Stadium stadium = Stadium.valueOf(std);
        IPL ipl = new IPL();
        ipl.homeTeamStadium(stadium);
    }

    public void homeTeamStadium(Stadium stadium) {
        switch (stadium) {
            case WANKHEDE_STADIUM -> System.out.println("This is the home ground of Mumbai Indians");
            case EDEN_GARDENS_STADIUM -> System.out.println("This is the home ground of KKR");
            case CHIDAMBARAM_STADIUM -> System.out.println("This is the home ground of CSK");
            case M_CHINNASWAMY_STADIUM -> System.out.println("This is the home ground of RCB");
            default -> System.out.println("Enter valid Stadium");
        }

    }
}
