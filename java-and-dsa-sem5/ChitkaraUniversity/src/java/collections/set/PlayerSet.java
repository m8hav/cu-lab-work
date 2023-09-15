package java.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlayerSet {
    public static void main(String[] args) {

        Set <String> players1 = new HashSet<>();

        players1.add("Player_01");
        players1.add("Player_02");
        players1.add("Player_03");
        players1.add("Player_04");
        players1.add("Player_05");

        for (String name : players1) {
            System.out.println(name);
        }
        System.out.println("------------------------------");


        HashSet <String> players2 = new HashSet<>();

        players2.add("Player_01");
        players2.add("Player_02");
        players2.add("Player_03");
        players2.add("Player_02");
        players2.add("Player_01");
        players2.add("Player_04");

        for (String name : players2) {
            System.out.println(name);
        }
        System.out.println("------------------------------");


//        ACCESSING THROUGH ITERATOR
        Iterator <String> it = players2.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }


        HashSet <String> players3 = new HashSet<>();

        players3.add("Player_02");
        players3.add("Player_02");
        players3.add("Player_01");
        players3.add("Player_04");
        players3.add("Player_01");
        players3.add("Player_03");

        ArrayList<String> oldTeam = new ArrayList<>(players3);

        for (String name : oldTeam) {
            System.out.println(name);
        }
        System.out.println("------------------------------");


        HashSet <String> newTeamHashSet = new HashSet<>(oldTeam);

        for (String name : newTeamHashSet) {
            System.out.println(name);
        }
        System.out.println("------------------------------");

    }
}
