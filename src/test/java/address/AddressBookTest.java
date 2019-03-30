package address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Testklasse für {@link AddressBook}.
 */
@SuppressWarnings("ALL")
class AddressBookTest {

    private AddressBook book;

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
        // Was ist die Idee eines Testfalles?

        // assertEquals(9, 9);

        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#keyInUse(String)} )}.
     */
    @Test
    void keyInUse() {
        // Was ist die Idee eines Testfalles?

        // assertEquals(1, 1);

        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#addDetails(ContactDetails)}.
     */
    @Test
    void addDetails() {
        ContactDetails contact;

        contact = new ContactDetails("Daniel", "1234", "Adresse 1");
        book.addDetails(contact);

        contact = new ContactDetails("Daniel", "5678", "Adresse 1");
        book.addDetails(contact);

        // Eine Fehlermeldung treteht auf
        fail();

        // TODO Was passiert, wenn der Datensatz identisch ist?
        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#changeDetails(String, ContactDetails)}.
     */
    @Test
    void changeDetails() {
        // Ich bin nicht sicher, ob das Prinzip eines Testfalles verstanden wurde.

        // assertEquals(123,123);

        fail();
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
        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#search(String)}.
     */
    @Test
    void search() {
        // Ich bin nicht sicher, ob das Prinzip eines Testfalles verstanden wurde.

        // assertEquals("name","name");

        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#numberOfEntries}.
     */
    @Test
    void getNumberOfEntries() {
        // Ich bin nicht sicher, ob das Prinzip eines Testfalles verstanden wurde.

        // assertEquals(163,163);

        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#removeDetails(String)}.
     */
    @Test
    void removeDetails() {
        // Ich bin nicht sicher, ob das Prinzip eines Testfalles verstanden wurde.

        // assertEquals(163,163);

        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#listDetails()}.
     */
    @Test
    void listDetails() {
        // Ich bin nicht sicher, ob das Prinzip eines Testfalles verstanden wurde.

        // assertEquals(163,163);

        fail();
    }
}
