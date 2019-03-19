package network;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Diese Klasse speichert Informationen über eine Meldung für den Newsfeed eines
 * sozialen Netzwerks. Einsendungen können gespeichert und angezeigt werden.
 * Diese Klasse dient als Superklasse für stärker spezialisierte Arten von Meldungen.
 */
@SuppressWarnings("ALL")
public abstract class Post {

    private String author;  // Benutzername des Senders
    private long timestamp;
    private int numberOfLikes;
    private ArrayList<String> comments;

    /**
     * Dieser Konstruktor sollte nie aufgerufen werden. Er wurde lediglich zur
     * Verfügung gestellt, damit der Compiler für unsere Testfälle nichts zu
     * reklamieren hat.
     */
    protected Post() {
        throw new IllegalArgumentException("Do not use this constructor");
    }

    /**
     * Konstruktor für Objekte der Klasse Post.
     *
     * @param author Benutzername des Einsenders
     */
    public Post(String author) {
        this.author = author;
        timestamp = System.currentTimeMillis();
        numberOfLikes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Halte fest, dass die Post von einem Benutzer mit 'gefällt' bewertet wurde.
     */
    public void likeIt() {
        numberOfLikes++;
    }

    /**
     * Halte fest, dass ein Benutzer seine 'gefällt'-Bewertung zurückgezogen hat.
     */
    public void dontLikeIt() {
        if (numberOfLikes > 0) {
            numberOfLikes--;
        }
    }

    /**
     * Füge der Post einen Kommentar hinzu.
     *
     * @param text Neu hinzuzufügende Kommentar
     */
    public void addComment(String text) {
        comments.add(text);
    }

    /**
     * Liefere die Zeit, zu der die Post erstellt wurde.
     *
     * @return Die Zeit, zu der die Meldung erstellt wurde
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Zeige die Details der Meldung an.
     * <p>
     * (Aktuell werden die Daten auf die Konsole ausgegeben, wodurch momentan die
     * Anzeige im Webbrowser simuliert werden soll.)
     */
    public void show() {
        System.out.println(author);
        System.out.print(timeString(timestamp));

        if (numberOfLikes > 0) {
            System.out.println("  -  " + numberOfLikes + " Person(en) gefällt dies.");
        } else {
            System.out.println();
        }

        if (comments.isEmpty()) {
            System.out.println("\tKeine Kommentare.");
        } else {
            System.out.print("\t" + comments.size() + " Kommentar");
            System.out.println((comments.size() > 0) ? "e" : "");
            for (String comment : comments) {
                System.out.println("\t- " + comment);
            }
        }
    }

    /**
     * Erzeuge einen String, der einen in der Vergangenheit liegenden Zeitpunkt im Vergleich
     * zur aktuellen Zeit beschreibt, also beispielsweise "vor 30 Sekunden" oder "vor 7 Minuten".
     * Derzeit werden nur Sekunden und Minuten für den String verwendet.
     *
     * @param time Der umzuwandelnde Zeitwert (in System-Millisekunden)
     * @return Eine relative Zeitbeschreibung für den gegebenen Zeitwert
     */
    @NotNull
    private String timeString(long time) {
        long current = System.currentTimeMillis();
        long passedTime = current - time;
        long seconds = passedTime / 1000;
        long minutes = seconds / 60;
        if (minutes > 0) {
            return "vor " + minutes + " Minuten";
        } else {
            return "vor " + seconds + " Sekunden";
        }
    }
}
