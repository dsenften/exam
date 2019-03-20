package network;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Implementation aller Testmethoden zu {@link MessagePost}.
 */
@SuppressWarnings("FieldCanBeLocal")
class MessagePostTest {

    private final String author = "Daniel";
    private final String message = "My first message";
    private final ByteArrayOutputStream outContent;
    private MessagePost post;

    {
        /*
         * Redefinieren von 'System.out', damit wir auch diesen Inhalt in einem
         * Testfall überprüfen können. Weitere Informationen findest Du
         * hier: {@link System#setOut(PrintStream)}.
         */
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent, true));
    }

    @BeforeEach
    void setUp() {
        post = new MessagePost(author, message);


        // TODO Braucht es an dieser Stelle noch weitere Initilisierungen?
    }

    /**
     * Überprüfen der der Methode {@link MessagePost#likeIt()}.
     */
    @Test
    void likeIt() {

        assertEquals();

        // Zur Überprüfung der Anzahl 'gefällt mir' muss die
        // zu testende Klasse 'MessagePost' um eine Funktion
        // erweitert werden.

        // TODO Testfall ergänzen.

        fail();
    }

    /**
     * Überprüfen der der Methode {@link MessagePost#dontLikeIt()}.* <p>
     */
    @Test
    void dontLikeIt() {

        // Zur Überprüfung der Anzahl 'gefällt mir' muss die
        // zu testende Klasse 'MessagePost' erweitert werden.

        // TODO Testfall ergänzen.

        fail();
    }

    /**
     * Überprüfen der der Methode {@link MessagePost#addComment(String)}.
     * <p>
     * Hierzu müssen wir das Objekt {@link MessagePostTest#outContent} zu
     * Rate ziehen, resp. verwenden.
     */
    @Test
    void addComment() {

        // Die folgenden Anweisungen sind Teil des Test. Diese dürfen nicht
        // verändert werden. Es darf auch keine weitere Methode in der zu
        // testenden Klasse 'MessagePost' ergänzt werden.

        String comment = "My comment";
        post.addComment(comment);
        post.show();

        assertEquals(comment, post.addComment());

        // TODO Testfall ergänzen.

        fail();
    }

    /**
     * Überprüfen der der Methode {@link MessagePost#getTimestamp()}.
     */
    @Test
    void getTimestamp() {
        long timestamp = System.currentTimeMillis();
        assertEquals(timestamp, post.getTimestamp());

        // TODO Falls dieser Test in Deiner Umgebung nicht funktioniert,
        //      resp. ungleiche Resultate liefert, dann musst Du diesen umschreiben.
    }

    /**
     * Überprüfen der der Methode {@link MessagePost#show()}.
     * <p>
     * Ein Teil dieser Funktion wurde bereits unter {@link #addComment()}
     * getestet. Der Ablauf, resp. die Verwendung von
     * {@link MessagePostTest#outContent} ist somit vergleichbar oder
     * gar identisch.
     */
    @Test
    void show() {

        // Der Aufruf dieser Funktion ist Teil des Test. Diese darf nicht
        // verändert werden. Es darf auch keine weitere Methode in der zu
        // Testenden Klasse 'MessagePost' ergänzt werden.

        post.show();

        // TODO Testfall ergänzen.

        fail();
    }

    @Test
    void getMessage() {
        assertEquals(message, post.getMessage());
    }

    @Test
    void testNullMessage() {
        post = new MessagePost(author, null);
        assertEquals(message, post.getMessage());
    }

    @Test
    void testLongMessage() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Dies ist eine Meldung,\twelche sich\n")
                .append("über mehrere Zeilen\n")
                .append("erstreckt.");

        post = new MessagePost(author, buffer.toString());

        // TODO Wie übeprüfen diese 'lange' Meldung?

        fail();
    }

}
