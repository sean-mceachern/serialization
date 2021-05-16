import java.io.*;

// reading from a file. using File object, FileReader, and BufferedReader

class ReadAFile {
	public static void main(String[] args) {
		
		try {
			File myFile = new File("MyText.txt");
			FileReader fileReader = new FileReader(myFile); /* a connection stream for characters to a text file */

			BufferedReader reader = new BufferedReader(fileReader); /* makes the reading process more efficient */

			String line = null; /* hold each line as it is being read */
			
			while((line = reader.readLine()) != null) {  /* while there is data to be read */
				System.out.println(line);
			}
			reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}