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
    private ContactDetails[] sampleDetails;

    @BeforeEach
    void setUp() {
        ContactDetails[] sampleDetails = {
                new ContactDetails("Daniel", "+41 79 300 47 24", "Hofstattweg 6, 3422 Kirchberg"),
                new ContactDetails("Peter", "+41 79 123 67 98", "Bernstrasse 19, 3011 Bern"),
        };
        this.sampleDetails = sampleDetails;
        this.book = new AddressBook();
        for (ContactDetails details : sampleDetails) {
            book.addDetails(details);
        }
    }

    /**
     * Testen der Methode {@link AddressBook#getDetails(String)}.
     */
    @Test
    void getDetails() {
        ContactDetails expected =
                new ContactDetails("Daniel", "+41 79 300 47 24", "Hofstattweg 6, 3422 Kirchberg");

        assertEquals(expected, book.getDetails("Daniel"));
    }

    /**
     * Testen der Methode {@link AddressBook#keyInUse(String)} )}.
     */
    @Test
    void keyInUse() {
        String key = "Peter";
        assertTrue(book.keyInUse(key));
    }

    /**
     * Testen der Methode {@link AddressBook#addDetails(ContactDetails)}.
     */
    @Test
    void addDetails() {
        ContactDetails contact;

        contact = new ContactDetails("Daniel", "1234", "Adresse 1");
        book.addDetails(contact);

        // Es wurde ein Datensatz hinzugefügt; Der Eintrag 'Daniel' wird überschrieben.
        assertEquals(sampleDetails.length + 1, book.getNumberOfEntries());

        contact = new ContactDetails("Daniel", "5678", "Adresse 1");
        book.addDetails(contact);

        // 'Daniel' wird wieder überschrieben und eine Datensatz für '5678' eingefügt
        assertEquals(sampleDetails.length + 2, book.getNumberOfEntries());
    }

    /**
     * Testen der Methode {@link AddressBook#changeDetails(String, ContactDetails)}.
     */
    @Test
    void changeDetails() {
        ContactDetails newAddress =
                new ContactDetails("Daniel", "+41 79 300 47 24", "Schanzenstrasse 5, 3001 Bern");

        String key = "Daniel";
        book.changeDetails(key, newAddress);
        assertEquals(newAddress, book.getDetails(key));
    }

    /**
     * Testen der Methode {@link AddressBook#changeDetails(String, ContactDetails)}.
     */
    @Test
    void changeNullDetails() {
        assertThrows(IllegalStateException.class, () -> {
            // Die folgenden Zeilen bitte nicht verändern. Diese sind korrekt.
            ContactDetails contact = new ContactDetails(null, null, null);
            book.changeDetails("Daniel", contact);
        });
    }

    /**
     * Testen der Methode {@link AddressBook#search(String)}.
     */
    @Test
    void search() {
        ContactDetails[] result = book.search("D");
        assertEquals(1, result.length);
    }

    /**
     * Testen der Methode {@link AddressBook#numberOfEntries}.
     */
    @Test
    void getNumberOfEntries() {
        assertEquals(sampleDetails.length, book.getNumberOfEntries());
    }

    /**
     * Testen der Methode {@link AddressBook#removeDetails(String)}.
     */
    @Test
    void removeDetails() {
        String key = "Daniel";
        book.removeDetails(key);
        assertNull(book.getDetails(key));
    }

    /**
     * Testen der Methode {@link AddressBook#listDetails()}.
     */
    @Test
    void listDetails() {
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        String nl = System.getProperty("line.separator");
        String expected = "Daniel" + nl +
                "+41 79 300 47 24" + nl +
                "Hofstattweg 6, 3422 Kirchberg" + nl +
                nl +
                "Peter" + nl +
                "+41 79 123 67 98" + nl +
                "Bernstrasse 19, 3011 Bern" + nl +
                nl;
        assertEquals(expected, book.listDetails());
    }
}
