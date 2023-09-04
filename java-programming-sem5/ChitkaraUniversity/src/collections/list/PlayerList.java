package collections.list;

import java.util.*;

public class PlayerList {
    public PlayerList () {
    }

    public static void main(String[] args) {

//        ARRAYLIST WITH COLLECTION REFERENCE
//        Collection<String> player = new ArrayList<String>();
//        ^ either mention the same type as you did on the left
        Collection<String> player = new ArrayList<>();
//        ^ or leave the right side's type empty

        player.add("Player_01");
        player.add("Player_02");
        player.add("Player_03");
        player.add("Player_04");
        player.add("Player_05");

        System.out.println(player);
        for (String name : player) {
            System.out.println(name);
        }
        System.out.println();


//        ARRAYLIST WITH LIST REFERENCE
        List<String> player2 = new ArrayList<>();

        player2.add("Player_01");
        player2.add("Player_02");
        player2.add("Player_03");
        player2.add("Player_04");
        player2.add("Player_05");

        System.out.println(player2);
        for (String name : player2) {
            System.out.println(name);
        }
        System.out.println();


//        ARRAYLIST WITH ARRAYLIST REFERENCE
        ArrayList <String> oldTeam = new ArrayList<>();

        oldTeam.add("Player_01");
        oldTeam.add("Player_02");
        oldTeam.add("Player_03");
        oldTeam.add("Player_04");
        oldTeam.add("Player_05");

        System.out.println(oldTeam);
        for (String name : oldTeam) {
            System.out.println(name);
        }
        System.out.println();


//        Creating new team using old team - creates deep copy
        ArrayList <String> newTeam = new ArrayList<>(oldTeam);

        System.out.println(newTeam);
        for (String name : newTeam) {
            System.out.println(name);
        }
        System.out.println();


//        Creating an Iterator Object to print elements of the container
        Iterator <String> teamIterator = newTeam.iterator();
        while (teamIterator.hasNext()) {
            String newTeamPlayer = teamIterator.next();
            System.out.println(newTeamPlayer);
        }
        System.out.println();


//        Creating an ListIterator Object to print elements of the container
//        ListIterator used to print elements both forward and backward
//            using hasNext() and hasPrevious() for forward and backward
        ListIterator<String> teamListIterator = newTeam.listIterator(newTeam.size());
//        ^ we provide size i.e. last index + 1, so we can start iterating from the last index
        while (teamListIterator.hasPrevious()) {
            String newTeamPlayer = teamListIterator.previous();
            System.out.println(newTeamPlayer);
        }
        System.out.println();

    }
}
