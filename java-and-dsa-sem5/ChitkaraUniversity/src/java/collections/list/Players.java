package java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Players {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player("Car1", 25));
        players.add(new Player("John", 34));
        players.add(new Player("Steve", 29));

        System.out.println(players);
        for (Player p : players) {
            System.out.println(p);
            System.out.println(p.getName() + " - " + p.getAge());
        }
        System.out.println();

//        printing using iterator
        Iterator <Player> playersIterator = players.iterator();
        while (playersIterator.hasNext()) {
            Player p = playersIterator.next();
            System.out.println(p.getName() + " - " + p.getAge());
        }
        System.out.println();

//        adding element at index 1 - shifts the elements starting from index 1
        players.add(1, new Player("Bart", 17));

//        typecasting to iterator's next() value while not giving type while creating the object
        Iterator playersIterator2 = players.iterator();
        while (playersIterator2.hasNext()) {
            Player p = (Player) playersIterator2.next();
            System.out.println(p.getName() + " - " + p.getAge());
        }
        System.out.println();

//        using ListIterator without type and typecasting later
        ListIterator playersListIterator = players.listIterator();
        while (playersListIterator.hasNext()) {
            Player p = (Player) playersListIterator.next();
            System.out.println(p.getName() + " - " + p.getAge());
        }


    }
}
