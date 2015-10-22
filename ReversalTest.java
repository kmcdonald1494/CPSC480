import java.io.*;

import org.junit.*;

public class ReversalTest {
	File curDir = new File("");
	
	@Test
	public void test01() throws IOException {
		final File expected = new File(curDir.getAbsolutePath() + "\\src\\expectedCatOut.txt");
		final File output = new File(curDir.getAbsolutePath() + "\\src\\actualCatOut.txt");
		final File input = new File(curDir.getAbsolutePath() + "\\src\\cat.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(expected, output);
		Assert.assertTrue("Files are not the same.", same);
	}
	
	@Test
	public void test02() throws IOException {
		final File expected = new File(curDir.getAbsolutePath() + "\\src\\expectedChaosOut.txt");
		final File output = new File(curDir.getAbsolutePath() + "\\src\\actualChaosOut.txt");
		final File input = new File(curDir.getAbsolutePath() + "\\src\\chaos.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(expected, output);
		Assert.assertTrue("Files are not the same.", same);
	}
	
	@Test
	public void test03() throws IOException {
		final File expected = new File(curDir.getAbsolutePath() + "\\src\\expectedShakespeareOut.txt");
		final File output = new File(curDir.getAbsolutePath() + "\\src\\actualShakespeareOut.txt");
		final File input = new File(curDir.getAbsolutePath() + "\\src\\shakespeare.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(expected, output);
		Assert.assertTrue("Files are not the same.", same);
	}
	
	@Test
	public void test04() throws IOException {
		final File expected = new File(curDir.getAbsolutePath() + "\\src\\expectedShelOut.txt");
		final File output = new File(curDir.getAbsolutePath() + "\\src\\actualShelOut.txt");
		final File input = new File(curDir.getAbsolutePath() + "\\src\\shel.txt");
		Reversal.reverseFile(input, output);
		boolean same = testEquals(expected, output);
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
