import java.io.*;

import org.junit.*;

public class ReversalTest {

	@Test
	public void test01() throws IOException {
		final File expected = new File("expectedCatOut.txt");
		final File output = new File("actualCatOut.txt");
		final File input = new File("cat.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(input, output);
		Assert.assertTrue("Files are not the same.", same);
	}
	
	@Test
	public void test02() throws IOException {
		final File expected = new File("expectedChaosOut.txt");
		final File output = new File("actualChaosOut.txt");
		final File input = new File("chaos.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(input, output);
		Assert.assertTrue("Files are not the same.", same);
	}
	
	@Test
	public void test03() throws IOException {
		final File expected = new File("expectedShakespeareOut.txt");
		final File output = new File("actualShakespeareOut.txt");
		final File input = new File("shakespeare.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(input, output);
		Assert.assertTrue("Files are not the same.", same);
	}
	
	@Test
	public void test04() throws IOException {
		final File expected = new File("expectedShelOut.txt");
		final File output = new File("actualShelOut.txt");
		final File input = new File("shel.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(input, output);
		Assert.assertTrue("Files are not the same.", same);
	}
	
	public boolean testEquals(File first, File second) throws IOException{
		FileReader readFirst = new FileReader(first);
		FileReader readSecond = new FileReader(second);
		BufferedReader breadFirst = new BufferedReader(readFirst);
		BufferedReader breadSecond = new BufferedReader(readSecond);
		
		String firstWord = " ";
		String secondWord = " ";
		while((firstWord = breadFirst.readLine()) != null && (secondWord = breadSecond.readLine()) != null){
			if(!firstWord.equals(secondWord))
				return false;
		}
		return true;
	}

}
