package practice.votingApp;

public class VotingServer {
    User userObj = null;
    boolean voteCasted = false;
    public boolean voteAlreadyCasted() {
        return voteCasted;
    }
    public void setUser(User userObj) {
        this.userObj = userObj;
    }
    public User getUser() {
        return userObj;
    }
    public void castVote() {
        if (voteAlreadyCasted()) {
            System.out.println("You have already voted. You cannot vote again!");
            return;
        }
        if (userObj == null) {
            System.out.println("You need to set a user first!");
            return;
        }
        if (userObj.getAge() < 18) {
            System.out.printf("You need to wait %d years before you can vote!\n", 18 - userObj.getAge());
            return;
        }
        if (! userObj.getCountry().equalsIgnoreCase("India") && ! userObj.getCountry().equalsIgnoreCase("IN")) {
            System.out.println("You need to be an Indian citizen to be able to vote.");
            return;
        }
        System.out.println("Vote successfully casted!");
        voteCasted = true;
    }
}
