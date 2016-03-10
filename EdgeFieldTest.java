import static  org.junit.Assert.*;
import main.EdgeField;


import org.junit.Before;
import  org.junit.Test;


public class EdgeFieldTest{
	EdgeField  testObj;
	
	@Before
	public void  setUp() throws Exception{
	  testObj = new EdgeField("1|Bob");
	}
	
	@Test
	public void testSetGetTableID(){
		testObj.setTableID(123);
		assertEquals("tableID was set to 123",123,testObj.getTableID());
	}

	@Test
	public void testGetNumFigure(){
		assertEquals("numFigure was instalized as 1",1,testObj.getNumFigure());
	}

	@Test
	public void testGetName(){
		assertEquals("name was instalized as 'Bob'","Bob",testObj.getName());
	}

	@Test
	public void testSetGetTableBound(){
		testObj.setTableBound(20);
		assertEquals("tableBound was set to 20",20,testObj.getTableBound());
	}
}//End of  Test
