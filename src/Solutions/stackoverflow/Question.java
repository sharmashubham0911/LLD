package Solutions.stackoverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;

public class Question implements Commentable, Votable{

    private final int id;
    private final String title;
    private final String content;
    private final User author;
    private final Date creationDate;
    private final List<Tag> tags;
    private final List<Comment> comments;
    private final List<Answer> answers;
    private final List<Vote> votes;

    public Question(User author, String title, String content, List<String> tagNames){

        this.id = generateId();
        this.title = title;
        this.content = content;
        this.author = author;
        this.creationDate = new Date();
        this.comments = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.votes = new ArrayList<>();
        this.tags = new ArrayList<>();

        // Add tags
        for (String tag: tagNames){
            this.tags.add(new Tag(tag));
        }
    }

    @Override
    public void addComment(Comment comment) {

        comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {

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

    void addAnswer(Answer answer){

        answers.add(answer);
    }

    int generateId(){

        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    // Getters


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<Tag> getTags() {
        return new ArrayList<>(tags);
    }

    public List<Answer> getAnswers() {
        return new ArrayList<>(answers);
    }

    public List<Vote> getVotes() {
        return new ArrayList<>(votes);
    }
}
