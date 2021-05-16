import java.io.*;


// Builds the game character. used in the GameSaverTest. This class must implement Serializable to be used in input/output streams


public class GameCharacter implements Serializable {
	// serializable variables used to save characteristics of the character
	int power;
	String type;
	String[] weapons;

	// GameCharacter constructor
	public GameCharacter(int p, String t, String[] w) {
		power = p;
		type = t;
		weapons = w;
	}

	// get for power
	public int getPower() {
		return power;
	}
	// get for Type
	public String getType() {
		return type;
	}
	// get for weapons
	public String getWeapons() {
		String weaponList = "";
		for(int i = 0; i < weapons.length; i++) {
			weaponList += weapons[i] + " ";
		}
		return weaponList;
	}

}