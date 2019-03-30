package address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Testklasse für {@link AddressBook}.
 */
@SuppressWarnings("ALL")
class AddressBookTest {

    private AddressBook book;

    // Wenn Du hier ein 'ContactDetails' Objekt meinst, dann muss dies auch
    // so implementiert werden und nicht in Form eines Strings.
    private final ContactDetails contactDetails =
            new ContactDetails("Daniel", "+41 79 300 47 24", "Hofstattweg 6, 3422 Kirchberg");

    @BeforeEach
    void setUp() {
        ContactDetails[] sampleDetails = {
                new ContactDetails("Daniel", "+41 79 300 47 24", "Hofstattweg 6, 3422 Kirchberg"),
                new ContactDetails("Peter", "+41 79 123 67 98", "Bernstrasse 19, 3011 Bern"),
        };
        book = new AddressBook();
        for (ContactDetails details : sampleDetails) {
            book.addDetails(details);
        }
    }

    /**
     * Testen der Methode {@link AddressBook#getDetails(String)}.
     */
    @Test
    void getDetails() {
        // Bei der Suche mittels 'getDetails' darf nur der Schlüssel und nicht
        // die komplette Information gesucht werden.
        // Da der Ansatz gut ist habe ich diese Aufgabe als richtig bewertet.
        assertEquals(contactDetails, book.getDetails("Daniel"));

    }

    /**
     * Testen der Methode {@link AddressBook#keyInUse(String)} )}.
     */
    @Test
    void keyInUse() {
        // Richtig
        assertTrue(book.keyInUse("Daniel"));

    }

    /**
     * Testen der Methode {@link AddressBook#addDetails(ContactDetails)}.
     */
    @Test
    void addDetails() {
        ContactDetails contact;

        contact = new ContactDetails("Daniel", "1234", "Adresse 1");
        book.addDetails(contact);

        contact = new ContactDetails("Daniel", "1234", "Adresse 1");
        book.addDetails(contact);

        // TODO Was passiert, wenn sich nur die Telefonnummer ändert?
        //àndert sich nur den Nummer von den Contact

        // TODO Was passiert, wenn der Datensatz identisch ist?
        //Datensatz wird added gespeichert, aber nur einmal
    }

    /**
     * Testen der Methode {@link AddressBook#changeDetails(String, ContactDetails)}.
     */
    @Test
    void changeDetails() {
        // Wir sollten an dieser Stelle schon eine neue Adresse eingeben, damit
        // getestet werden kann.
        ContactDetails contact = new ContactDetails("Peter", "+41 79 123 67 98", "Neue Adresse");
        book.changeDetails("Peter", contact);

        // Warum fehlt hier der Test?
        // Da der Ansatz vorhanden ist habe ich den Punkt gegeben.
        assertEquals(contact, book.getDetails("Peter"));
    }

    /**
     * Testen der Methode {@link AddressBook#changeDetails(String, ContactDetails)}.
     */
    @Test
    void changeNullDetails() {

        // Die folgenden Zeilen bitte nicht verändern. Diese sind korrekt.
        ContactDetails contact = new ContactDetails(null, null, null);
        book.changeDetails("Daniel", contact);

        // TODO Wie muss obiges Verhalten getestet werden

    }

    /**
     * Testen der Methode {@link AddressBook#search(String)}.
     */
    @Test
    void search() {
        // TODO Wie muss dieser Test implementiert werden?

        // Compilerfehler
        // assertTrue(book, search());
        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#numberOfEntries}.
     */
    @Test
    void getNumberOfEntries() {
        // Der Test wurde prinzipiell richtig erstellt. Nur sollte allerdings
        // der erwartete Wert gemäss der Initialisierung ('setUp') auch noch
        // korrekt angewendet werden 😀
       int numberOfEntries = book.getNumberOfEntries();
        assertEquals(2, numberOfEntries);
    }

    /**
     * Testen der Methode {@link AddressBook#removeDetails(String)}.
     */
    @Test
    void removeDetails() {
        // TODO Wie muss dieser Test implementiert werden?
        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#listDetails()}.
     */
    @Test
    void listDetails() {
        // TODO Wie muss dieser Test implementiert werden?
        fail();
    }
}
