package tugas2;

/**
 *
 * @author Nur Rohman Fajri
 */
public class Tugas2 {

    public static void main(String[] args) {
        Song song = new Song();
        song.title = "Perfect";
        song.artist = "Ed Sheeran";
        song.album = "Divide";
        song.year = 2017;
        song.genre = "Pop";
        
        System.out.println("Data Lagu");
        System.out.println("--------------------------");
        System.out.println("Title: " + song.title);
        System.out.println("Artist: " + song.artist);
        System.out.println("Album: " + song.album);
        System.out.println("Released: " + song.year);
        System.out.println("Genre: " + song.genre);
    }
    
}
