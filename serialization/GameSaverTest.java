import java.io.*;

// saving and restoring game characters. Ch. 14 headfirst java, Serialization and File I/O

public class GameSaverTest {
	public static void main(String[] args) {
		// creating three game character and populate them with data
		GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
		GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});

		// put our character data in an output file (serialize)
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
			System.out.println("Character data saved...");
		} catch (IOException ex) {ex.printStackTrace();}
		// set the values to null after serializing to prevent access on the heap
		one = null;
		two = null;
		three = null;

		// reput the data back into the objects (deserialize)
		try{
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
			GameCharacter oneRestore = (GameCharacter) is.readObject();
			GameCharacter twoRestore = (GameCharacter) is.readObject();
			GameCharacter threeRestore = (GameCharacter) is.readObject();
			// check to see if it worked
			System.out.println("One's type is " + oneRestore.getType());
			System.out.println("Two's type is " + twoRestore.getType());
			System.out.println("Three's type is " + threeRestore.getType());
		} catch(IOException ex) {
			ex.printStackTrace();
		} catch(ClassNotFoundException e) { /* not included in the textbook but required to run in Java 8 */
			e.printStackTrace();
		}

	}
}