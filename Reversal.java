import java.io.*;
import java.util.*;

public class Reversal {
	
	public static void main(String[] args){
		
		File inputFile = new File("/Volumes/KAYLER_DOCS/480/Reversal/src/cat.txt");
		File outputFile = new File("/Volumes/KAYLER_DOCS/480/Reversal/src/catOut.txt");
		reverseFile(inputFile, outputFile);
		
	}
	
	public static void reverseFile(File input, File output){
		try {
			FileReader read = new FileReader(input);
			BufferedReader  bread = new BufferedReader(read);
			PrintWriter writeOut = new PrintWriter(output, "UTF-8");
			
			ArrayList<String> words = new ArrayList<String>();
			
			String nextLine;
			while((nextLine = bread.readLine()) != null) {
				words.add(nextLine);
				System.out.println(bread.readLine());
			}
			
			for(int i=words.size()-1;i>=0;i--) {
				String[] sentence = words.get(i).split(" ");
				
				for(int j=sentence.length-1;j>=0;j--) {
					writeOut.print(sentence[j]);
					writeOut.println();
				}
			}

			read.close();
			bread.close();
			writeOut.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println(input + " does not exist");
		}
		catch(IOException e){
			System.out.println(input + " is empty");
		}
	}

}