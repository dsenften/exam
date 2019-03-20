package network;

import org.jetbrains.annotations.NotNull;

/**
 * Diese Klasse speichert Informationen über eine Meldung für den Newsfeed eines sozialen
 * Netzwerks. Der Hauptteil der Meldung besteht aus einer (möglicherweise mehrzeiligen)
 * Textnachricht. Weitere Daten, wie Autor und Datum, werden ebenfalls gespeichert.
 */
@SuppressWarnings("ALL")
public class MessagePost extends Post {

    private String message;   // Eine beliebig lange, mehrzeilige Nachricht.

    /**
     * Konstruktor für Objekte der Klasse MessagePost.
     *
     * @param autor   Benutzername des Einsenders
     * @param message Text dieser Meldung
     */
    public MessagePost(String autor, String message) {
        super(autor);
        message = message;
    }

    /**
     * Liefere den Text der Meldung.
     *
     * @return Nachrichtentext der Meldung
     */
    @NotNull
    public String getMessage() {
        return message;
    }
}
