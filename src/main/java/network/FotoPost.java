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

    public String getFileName, getTitle() {
        getTitle= title;
        getFileName = fileName;
        return title, fileName;
    }

    /**
     * Konstruktor für Objekte der Klasse FotoPost.
     *

     * @param fileName Dateiname des Bildes
     * @param title    Überschrift für das Bild
     */
    public FotoPost(String author, String fileName, String title) {

       author = author;
       fileName = fileName;
       title = title;


           }

    }
}
