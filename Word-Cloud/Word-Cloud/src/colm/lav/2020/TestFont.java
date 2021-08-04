package 2020;

public class TestFont {

	private MyFont font;
	
	
	public void setup(){ // setup the test fixture
		font = new MyFont();
	}
	
	
	public void tearDown() {
		font = null;
	}
	
	
	public void validSetFont()throws Exception{
		font.setFont("SANS_SERIF",1, 100);
	}
	
	
	public void validSetColour()throws Exception{
		font.setColour();
	}
	
	
	public void validSetSize()throws Exception{
		font.setSize(1);
	}
	
}
