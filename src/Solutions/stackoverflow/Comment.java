package Solutions.stackoverflow;

import java.util.Date;

public class Comment {

    private final int id;
    private final String content;
    private final User author;
    private final Date creationDate;

    public Comment(User author, String content){

        this.id = generateId();
        this.content = content;
        this.author = author;
        this.creationDate = new Date();
    }

    int generateId(){

        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }
}
