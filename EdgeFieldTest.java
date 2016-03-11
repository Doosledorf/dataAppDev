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
	@Test
	public void testSetGetFieldBound(){
		testObj.setFieldBound(20);
		assertEquals("fieldBound was set to 20",20,testObj.getFieldBound());
	}
	
	@Test
	public void testSetGetDisallowNull(){
		testObj.setDisallowNull(true);
		assertEquals("disallowNull was set to True",true,testObj.getDisallowNull());
	}

	@Test
	public void testSetGetIsPrimaryKey(){
		testObj.setIsPrimaryKey(true);
		assertEquals("isPrimaryKey was set to True",true,testObj.getIsPrimaryKey());
	}

	@Test
	public void testSetGetDefaultValue(){
		testObj.setDefaultValue("Word");
		assertEquals("defaultValue was set to 'Word'","Word",testObj.getDefaultValue());
	}

	@Test
	public void testSetGetVarcharValue(){
		testObj.setVarcharValue(123);
		assertEquals("varcharValue was set to 123",123,testObj.getVarcharValue());
	}

	@Test
	public void testSetGetDataType(){
		testObj.setDataType(1);
		assertEquals("dataType was set to 1",1,testObj.getDataType());
	}

}//End of  Test

