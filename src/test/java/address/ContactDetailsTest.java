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

        // Was sollte hier getestet werden? Verwenden einer Klasse oder einer Methode
        // mit einem 'null' Objekt ist nicht legal (-> Compilerfehler)
//        int numberofLikes = null.ContactDetails();
//        null.testNullArgumentDetails();
//        assertEquals(numberofLikes + 1, null.ContactDetails());
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
        // Schade, die Testmethode 'getName' zeigt doch, wie es geht.

        fail();
//        void getPhone() {
//            assertEquals(name, contact.getName();
//        }
    }

    /**
     * Testen der Methode {@link ContactDetails#getAddress()} )}.
     */
    @Test
    void getAddress() {
        // Schade, die Testmethode 'getName' zeigt doch, wie es geht.

        fail();
//        void getAdress () {
//            assertEquals(addess, contact.getName();
//        }
    }

    /**
     * Testen der Methode {@link ContactDetails#equals(Object)}.
     */
    @Test
    void equals() {
        // Siehe oben...

        fail();
//        void equals () {
//            assertEquals(addess, contact.getName();
//        }
    }

    /**
     * Testen der Methode {@link ContactDetails#compareTo(ContactDetails)}.
     */
    @Test
    void compareTo() {
        // Siehe oben...

        fail();
//        void compareTo () {
//            assertEquals(addess, contact.getName();
//        }
    }

    /**
     * Testen der Methode {@link ContactDetails#toString()}.
     */
    @Test
    void testToString() {
        // Compilerfehler... die Methode 'testToString' existiert nicht in der
        // Klasse 'System'.
//        String timestamp = System.testToString();

        fail();
    }
}
