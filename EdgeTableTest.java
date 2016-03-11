import static org.junit.Assert.*;
import main.EdgeTable;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest{
	EdgeTable testObj;

	@Before
	public void setUp() throws Exception{
		testObj = new EdgeTable("1|Bob");
	}
	
	@Test
	public void testGetNumFigure(){
		assertEquals("numFigure was instanilized 1",1,testObj.getNumFigure());
	}

	@Test
	public void testGetName(){
		assertEquals("name was instanilized as Bob","Bob",testObj.getName());
	}

	@Test
	public void testRelatedFieldArray(){
		testObj.addNativeField(123);
		testObj.addRelatedTable(12);
		testObj.makeArrays();
		testObj.setRelatedField(0,12);
		assertEquals("relatedFields[0] was set to 12",12,testObj.getRelatedFieldsArray()[0]);
	}

	@Test
	public void testNativeFieldArray(){
		testObj.addNativeField(123);
		testObj.makeArrays();
		testObj.addNativeField(234);
		testObj.makeArrays();
		assertEquals("nativeField[0] was set to 123",123,testObj.getNativeFieldsArray()[0]);
		testObj.moveFieldUp(1);
		assertEquals("nativeField[1] was set to 234 then moved to nativeField[0]",234,testObj.getNativeFieldsArray()[0]);
		testObj.moveFieldDown(0);
		assertEquals("nativeField[0] was set to 123, moved down now has returned to [0]",123,testObj.getNativeFieldsArray()[0]);
	}
}
