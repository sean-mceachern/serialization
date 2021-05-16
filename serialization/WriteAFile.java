import java.io.*;

// how to write to a file in text format

public class WriteAFile {
	public static void main(String[] args) {
		try{
			FileWriter writer = new FileWriter("Foo.txt"); /* if the file Foo.txt doesn't exist this will create a new file */
			writer.write("Hello Foo"); /* add this string to the text body */
			writer.write("What happens when i add a second entry?");
			writer.write("So turns out you want to add a \n")
			writer.write("that way the next entry starts on the next line. \n");
			writer.close();
		} catch (IOException ex) {ex.printStackTrace();}
 	}
}