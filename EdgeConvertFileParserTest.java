import static  org.junit.Assert.*;

import main.EdgeField;
import main.EdgeTable;
import main.EdgeConnector;
import main.EdgeConvertFileParser;

import org.junit.Before;
import org.junit.Test;

public class EdgeConvertFileParserTest{

	EdgeConvertFileParser testObj;	

	@Before
	public void setUp(){ testObj = new EdgeConvertFileParserTest("Courses.edg"); }

	@Test
	public void testParseEdgeFile(){
		testObj.parseEdgeFile();
	}

	@Test
	public void testResolveConnectors(){
		testObj.resolveConnectors();
	}

	@Test
	public void testOpenFile(){
		testObj.openFile("test.xml");
	}
}
