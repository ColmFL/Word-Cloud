package 2020;

public class TestFileParser {

	private FileParser fp;
	
	
	public void setup() throws Exception{ // setup the test fixture
		fp = new FileParser("new.txt");
	}
	
	
	public void tearDown() {
		fp = null;
	}
	
	
	public void validParse()throws Exception{
		fp.parse("new.txt");
	}
	
}
