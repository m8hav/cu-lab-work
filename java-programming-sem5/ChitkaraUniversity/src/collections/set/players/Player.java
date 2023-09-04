package collections.set.players;

import java.util.Objects;

public class Player {
    private int id;
    private String name;
    private int age;
    private String location;
    private int goals;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public Player(int id, String name, int age, String location, int goals) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "\nPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", goals=" + goals +
                '}';
    }

//    Two players are equal if their IDs are equal
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return id == ((Player) o).id;
//        Player player = (Player) o;
//        return id == player.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
