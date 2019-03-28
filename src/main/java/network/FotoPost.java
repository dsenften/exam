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

    /**
     * Konstruktor für Objekte der Klasse FotoPost.
     *
     * @param author   Benutzername des Einsenders
     * @param fileName Dateiname des Bildes
     * @param title    Überschrift für das Bild
     */
    public FotoPost(String author, String fileName, String title) {
        super(author);
        this.fileName = fileName;
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "FotoPost{" +
                "fileName='" + fileName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
