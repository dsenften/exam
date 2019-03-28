package network;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implementation aller Testmethoden zu {@link FotoPost}.
 */
class FotoPostTest {

    private final String author = "Daniel";
    private final String fileName = "FileName.png";
    private final String title = "Title of image";
    private FotoPost post;

    @BeforeEach
    void setUp() {
        pos t = new FotoPost(author, fileName, title);
    }

    @Test
    void getFileName() {
        assertEquals(fileName, post.getFileName());
    }

    @Test
    void getTitle() {
        assertEquals(title, post.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals(author, post.getAuthor());
    }

}
