
package serializable.example.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordGame {
    public static void saveTheGame(Card[][] cards){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("record.bin"))){
            System.out.println("Saving the game..");
            out.writeObject(cards);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Card[][] getSavedGame() {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("record.bin"))){
            Card[][] cards = (Card[][]) in.readObject();
            return cards;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecordGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
