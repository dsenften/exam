package address;

/**
 * Provide a simple demonstration of the AddressBook class.
 * Sample data is added to the address book,
 * and a text interface is provided.
 */
@SuppressWarnings("ALL")
public class AddressBookDemo {
    private AddressBook book;
    private AddressBookTextInterface interaction;

    /**
     * Setup an AddressBook with sample data.
     * The address book is passed to a GUI to provide
     * a view of the data.
     */
    public AddressBookDemo() {
        ContactDetails[] sampleDetails = {
                new ContactDetails("Daniel", "+41 79 300 47 24", "Hofstattweg 6, 3422 Kirchberg"),
                new ContactDetails("Peter", "+41 79 123 67 98", "Bernstrasse 19, 3011 Bern"),
        };
        book = new AddressBook();
        for (ContactDetails details : sampleDetails) {
            book.addDetails(details);
        }
        interaction = new AddressBookTextInterface(book);
    }

    /**
     * Allow the user to interact with the address book.
     */
    public void showInterface() {
        interaction.run();
    }

    /**
     * @return The sample address book.
     */
    public AddressBook getBook() {
        return book;
    }
}
