package network;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Implementation aller Testmethoden zu {@link FotoPost}.
 */
class FotoPostTest {
    private String fileName;  // Name der Bilddatei
    private String title;     // Bildüberschrift
    private String author;

    private FotoPost fp;

    // TODO Die folgenden, leeren Tests sind lediglich Platzhalter.
    //      Diese können auch entfernt oder durch eigene, andere Tests
    //      ersetzt werden.

    // TODO Welche Funktionen müssen wir an dieser Stelle einfügen?

    @BeforeEach
    void setUp(){
        fp =new FotoPost(fileName,title,author);


    }

    @Test
    void getFilename() {
        assertEquals(fileName,fp.getFileName());



    }

    @Test
    void getTitle() {




    }
    @Test
    void getAuthor(){

    }

}
