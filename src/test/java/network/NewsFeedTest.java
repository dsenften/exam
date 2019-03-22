package network;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implementation der Testmethoden zu {@link NewsFeed}.
 */
@SuppressWarnings("ALL")
class NewsFeedTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private MyNewsFeed newsFeed;

    @BeforeEach
    void setUp() {
        newsFeed = new MyNewsFeed();
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Testen der Methode {@link NewsFeed#addPost(Post)}.
     */
    @Test
    void addPost() {

        /**
         * In der zu testenden Klasse {@link NewsFeed} darf KEINE neue
         * Methode eingefügt werden!
         */

        Post post = new MyPost("Daniel");
        newsFeed.addPost(new MyPost("Daniel"));

        assertEquals(post, newsFeed.getPosts().get(0));
    }

    /**
     * Testen der Methode {@link NewsFeed#show()}.
     */
    @Test
    void show() {
        newsFeed.addPost(new MyPost("Daniel"));
        newsFeed.show();

        String nl = System.getProperty("line.separator");
        assertEquals("Daniel" + nl +
                "vor 0 Sekunden" + nl +
                "\tKeine Kommentare." + nl + nl, outContent.toString());
    }

    /**
     * Diese Subklassen werden lediglich zu Testzwecken verwendet, da wir die
     * Originalklasse nicht verändern dürfen.
     */
    private class MyNewsFeed extends NewsFeed {
        public List<Post> getPosts() {
            return posts;
        }
    }

    private class MyPost extends Post {
        public MyPost(String author) {
            super(author);
        }
    }
}
