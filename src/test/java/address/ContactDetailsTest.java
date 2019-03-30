package address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testklasse zur Übwerprüfung von {@link ContactDetails}.
 */
@SuppressWarnings("ALL")
class ContactDetailsTest {

    private final String name = "Daniel";
    private final String phone = "+41 79 300 47 24";
    private final String address = "Hofstattweg 6, 3422 Kirchberg";
    private ContactDetails contact;

    @BeforeEach
    void setUp() {
        contact = new ContactDetails(name, phone, address);
    }

    @Test
    void testNullArgumentDetails() {
        // Die folgende Zeile darf nicht gelöscht werden.
        assertThrows(IllegalStateException.class, () -> {
            contact = new ContactDetails(null, null, address);
        });
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
        assertEquals(address, contact.getAddress());
    }

    /**
     * Testen der Methode {@link ContactDetails#equals(Object)}.
     */
    @Test
    void equals() {
        ContactDetails otherContact = new ContactDetails(name, phone, address);
        assertEquals(contact, otherContact);
    }

    /**
     * Testen der Methode {@link ContactDetails#compareTo(ContactDetails)}.
     */
    @Test
    void compareTo() {
        ContactDetails otherContact =
                new ContactDetails("Peter", "BBB", "CCC");

        assertTrue(contact.compareTo(otherContact) < 0);
    }

    /**
     * Testen der Methode {@link ContactDetails#toString()}.
     */
    @Test
    void testToString() {
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        String nl = System.getProperty("line.separator");
        String expected = "Daniel" + nl +
                "+41 79 300 47 24" + nl +
                "Hofstattweg 6, 3422 Kirchberg";

        assertEquals(expected, contact.toString());
    }
}
