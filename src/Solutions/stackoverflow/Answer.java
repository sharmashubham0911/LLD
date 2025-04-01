package Solutions.stackoverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Answer implements Commentable, Votable{

    private final int id;
    private final String content;
    private final User author;
    private boolean isAccepted;
    private final Date creationDate;
    private final List<Comment> comments;
    private final List<Vote> votes;

    public Answer(User author, Question question, String content){

        this.id = generateId();
        this.author = author;
        this.content = content;
        this.creationDate = new Date();
        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
        this.isAccepted = false;
    }


    // Methods For Answer Class

    @Override
    public void addComment(Comment comment) {

        System.out.println("new comment is added");
        comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {

        System.out.println("Returning the comments");
        return new ArrayList<>(comments);
    }

    @Override
    public void vote(User user, int value) {

        if (value != 1 && value != -1){

            throw new IllegalArgumentException("Vote Value must be wither 1 or -1");
        }

        votes.removeIf(v -> v.getUser().equals(user));
        votes.add(new Vote(user, value));
        author.updateReputation(value * 10); // +10 for upvote, -10 for downvote
    }

    @Override
    public int getVoteCount() {

        return votes.stream().mapToInt(Vote::getValue).sum();
    }

    public void markAsAccepted(){
        isAccepted = true;
    }

    private int generateId(){

        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<Vote> getVotes() {
        return votes;
    }
}
