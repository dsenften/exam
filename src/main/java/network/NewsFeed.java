package network;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse NewsFeed speichert neue Einsendungen für den Newsfeed einer
 * Sozialen-Netzwerk-Anwendung (wie Facebook oder Google+).
 * <p>
 * Derzeit wird das Anzeigen der Einsendungen durch die Ausgabe auf die Konsole
 * simuliert. (Später soll die Anzeige in einem Webbrowser erfolgen.)
 * <p>
 * Diese Version speichert keine Daten auf Festplatte. Auch gibt es keine
 * Unterstützung für das Durchsuchen oder Anordnen der Einsendungen.
 */
@SuppressWarnings("ALL")
public class NewsFeed {

    protected List<Post> posts;

    /**
     * Erzeuge einen leeren Newsfeed.
     */
    public NewsFeed() {
        posts = new ArrayList<>();
    }

    /**
     * Füge dem Newsfeed eine Meldung hinzu.
     *
     * @param post Hinzuzufügende Meldung
     */
    public void addPost(Post post) {
        posts.add(post);
    }

    /**
     * Gebe den Newsfeed aus. Derzeit werden die Details des Newsfeed auf die
     * Konsole ausgegeben. (Noch zu tun: ersetze diesen Code durch die Anzeige im
     * Webbrowser.)
     */
    public void show() {
        for (Post post : posts) {
            post.show();
            System.out.println();   // Leere Zeile zwischen den Meldungen
        }
    }
}
