package address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Testklasse zur Übwerprüfung von {@link ContactDetails}.
 */
@SuppressWarnings("ALL")
class ContactDetailsTest {

    private final String name = "Daniel";
    private final String phone = "+41 79 300 47 24";
    private final String addess = "Hofstattweg 6, 3422 Kirchberg";
    private ContactDetails contact;

    @BeforeEach
    void setUp() {
        contact = new ContactDetails(name, phone, addess);
    }

    @Test
    void testNullArgumentDetails() {

        // Die folgende Zeile darf nicht gelöscht werden.
        contact = new ContactDetails(null, null, addess);

        // TODO Wie kann dieser erwartetet Fehler getestet werden?
    }

    /**
     * Testen der Methode {@link ContactDetails#getName()}.
     */
    @Test
    void getName() {
        assertEquals(name, contact.getName());
    }

    /**
     * Testen der Methode {@link ContactDetails#getPhone()}.
     */
    @Test
    void getPhone() {
        assertEquals(phone, contact.getPhone());
    }

    /**
     * Testen der Methode {@link ContactDetails#getAddress()} )}.
     */
    @Test
    void getAddress() {
        assertEquals(addess, contact.getAddress());

    }

    /**
     * Testen der Methode {@link ContactDetails#equals(Object)}.
     */
    @Test
    void equals() {
        assertEquals(ContactDetails, contact.equals());
        // TODO Wie muss dieser Test implementiert werden?
    }

    /**
     * Testen der Methode {@link ContactDetails#compareTo(ContactDetails)}.
     */
    @Test
    void compareTo() {
        assertEquals(ContactDetails, );
        // TODO Wie muss dieser Test implementiert werden?
        fail();
    }

    /**
     * Testen der Methode {@link ContactDetails#toString()}.
     */
    @Test
    void testToString() {
        // TODO Wie muss dieser Test implementiert werden?
        fail();
    }
}
