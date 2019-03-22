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
<<<<<<< HEAD
    private String title;// Bildüberschrift
=======
    private String title;     // Bildüberschrift
>>>>>>> remotes/origin/senften

    /**
     * Konstruktor für Objekte der Klasse FotoPost.
     *
     * @param author   Benutzername des Einsenders
     * @param fileName Dateiname des Bildes
     * @param title    Überschrift für das Bild
     */
    public FotoPost(String author, String fileName, String title) {
<<<<<<< HEAD

        this.fileName = fileName;
        this.title = title;


        // TODO Richiges Initialisieren dieses Objektes.

=======
        super(author);
        this.fileName = fileName;
        this.title = title;
>>>>>>> remotes/origin/senften
    }

    public String getFileName() {
        return fileName;
    }

<<<<<<< HEAD
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

=======
>>>>>>> remotes/origin/senften
    public String getTitle() {
        return title;
    }

<<<<<<< HEAD
    public void setTitle(String title) {
        this.title = title;
    }

// TODO Implementieren der fehlenden Methoden.
=======
    @Override
    public String toString() {
        return "FotoPost{" +
                "fileName='" + fileName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
>>>>>>> remotes/origin/senften
}
