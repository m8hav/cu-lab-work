package collections.set.players;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Players {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();

//        You need to override equals and hashCode methods of the root Object class
//        so that the HashSet has a criteria to compare values for equivalence

        players.add(new Player(101, "Car1", 25, "Scotland", 5));
        players.add(new Player(104, "John", 34, "Wales", 8));
        players.add(new Player(105, "Steve", 26, "Northern Ireland", 4));
        players.add(new Player(102, "Arthur", 30, "Northern Ireland", 6));
        players.add(new Player(102, "Phillip", 25, "England", 5));

        System.out.println(players);
//        using toString()

        for (Player p : players) {
            System.out.println(p.getName() + " : " + p.getAge());
        }
        
        Iterator<Player> it = players.iterator();

    }
}
