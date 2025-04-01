package Solutions.stackoverflow;

public class Vote {

    private final User user;
    private final int value;

    public Vote(User author, int value){
        this.user = author;
        this.value = value;
    }

    // Getters


    public User getUser() {
        return user;
    }

    public int getValue() {
        return value;
    }
}
