package Solutions.stackoverflow;

import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StackOverFlow {

    private final Map<Integer, User> users;
    private final Map<Integer, Question> questions;
    private final Map<Integer, Answer> answers;
    private final Map<String, Tag> tags;

    public StackOverFlow() {

        users = new ConcurrentHashMap<>();
        questions = new ConcurrentHashMap<>();
        answers = new ConcurrentHashMap<>();
        tags = new ConcurrentHashMap<>();
    }

    public User createUser(String userName, String email) {

        int id = users.size() + 1;
        User user = new User(id, userName, email);
        users.put(id, user);
        return user;
    }

    public Question askQuestion(User user, String title, String content, List<String> tagNames) {
        Question question = new Question(user, title, content, tagNames);
        user.askQuestion(title, content, tagNames);
        questions.put(question.getId(), question);
        for (Tag tag : question.getTags()) {
            this.tags.putIfAbsent(tag.getName(), tag);
        }

        return question;
    }

    public Answer answerQuestion(User author, Question question, String content) {

        Answer answer = new Answer(author, question, content);
        author.answerQuestion(question, content);
        answers.put(answer.getId(), answer);
        return answer;
    }

    public Comment addComment(User author, Commentable commentable, String content) {

        return author.addComment(commentable, content);
    }

    public String voteQuestion(User user, Question question, int value) {

        question.vote(user, value);
        return "voted";
    }

    public String voteAnswer(User user, Answer answer, int value) {
        answer.vote(user, value);
        return "voted";
    }

    public String acceptAnswer(Answer answer) {

        answer.markAsAccepted();
        return "Accepted";
    }

    public List<Question> getQuestionsByUser(User user) {

        return user.getQuestions();
    }

    public List<Question> searchQuestions(String query){

        return questions.values().stream().filter(question -> question.getTitle().toLowerCase().contains(query.toLowerCase()) || question.getContent().toLowerCase().contains(query.toLowerCase()) || question.getTags().stream().anyMatch(t -> t.getName().equalsIgnoreCase(query))).collect(Collectors.toList());
    }

    // Getters


    public User getUsers(int id) {
        return users.get(id);
    }

    public Question getQuestions(int id) {
        return questions.get(id);
    }

    public Answer getAnswers(int id) {
        return answers.get(id);
    }

    public Tag getTags(String name) {
        return tags.get(name);
    }
}
