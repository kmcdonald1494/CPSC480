import java.io.*;

public class Reversal {
	
	public static void reverseFile(File input, File output){
		try{
			FileReader read = new FileReader(input);
			BufferedReader  bread = new BufferedReader(read);
			
		}
		catch(FileNotFoundException e){
			System.out.println(input + "does not exist");
		}
	}

}
