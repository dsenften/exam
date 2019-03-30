package address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        book = new AddressBook("1", "2", "3");
        for (ContactDetails details : sampleDetails) {
            book.addDetails(details);
        }
    }

    /**
     * Testen der Methode {@link AddressBook#getDetails(String)}.
     */
    @Test
    void getDetails() {
        ContactDetails contact;
        contact = new ContactDetails("Daniel", "1234", "Adresse 1");
        book.addDetails(contact);

        // Bei der Funktio 'getDetail' ist ein Schlüssel gefragt, welcher entweder
        // der Name oder das Telefon eines Kontaktes beinhaltet.
        // Der Ansatz ist vorhanden. Aus diesem Grund habe ich diese Aufgabe als richtig bewertet.
        assertEquals(contact, book.getDetails("Daniel"));
    }

    /**
     * Testen der Methode {@link AddressBook#keyInUse(String)} )}.
     */
    @Test
    void keyInUse() {
        // Auch hier muss ein Schlüssel zur Überprüfung verwendet werden.
        // Der Ansatz ist vorhanden. Aus diesem Grund habe ich diese Aufgabe als richtig bewertet.
        assertEquals(true, book.keyInUse("Daniel"));

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

        // TODO Was passiert, wenn sich nur die Telefonnummer ändert?
        //Dann ändert sich nur die Telefonnummer
        fail();

        // TODO Was passiert, wenn der Datensatz identisch ist?
        //Wird er nicht verändert
        //
        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#changeDetails(String, ContactDetails)}.
     */
    @Test
    void changeDetails() {
        // Hier sollte nicht ein neuer Datensatz hinzugefügt werden, sondern
        // ein bestehender ('changeDetails') verändert werden.

        ContactDetails contact;
        contact = new ContactDetails("Daniel", "1234", "Adresse 1");
        book.addDetails(contact);

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

        assertNotNull("not null", book.getDetails("Hello"));

        // TODO Wie muss obiges Verhalten getestet werden
        fail();
    }

    private void assertNotNull(String not_null, ContactDetails hello) {
    }

    /**
     * Testen der Methode {@link AddressBook#search(String)}.
     */
    @Test
    void search() {
        // TODO Wie muss dieser Test implementiert werden?
        fail();
    }

    /**
     * Testen der Methode {@link AddressBook#numberOfEntries}.
     */
    @Test
    void getNumberOfEntries() {
        // TODO Wie muss dieser Test implementiert werden?
        int length = 2;
        assertEquals(length, book.getNumberOfEntries());
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
