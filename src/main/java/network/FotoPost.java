package network;

/**
 * Diese Klasse speichert Informationen über eine Post für den Newsfeed eines
 * sozialen Netzwerks. Der Hauptteil der Post besteht aus einem Foto und einer
 * Überschrift.
 * <p>
 * Weitere Daten, wie Autor und Datum, werden ebenfalls gespeichert.
 */
@SuppressWarnings("ALL")
public class FotoPost extends Post {

    private String fileName;  // Name der Bilddatei
    private String title;     // Bildüberschrift
    private String author;

    /**
     * Konstruktor für Objekte der Klasse FotoPost.
     *
     * @param author   Benutzername des Einsenders
     * @param fileName Dateiname des Bildes
     * @param title    Überschrift für das Bild
     */
    public FotoPost(String author, String fileName, String title) {

        // TODO Richiges Initialisieren dieses Objektes.

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author£) {
        this.author = author;
    }
// TODO Implementieren der fehlenden Methoden.
}
