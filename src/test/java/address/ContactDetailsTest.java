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

        // TODO Wie kann dieser erwartetet Fehler getestet werden? ich habe keinen fehler gesehen
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
        // TODO Wie muss dieser Test implementiert werden? nur daniel weiss wie. soll das ein witz sein ? wer hat schuld denken sie mal nach
        fail();
    }

    /**
     * Testen der Methode {@link ContactDetails#getAddress()} )}.
     */
    @Test
    void getAddress() {

        // TODO Wie muss dieser Test implementiert werden? es gibt 1900 verschiedene möglichkeiten doch nein nur die geht die daniel will
        fail();
    }

    /**
     * Testen der Methode {@link ContactDetails#equals(Object)}.
     */
    @Test
    void equals() {
        // TODO Wie muss dieser Test implementiert werden? daniel irgendjemand ist schuld an der ganzen sache
        fail();
    }

    /**
     * Testen der Methode {@link ContactDetails#compareTo(ContactDetails)}.
     */
    @Test
    void compareTo() {
        // TODO Wie muss dieser Test implementiert werden? irgendwie anders. alle schüler haben was falsch gemacht
        fail();
    }

    /**
     * Testen der Methode {@link ContactDetails#toString()}.
     */
    @Test
    void testToString() {
        // TODO Wie muss dieser Test implementiert werden? so wie ich weiss wie ich weiss nicht wie es geht. können denn wir alle schuld sein und die andere klasse auch. die Schüler haben schuld an dem unwissen von java ? ist das so ?
        fail();
    }
}
